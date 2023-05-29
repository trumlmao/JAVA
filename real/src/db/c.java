package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class c {
	
		public static void main(String[] args) {
			
			try {
				//b1 tao ket noi
				Connection connection = db.getConnection();
				// b2 tạo doi tuong statement
				Statement st = connection.createStatement();
				//b3
				System.out.println("fdsg");
			
				//dong ket noi
				db.closeConnection(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	}

