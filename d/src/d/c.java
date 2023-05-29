package d;

import java.sql.Connection;
import java.sql.DriverManager;


public class c {
	public static void main(String[] args) {
		Connection con = null;
		
		
		
		String userName = "sa";
	    String password = "1";
	    String url = "jdbc:sqlserver://DESKTOP-AMLFFP5\\MSSQLSERVER01:1433;databaseName=QUANLYKHACHSAN;encrypt=true;trustServerCertificate=true;";

	    try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            con = DriverManager.getConnection(url, userName, password); 
	            System.out.println("THÀNH CÔNG");

	  } catch (Exception e)
	  {
	     e.printStackTrace();
	  }
	}
	

}
