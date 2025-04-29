package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);
	
	private static ArrayList student = new ArrayList();
	
	private String name ;
	private int age;
	
	Student(){
		acceptValue();	
		student.add(this);
	}
	
	Student(String name , int age){
		setName(name);
		setAge(age);
		student.add(this);
	} 
		
	
	public void acceptValue() {
		System.out.println("Enter Student Details : ");
		System.out.print("Enter Student name : ");
		setName(sc.next());
		System.out.print("Enter Student age : ");
		setAge(sc.nextInt());
		
	}
	
	public void displayValue() {
		System.out.println();
		System.out.println("Student Details :");
		System.out.println("Name : " +getName() + " , Age : " + getAge());
	}
	
	public static void printArrayList() {
		Iterator itr = student.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			Student s = (Student)(o);
			s.displayValue();
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
