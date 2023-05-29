import java.sql.*;

public class jda {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // replace with your database name
        String username = "myuser"; // replace with your MySQL username
        String password = "mypassword"; // replace with your MySQL password
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            String inputUsername = "myUsername"; // replace with user input
            String inputPassword = "myPassword"; // replace with user input

            ps.setString(1, inputUsername);
            ps.setString(2, inputPassword);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                System.out.println("Welcome " +         + "!");
            } else {
                System.out.println("Invalid username or password!");
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
