import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class BrowserGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Browser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 400);
        JTextField urlField = new JTextField("https://google.com");
        urlField.setBounds(0, 0, 408, 40);
        JTextArea resultTextArea = new JTextArea();
        
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        scrollPane.setBounds(0, 50, 513, 256);
        frame.getContentPane().setLayout(null);

        //add components to frame
        frame.getContentPane().add(urlField);
        frame.getContentPane().add(scrollPane);
        JButton loadButton = new JButton("Connect");
        loadButton.setBounds(418, 0, 95, 40);
        frame.getContentPane().add(loadButton);
        
            loadButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        URL url = new URL(urlField.getText());
                        URLConnection connection = url.openConnection();
                        connection.connect();
                        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String inputLine;
                        StringBuilder sb = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            sb.append(inputLine);
                            sb.append("\n");
                        }
                        in.close();
                        resultTextArea.setText(sb.toString());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
       
        frame.setVisible(true);
    }
}
