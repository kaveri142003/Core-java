package methodOverriding;

public abstract class Employee10 {
	
	String name;
	String address;
	String jobTitle;
	double salary;
	
	public Employee10(String name , String address , String jobTitle , double salary) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public  double calBonus(double salary , double allowance , float bonusPercent) {
		double bonus = ( salary + allowance ) * bonusPercent;
		return bonus;
	}
	
	
	public abstract void performReport();
	public abstract void manageProject();
	
	public void display() {
		System.out.println("Name : " + name + " , Address : " + address + " , Job Title : " + jobTitle + " , Salary : " + salary);
	}
}
