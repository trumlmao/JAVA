package swing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class server {
	public static final int PORT = 1234;
	private BlockingDeque<String> messageQueue = new LinkedBlockingDeque<>();
	private JTextField textField;
	
	public server() {
		JFrame frame = new JFrame("server");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 325, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(341, 9, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 40, 416, 213);
		frame.getContentPane().add(textArea);
		
		new Thread(() -> {
            try (ServerSocket server = new ServerSocket(PORT)) {
                 textArea.append("Server started on port " + PORT + "\n");

                while (true) {
                    Socket clientSocket = server.accept();
                    textArea.append("Connected to client: " + clientSocket.getInetAddress() + "\n");

                    thread clientThread = new thread(clientSocket, messageQueue);
                    new Thread(clientThread).start();
                }
            } catch (IOException e) {
                messageQueue.add("Error: " + e.getMessage());
            }
        }).start();
		
		new Thread(() ->{
			while (true) {
				try {
					String mes = messageQueue.take();
					textArea.append(mes);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}).start();
		
		
		
	}private static class thread implements Runnable {
		private Socket clientsocket;
		private BlockingQueue<String> messageQueue;
		private BufferedReader in ;
		private PrintWriter out;
		
		public thread(Socket clientsocket, BlockingQueue<String> messageQueue) {
			this.clientsocket = clientsocket;
			this.messageQueue = messageQueue;
		}
		
			public void run() {
				
				try {
					in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
					out = new PrintWriter(new OutputStreamWriter(clientsocket.getOutputStream()));
					
					String inputline;
					
					while ((inputline = in.readLine()) != null) {
						messageQueue.add("Client: " + inputline);
						out.println("Server: " +inputline);
						
					}
					in.close();
					out.close();
					clientsocket.close();
				} catch (IOException e) {
					e.printStackTrace();
					
					// TODO: handle exception
				}
			}
		};
		public static void main(String[] args) {
			new server();
		}
}
