package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.ClassRoom;

public class ClassRoomDao {
	
	private String class_path = "com.mysql.cj.jdbc.Driver";
	private String database_url = "jdbc:mysql://localhost:3306/";
	private String database_name = "cls";
	private String username = "root";
	private String password = "root";
	private Connection connection = null;
	private PreparedStatement pstmt = null;
	
	public void doConnection() {
		try {
			Class.forName(class_path);
			connection = DriverManager.getConnection(database_url+database_name ,username , password);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	//method to add classroom
	public int addClassRoom(ClassRoom classRoom) {
		doConnection();
		int row = 0;
		String Query = "insert into classroom values(?,?,?)";
		try {
			pstmt = connection.prepareStatement(Query);
			pstmt.setInt(1, classRoom.getClsId());
			pstmt.setString(2, classRoom.getClsName());
			pstmt.setInt(3, classRoom.getClsCapacity());
			row = pstmt.executeUpdate();
			System.out.println("Rows Affected : " + row);
		}catch(Exception e){
			System.out.println(e);
		}
		return row;
	}
	
	//method to delete classroom
		public int deleteClassRoom(int id) {
			doConnection();
			int row = 0;
			String Query = "delete from classroom where clsid=?";
			try {
				pstmt = connection.prepareStatement(Query);
				pstmt.setInt(1, id);
				row = pstmt.executeUpdate();
				System.out.println("Rows Affected : " + row);
			}catch(Exception e){
				System.out.println(e);
			}
			return row;
		}
		
		//method to view classroom
				public int viewClassRooms() {
					doConnection();
					int row = 0;
					String Query = "select * from classroom";
					try {
						pstmt = connection.prepareStatement(Query);
						ResultSet rs= pstmt.executeQuery();
						while(rs.next()) {
							System.out.println("------------------------------------");
							System.out.println("clsid : "+rs.getInt(1));
							System.out.println("clsname : " + rs.getString(2)) ;
							System.out.println("clscapacity : " + rs.getInt(3));
						}
					}catch(Exception e){
						System.out.println(e);
					}
					return row;
				}
		
				//method to update classroom
				public int updateClassRoom(int id , String name) {
					doConnection();
					int row = 0;
					String Query = "update classroom set clsname=? where clsid=?";
					try {
						pstmt = connection.prepareStatement(Query);
						pstmt.setString(1, name);
						pstmt.setInt(2, id);
						row = pstmt.executeUpdate();
						System.out.println("Rows Affected : " + row);
					}catch(Exception e){
						System.out.println(e);
					}
					return row;
				}
}
