package methodOverriding;

public class Developer extends Employee10{
	
	String programLang;
	
	public Developer(String name , String address , String jobTitle , double salary , String programLang) {
		super(name, address, jobTitle, salary);
		this.programLang = programLang;
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
		System.out.println("Developing 2 projects in " + this.programLang);
	}
	
	@Override
	public void display() {
		System.out.println("Name : " + name + " , Address : " + address + " , Job Title : " + jobTitle + " , Salary : " + salary);
	}

}
