package gui;
import java.awt.Menu;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;
public class sinhvien {
	public static String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static String url = "jdbc:sqlserver://DESKTOP-AMLFFP5\\MSSQLSERVER01:1433;databaseName=ee;encrypt=true;trustServerCertificate=true;";
	public static String user = "sa";
	public static String pass = "1";
	
	
	public static  Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(sinhvien.drivername);
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
			Connection conn = getConnection();
		java.sql.Statement st = conn.createStatement();
		String query = "select* from sinhvien";
		ResultSet rs = st.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();

		int columnsNumber = rsmd.getColumnCount();
		ResultSetMetaData rsmd1 = rs.getMetaData();
		int columnsNumber1 = rsmd1.getColumnCount();                     

		// Iterate through the data in the result set and display it. 

		while (rs.next()) {
		//Print one row          
		for(int i = 1 ; i <= columnsNumber1; i++){

		      System.out.print(rs.getString(i) + " "); //Print one element of a row

		}

		  System.out.println();//Move to the next line to print the next row.           

		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
public static void them() {
		
	}
	public void truyvan() {
		try {
			Class.forName("jdbc:sqlserver://DESKTOP-AMLFFP5\\\\MSSQLSERVER01:1433;databaseName=ee;encrypt=true;trustServerCertificate=true;");
			Connection conn = sinhvien.getConnection();
			java.sql.Statement st = (java.sql.Statement) conn.createStatement();
			String query = "select* from sinhvien";
			ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			String[] colName  = new String[cols];
			for(int i = 0;i<cols;i++) {
				colName[i] = rsmd.getColumnName(i+1);
				
				int columnsNumber = rsmd.getColumnCount();                     

				// Iterate through the data in the result set and display it. 

				while (rs.next()) {
				//Print one row          
				for(int i1 = 1 ; i1 <= columnsNumber; i1++){

				      System.out.print(rs.getString(i1) + " "); //Print one element of a row

				}

				  System.out.println();//Move to the next line to print the next row.           

				    }
	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void MENU2() {
		System.out.println("1./Nhap");
		System.out.println("2./TruyVan");
		System.out.println("3./Them");
		System.out.println("4./Sua");
		System.out.println("5./Xoa");
		
		Scanner sc = new Scanner(System.in);
		int ck = sc.nextInt();
		switch (ck) {
		case 1:{
			System.out.println("LOL");
			try {
				
				prininfor(getConnection());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		
		}
			
			
		case 2:{
			sinhviendb svn = new sinhviendb();
			String name = sc.next();
			String id = sc.next();
			int age = sc.nextInt();
			DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			Calendar obj = Calendar.getInstance();
			String create_at = dfor.format(obj.getTime()).toString();
			String update_at = dfor.format(obj.getTime()).toString();
			java.util.Date utilDate = new java.util.Date();
			java.sql.Timestamp time = new java.sql.Timestamp(utilDate.getTime());
			svn.setName(name);
			svn.setId(id);
			svn.setAge(age);
			svn.setCreate_at(create_at);
			svn.setUpdate_at(update_at);
			try {
				Connection conn = sinhvien.getConnection();
				
				java.sql.Statement st = conn.createStatement();
				String query = "INSERT INTO sinhvien(id,namee,age,create_at,update_at)\r\n"
						+ "Values('"+svn.getId()+"','" +svn.getName()+"','" +svn.getAge()+"','"+time+"','"+time+"')";
				System.out.println(query);
				int rs =  st.executeUpdate(query);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
			
			
		default:
			break;
		}
	}
	public static void main(String[] args) {
		MENU2();
		
		
		
		
	}
	

}


;


