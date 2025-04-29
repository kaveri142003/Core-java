package methodOverriding;

public class CompanyDemo {
	public static void main(String[] args) {
		
		Manager manager = new Manager("Rushikesh" , "Pirangut" , "Manager" , 90000 , 5);
		Developer developer = new Developer("Nishchal" , "Varangaon" , "Developer" , 50000 , "MERN Stack");
		Programmer programmer = new Programmer("Kaveri" , "Sinnar" , "Programmer" , 40000 , "Java");
		
		manager.display();
		manager.calBonus(90000, 50000, 20);
		manager.performReport();
		manager.manageProject();
		
		System.out.println();
		
		developer.display();
		developer.calBonus(50000, 20000, 10);
		developer.performReport();
		developer.manageProject();
		
		System.out.println();
		
		programmer.display();
		programmer.calBonus(40000, 10000, 5);
		programmer.performReport();
		programmer.manageProject();
		
	}
}
