package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		//Loading mysql jdbc driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		
		//connection with database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cls" , "root" , "root");
		System.out.println(3);
		
		//prepare statement for insert
//		String sql = "insert into classroom values(6 , 'React' , 20)";
//		PreparedStatement pstmt = connection.prepareStatement(sql);
//		System.out.println(4);
//		pstmt.executeUpdate();
//		System.out.println("Data inserted Successfully !!");
		
		//Statement for read 
//		String read = "select * from classroom";
//		Statement ss = connection.createStatement();
//		ResultSet rs = ss.executeQuery(read);
//		while(rs.next()) {
//			System.out.println("-----------------------------");
//			System.out.println("clsid : " + rs.getInt(1));
//			System.out.println("clsname : " + rs.getString(2));
//			System.out.println("clscapacity : " + rs.getInt(3));
//		}
		
	}

	
}
