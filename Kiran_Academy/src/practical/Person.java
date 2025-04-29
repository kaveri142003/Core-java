package practical;

import java.util.Scanner;

public class Person {
	
	Scanner sc = new Scanner(System.in);
	
	private String name ;
	private int age ;
	
	//setter
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//non-parameterized constructor
	Person(){
		acceptPerson();
	}
	
	
	//parameterized constructor
	Person(String n , int a){
		setName(n);
		setAge(a);
	}
	
	
	//method to accept person data
	public void acceptPerson() {
		System.out.println("Enter person details :");
		System.out.println("Enter Person name : ");
		setName(sc.nextLine());
		System.out.println("Enter person age : ");
		setAge(sc.nextInt());
	}
	
	
	//method to display person data
	public void displayPerson() {
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Person Details :");
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
	}
	
	@Override
	public String toString() {
		return "NAME : " +getName() + "   " + "AGE : " + getAge();
	}
}
