package practical;


public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Rushikesh" , 21 , "Developer" , 50000);
		Employee e2 = new Employee("Nishchal" , 22 , "Tester" , 30000);
		Employee e3 = new Employee("Kaveri" , 23 , "Developer" , 45000);
		Employee e4 = new Employee("Trupti" , 24 , "Clerk" , 10000);
		Employee e5 = new Employee("Manasi" , 25 , "HR" , 80000);
		
		Employee.printData();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Sorted Data :");
		Employee.sortData();
		Employee.printData();
  }
}
