package encapsulation;
import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private String name , department , education;
	private int id;
	private double salary;
	
	
	//setter
	public void setName(String n){
		name = n;
	}
	
	public void setDepartment(String d){
		department = d;
	}
	
	public void setEducation(String e){
		education = e;
	}
	
	public void setId(int i){
		id = i;
	}
	
	public void setSalary(double s){
		salary = s;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getEducation() {
		return education;
	}
	
	public int getId() {
		return id;
		}
	
	public double getSalary() {
		return salary;
	}
	
	public void acceptValue() {
		System.out.println("Enter Employee name :");
		setName(sc.next());
		
		System.out.println("Enter Employee Department :");
		setDepartment(sc.next());
		
		System.out.println("Enter Employee Education : ");
		setEducation(sc.next());
		
		System.out.println("Enter Employee ID :");
		setId(sc.nextInt());
		
		System.out.println("Enter Employee Salary :");
		setSalary(sc.nextDouble());
	}
	
	public void displayValue() {
		System.out.println(" ");
		System.out.println("Employee Name : " + getName());
		System.out.println("Employee Department : " + getDepartment());
		System.out.println("Employee Education : " + getEducation());
		System.out.println("Employee ID : " + getId());
		System.out.println("Employee Salary : " + getSalary());
	}
	
	
}
