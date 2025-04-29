package methodOverriding;

public class HRManager extends Employee{
	@Override
	public void work() {
		super.work();
		System.out.println("Work under HR");
	}
	
	public void addEmployee() {
		System.out.println("You can add New employee in this method");
	}
}
