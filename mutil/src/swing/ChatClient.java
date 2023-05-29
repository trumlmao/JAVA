 package swing;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient extends JFrame implements ActionListener {
    public static final String HOST = "localhost";
    public static final int PORT = 1234;
    
    private JTextField inputField = new JTextField(20);
    private JButton sendButton = new JButton("Send");
    private JTextArea messageArea = new JTextArea(8, 40);

    private BlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();
    private BufferedReader in;
    private PrintWriter out;

    public ChatClient() {
        super("Chat Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new JScrollPane(messageArea), BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(inputField);
        bottomPanel.add(sendButton);
        add(bottomPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);

        inputField.addActionListener(this);
        sendButton.addActionListener(this);

        new Thread(() -> {
            try {
                Socket socket = new Socket(HOST, PORT);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

                while (true) {
                    String message = messageQueue.take();
                    messageArea.append(message + "\n");
                }
            } catch (IOException e) {
                messageQueue.add("Error: " + e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton || e.getSource() == inputField) {
            String inputLine = inputField.getText();
            inputField.setText("");
            out.println(inputLine);
            messageQueue.add("You: " + inputLine);
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}
