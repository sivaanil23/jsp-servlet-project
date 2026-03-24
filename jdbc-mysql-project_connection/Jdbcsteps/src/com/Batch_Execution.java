package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Execution {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_stepd?user=root&&password=root");
			Statement st=con.createStatement();
			String q1="insert into student values(102,'riya',50.5)";
			String q2="update  student set smarks=99 where sname in('riya')";
			String q3="delete from student where sname='riya'";
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.executeBatch();
			System.out.println("batch process created..");
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
