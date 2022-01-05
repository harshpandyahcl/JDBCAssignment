package com.javaconnection.database;
import java.sql.*;
public class DBconnect {

	static Connection conn;
	public static Connection createc() {
		
		try {
			

			String user = "root";
			String password = "P@ndya6909"; 
			String url = "jdbc:mysql://localhost:3307/employeedb";
			conn = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}

;