package com.services;

import com.dao.ClassRoomDao;
import com.entity.ClassRoom;

public class ClassRoomServices {
	
	ClassRoomDao dao = new ClassRoomDao();

	//method to add classRoom
	public void addClassRoom(ClassRoom classRoom) {
		if(dao.addClassRoom(classRoom)>0) {
			System.out.println("Data Inserted SuccessFully!!");
		}else {
			System.out.println("Data not inserted..");
		}
		
	}
	
	//method to delete ClassRoom
	public void deleteClassRoom(int id) {
		if(dao.deleteClassRoom(id)>0) {
			System.out.println("Data Deleted SuccessFully!!");
		}else {
			System.out.println("Data not deleted..");
		}
		
	}
	
	//method to view ClassRoom
		public void viewClassRooms() {
			dao.viewClassRooms();
		}
		
	//method to update ClassRoom
		public void updateClassRoom( int id , String name ) {
			if(dao.updateClassRoom(id , name)>0) {
				System.out.println("Data updated succesfully !!");
			}else {
				System.out.println("Data not updated");
			}
		}
}
