package practical;

import java.util.Scanner;



public class Employee extends Person{
	
	Scanner sc = new Scanner(System.in);
	
	private String post;
	private double salary;
	private static Employee employee[] = new Employee[5];  //static becz. it create seprate copy of each variable
	private static int count =0;
	
	//setters
	public void setPost(String p) {
		post = p;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	//getters
	public String getPost() {
		return post;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	//non-parameterized constructor
	Employee(){
		this.acceptPerson();
		addToArray();
	}
	
	//parameterized constructor - 1
	Employee(String p , double s){
		super();
		setPost(p);
		setSalary(s);
		addToArray();
	}
	
	//parameterized constructor - 2
		Employee(String n , int a , String p, double s ){
			super(n, a);
			setPost(p);
			setSalary(s);
			addToArray();
		}
	
	
    //method to add data to array using objects
	private void addToArray() {
		if(count > employee.length-1) {
			System.out.println("Array is Full");
		}else {
			employee[count++]=this;
		}
	}
	
	
	//method to display array data
	public static void printData() {
		for(Employee e:employee) {
			e.displayPerson();
//			System.out.println(e); //calling toString() method implicitly
//			System.out.println(e.toString()); //calling toString() method explicitly
		}
	}
	
	
	//method to accept Employee data
	@Override
	public void acceptPerson() {
		super.acceptPerson();
		System.out.println("Enter Employee Post : ");
		setPost(sc.nextLine());
		System.out.println("Enter Employee Salary : ");
		setSalary(sc.nextDouble());
	}
	
	//method to display Employee data
	@Override
	public void displayPerson() {
		super.displayPerson();
		System.out.println("Employee Post : " + getPost());
		System.out.println("Employee Salary : " + getSalary());
	}
	
	@Override
	public String toString() {
		return super.toString() + "  " + "POST : " +getPost() + "      " + "SALARY : " + getSalary();
	}
	
	public static void sortData(){
		for(int k=0 ; k<employee.length ; k++) {
			for (int j=k+1 ; j<employee.length ; j++) {
				if(employee[k].salary> employee[j].salary) {
					Employee t = employee[k];
					employee[k] = employee[j];
					employee[j]=t;
				}
			}
		}
		
	}
	
}
