package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtill {

	public static Connection provideConnection() { 
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Probelm with loading the driver main class...!");
		}
		String s = "jdbc:mysql://localhost:3306/db3";
		
		try {
			conn = DriverManager.getConnection(s, "root", "12345");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
		
	}

}
