package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class manger lodaded and registered");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root && password=root");
			System.out.println("Connection Established");
			System.out.println(con);
			Statement st=con.createStatement();
			System.out.println("platform created..");
			st.execute("create table jdbc_stepd.student(sid int,sname varchar(30),smarks double)");
			System.out.println("table created...");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	
	
	}
}
