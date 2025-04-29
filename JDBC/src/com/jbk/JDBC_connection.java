package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_connection {
	
	private String class_path = "com.mysql.cj.jdbc.Driver";
	private String database_url = "jdbc:mysql://localhost:3306/";
	private String database_name = "cls";
	private String username = "root";
	private String password = "root";
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement pstmt = null;
	private ResultSet result = null;
	private String query = null;
	private String clsname = null;
	private int clsid = 0 , clscapacity = 0 , row = 0;
	
	//constructor to call methods
	public JDBC_connection(){
		//getdata();
		//insertData();
		//deleteData();
		//updateData();
	}
	
	
	//method to establish database connection
	private void doConnection() {
		try {
			Class.forName(class_path);
			connection = DriverManager.getConnection(database_url+database_name ,username , password);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	//method to close connection
	private void closeConnection() {
		try {
			pstmt.close();
			statement.close();
			connection.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//method to read data from database
	public void getdata() {
		try {
			doConnection();
			query = "select * from classroom";
			statement = connection.createStatement();
			result = statement.executeQuery(query);
			while(result.next()) {
				System.out.println("-----------------------------------");
				System.out.println("clsid : " + result.getInt(1));
				System.out.println("clsname : " + result.getString(2));
				System.out.println("clscapacity : " + result.getInt(3));
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			closeConnection();
		}
	}
	
	//method to insert data into database
	public void insertData() {
		try {
			doConnection();
			acceptData();
            query = "insert into classroom values (" + clsid + ", '" + clsname + "', " + clscapacity + ")";
			statement = connection.createStatement();
			row = statement.executeUpdate(query);
			System.out.println("Rows Affected : " + row);
			System.out.println("Data Inserted Successfully !!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//method to delete data from database
	public void deleteData() {
		try {
			doConnection();
			query = "delete from classroom where clsname='React'";
			statement = connection.createStatement();
			row = statement.executeUpdate(query);
			System.out.println("Rows Affected : " + row);
			System.out.println("Data deleted SuccessFully !!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//method to update data from database
	public void updateData() {
		try {
			doConnection();
			query = "update classroom set clsid=9 , clsname='Express.js' , clscapacity=25 where clsname='bdsb'";
			statement = connection.createStatement();
			row = statement.executeUpdate(query);
			System.out.println("Rows Affected : " + row);
			System.out.println("Data Updated SuccessFully !!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//method to accept data from user 
	private void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter classroom ID :");
		clsid = sc.nextInt();
		System.out.println("Enter Classroom Name : ");
		clsname = sc.next();
		System.out.println("Enter Classroom Capacity : ");
		clscapacity = sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBC_connection a = new JDBC_connection();
	}

}
