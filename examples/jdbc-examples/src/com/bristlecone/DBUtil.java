package com.bristlecone;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class DBUtil {
	public static Connection getConnection() {
		try {
			Class.forName(Driver.class.getName());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appdb", "root", "root");
			return con;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
