package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static Connection getConnection() 
	{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		return con;
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block

		e.printStackTrace();
		return null;
	}
	}
}
