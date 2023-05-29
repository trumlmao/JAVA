package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	public static String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static String url = "jdbc:sqlserver://DESKTOP-AMLFFP5\\MSSQLSERVER01:1433;databaseName=QUANLYKHACHSAN;encrypt=true;trustServerCertificate=true;";
	public static String user = "sa";
	public static String pass = "1";
	
	
	public static  Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(db.drivername);
		Connection con  = DriverManager.getConnection(url, user, pass);
		return con;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void prininfor(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
};
