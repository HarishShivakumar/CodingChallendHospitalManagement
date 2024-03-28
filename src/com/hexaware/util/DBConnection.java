package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnection {
	
	static Connection conn;
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/hospitalmanagement";
		System.out.println("Entering into DB --- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
//		s.close();
		
//		String username = "root";
//		String password = "123456";
		
		conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
}
