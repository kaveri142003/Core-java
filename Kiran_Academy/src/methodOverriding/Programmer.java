package methodOverriding;

public class Programmer extends Employee10{
	
	String lang;
	
	public Programmer(String name , String address , String jobTitle , double salary, String lang) {
		super(name, address, jobTitle, salary);
		this.lang = lang;
	}
	
	@Override
	public  double calBonus(double salary , double allowance , float bonusPercent) {
		double bonus = ( salary + allowance ) * bonusPercent;
		System.out.println("Bonus : " + bonus);
		return bonus;
	}
	
	@Override
	public void performReport() {
		System.out.println("Good Performance");
	}
	
	@Override
	public void manageProject() {
		System.out.println("Programmer is " + lang + " Programmer");
	}
	
	@Override
	public void display() {
		System.out.println("Name : " + name + " , Address : " + address + " , Job Title : " + jobTitle + " , Salary : " + salary);
	}
}
