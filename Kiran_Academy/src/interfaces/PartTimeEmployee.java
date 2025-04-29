package interfaces;

public class PartTimeEmployee implements Employee{
	
	private int empid , hourWorked;
	private String name ;
	private double hourlyRate ;
	
	PartTimeEmployee(int empid , int hourWorked , String name , double hourlyRate){
		this.empid = empid;
		this.hourWorked = hourWorked;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateSalary() {
		double salary ;
		return salary = hourWorked * hourlyRate;
	}
	
	public String getEmployeeDetails() {
		return "Name : " +name +" , ID :" + empid + " , salary : " + calculateSalary();
	}
	
}
