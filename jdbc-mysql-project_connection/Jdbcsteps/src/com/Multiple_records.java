package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Multiple_records {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_stepd?user=root && password=root");
		Statement st=con.createStatement();
		st.executeUpdate("INSERT INTO student VALUES(201,'rahul',160.5),(202,'riya',170.5),(203,'anil',180.5)");
		System.out.println("multiple records addede....");
	}

}
