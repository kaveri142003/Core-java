package interfaces;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new FullTimeEmployee(10 , 50000 , "Rushikesh" , "Google");
		System.out.println("Full Time Employee");
		System.out.println();
		String s = e1.getEmployeeDetails();
		System.out.println(s);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Part Time Employee");
		System.out.println();
		Employee e2 = new PartTimeEmployee(11 , 9 , "Rohan" , 500);
		String s1 = e2.getEmployeeDetails();
		System.out.println(s1);
	}

}
