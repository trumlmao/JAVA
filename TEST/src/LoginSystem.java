import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSystem extends JFrame implements ActionListener {

    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton loginButton = new JButton("Log In");
    private JLabel messageLabel = new JLabel("");

    /**
     * 
     */
    public LoginSystem() {
        setTitle("Login System");
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);

        loginButton.addActionListener(this);
        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("myUsername") && password.equals("myPassword")) {
            messageLabel.setText("Welcome " + username + "!");
        } else {
            messageLabel.setText("Invalid username or password!");
        }
    }
}
