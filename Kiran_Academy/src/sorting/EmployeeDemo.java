package sorting;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e[] = new Employee[3];
		
		Employee e1= new Employee();
		e1.acceptData(e);
		e1.displayData(e);
		System.out.println();
		System.out.println("Sorted Data");
		Employee.sortData(e);
		e1.displayData(e);

	}

}
