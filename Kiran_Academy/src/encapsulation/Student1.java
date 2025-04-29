package encapsulation;

import java.util.Scanner;

public class Student1 {
	
	Scanner sc = new Scanner(System.in);
	private String student_name;
	private String college_name;
	private long stu_mobile;
	
	//setter 
	public void setName(String name ) {
		student_name= name ;
	}
	
	public void setCollegeName(String college) {
		college_name = college;
	}
	
	public void setMobile(long number) {
		stu_mobile = number;
	}
	
	
	//getter
	public String getStudentName() {
		return student_name;
	}
	
	public String getCollegeName() {
		return college_name;
	}
	
	public long getMobile() {
		return stu_mobile;
	}
	
	public void acceptValue() {
		System.out.println("Enter Student name: ");
	    student_name = sc.nextLine();
	    
	    System.out.println("Enter Student College name :");
	    college_name = sc.nextLine();
	    
	    System.out.println("Enter Student mobile number :");
	    stu_mobile = sc.nextLong();
	}
	
	public void getDetails1() {
		
		System.out.println("Student Details :");
		System.out.println("student name: "+student_name);
		System.out.println("college name: "+college_name);
		System.out.println("student mobile: "+stu_mobile);
	}
}
