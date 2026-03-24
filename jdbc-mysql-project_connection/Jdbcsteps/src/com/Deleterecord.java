package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleterecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_stepd?user=root && password=root");
		Statement st=con.createStatement();
		st.executeUpdate("Delete from student where sid=101");
		System.out.println("record deleted..");
		
	}

}
