package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/JavaDB";
		String uname = "root";
		String pass = "password";
		try 
		{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Successful"+con);
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

}
