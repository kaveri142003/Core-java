package interfaces;

import java.util.Scanner;

public class FullTimeEmployee implements Employee {
	
	Scanner sc = new Scanner(System.in);
	private double salary;
	private int id;
	private String name , company;
	
	FullTimeEmployee(int id , double salary , String name , String company){
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.company = company;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public String getEmployeeDetails() {
		return "Name : " +name +" , ID :" + id + " , company : " + company + " , salary : " + calculateSalary();
	}
}
