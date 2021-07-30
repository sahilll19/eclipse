package com.cg.jdbc.ui;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "root";
		String pass = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDatabaseProductVersion());
		System.out.println(dmd.getDriverName());
		
		System.out.println("connected");
		

	}

}
