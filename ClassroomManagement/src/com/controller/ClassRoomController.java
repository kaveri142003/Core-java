package com.controller;

import java.util.Scanner;

import com.entity.ClassRoom;
import com.services.ClassRoomServices;

public class ClassRoomController {


	public static void main(String[] args) {
		ClassRoomServices ss = new ClassRoomServices();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choices are below :");
		System.out.println("1. Insert Data");
		System.out.println("2. Delete Data");
		System.out.println("3. Update Data");
		System.out.println("4. View Data");
		
		System.out.println();
		System.out.println("Enter your Choice :");
		int choice =  sc.nextInt();
		
		switch(choice) {
			case 1: System.out.println("Enter clsid , clsname and clscapacity :");
					ClassRoom cls = new ClassRoom(sc.nextInt(),sc.next(),sc.nextInt());
					ss.addClassRoom(cls);
					break;
			case 2: System.out.println("Enter id to be deleted : ");
			        ss.deleteClassRoom(sc.nextInt());
			        break;
			case 3 : System.out.println("Enter id where update will happen & name to update : ");
			         ss.updateClassRoom( sc.nextInt(), sc.next() );
			         break;
			case 4: ss.viewClassRooms();
					break;
			default : System.out.println("Invalid Choice");
		}
	}
}
