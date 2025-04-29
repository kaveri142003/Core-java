package encapsulation;
import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	
	private String student_name;
	private String college_name;
	private long stu_mobile;
	
	public void setDetails() {
		System.out.println("Enter Student name: ");
	    student_name = sc.nextLine();
	    
	    System.out.println("Enter Student College name :");
	    college_name = sc.nextLine();
	    
	    System.out.println("Enter Student mobile number :");
	    stu_mobile = sc.nextLong();
	}
	
	public void getDetails() {
		
		System.out.println("Student Details :");
		System.out.println("student name: "+student_name);
		System.out.println("college name: "+college_name);
		System.out.println("student mobile: "+stu_mobile);
	}
	
	
	
	
}
