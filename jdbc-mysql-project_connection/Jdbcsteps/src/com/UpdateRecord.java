package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String qur="update student set smarks=82.8 where sid=101";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_stepd?user=root && password=root");
			Statement st =con.createStatement();
			
			st.executeUpdate(qur);
			st.executeUpdate("update student set  sname='riya' ,smarks=50.5 where sid=102");
			st.executeUpdate("Delete from student where sid=103");
			System.out.println("record updated....");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
