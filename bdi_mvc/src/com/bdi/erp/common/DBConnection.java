package com.bdi.erp.common;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	private static Properties prop;
	private static Connection con;
	
	static {		// 생성자를 만들기 전부터 이미 로딩 되어 있음/ 반드시 한번은 실행되어야할때
		prop = new Properties();
		String path = "/config/db.properties";
		InputStream is = DBConnection.class.getResourceAsStream(path);
		
		try {
			prop.load(is);
			System.out.println(prop.getProperty("driver"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		if(con==null) {
			try {
				Class.forName(prop.getProperty("driver"));
				con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("id"), prop.getProperty("pwd"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static void close() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con = null;
	}
	
	public static void main(String[] args) {
		getCon();
		close();
		
		}
}
