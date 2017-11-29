package com.itsol.dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class OracleConn {
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public final static String USER = "bachct";
	public final static String PASS = "123456";

	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database ...");
			System.out.println();
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
		

}
