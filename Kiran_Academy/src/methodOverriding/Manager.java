package methodOverriding;

public class Manager extends Employee10{

		int teamSize;
	
		public Manager(String name , String address , String jobTitle , double salary , int teamSize) {
			super(name, address, jobTitle, salary);
			this.teamSize = teamSize;
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
			System.out.println("Manages 5 projects");
		}
		
		@Override
		public void display() {
			System.out.println("Name : " + name + " , Address : " + address + " , Job Title : " + jobTitle + " , Salary : " + salary);
		}
}
