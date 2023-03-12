package com.leedaeho.webexam01.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection(String driver, String url, String userName, String pwd) {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userName,pwd);
		} catch (Exception e) {
		e.printStackTrace();	
		}
		return con;
		
	}
}
