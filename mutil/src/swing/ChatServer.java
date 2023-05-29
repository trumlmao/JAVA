package swing;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import javax.swing.*;

public class ChatServer {
    public static final int PORT = 1234;
    
    private BlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();

    public ChatServer() {
        JFrame frame = new JFrame("Chat Server");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea messageArea = new JTextArea(8, 40);
        frame.add(new JScrollPane(messageArea));
        frame.pack();
        frame.setVisible(true);

        new Thread(() -> {
            try (ServerSocket server = new ServerSocket(PORT)) {
                messageArea.append("Server started on port " + PORT + "\n");

                while (true) {
                    Socket clientSocket = server.accept();
                    messageArea.append("Connected to client: " + clientSocket.getInetAddress() + "\n");

                    ClientThread clientThread = new ClientThread(clientSocket, messageQueue);
                    new Thread(clientThread).start();
                }
            } catch (IOException e) {
                messageQueue.add("Error: " + e.getMessage());
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    String message = messageQueue.take();
                    messageArea.append(message + "\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static class ClientThread implements Runnable {
        private Socket clientSocket;
        private BlockingQueue<String> messageQueue;
        private BufferedReader in;
        private PrintWriter out;

        public ClientThread(Socket clientSocket, BlockingQueue<String> messageQueue) {
            this.clientSocket = clientSocket;
            this.messageQueue = messageQueue;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    messageQueue.add("Client: " + inputLine);
                    out.println("Server: " + inputLine);
                }

                in.close();
                out.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}
