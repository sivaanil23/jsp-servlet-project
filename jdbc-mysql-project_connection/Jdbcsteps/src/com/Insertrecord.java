package com;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertrecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_stepd?user=root && password=root");
			Statement st=con.createStatement();
			st.execute("insert into student values(101,'rahul',20.5)");
			st.execute("insert into student values(102,'riya',50.5)");
			st.execute("insert into student values(103,'anil',40.5)");
			System.out.println("data inserted");
		} catch (ClassNotFoundException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
