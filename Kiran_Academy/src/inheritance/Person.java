package inheritance;

import java.util.Scanner;

public class Person {
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int age ;
	private long mobile;
	
	
	//getters
	public void getName(String n) {
		name = n;
	}
	
	public void getAge(int a) {
		age = a;
	}
	
	public void getMobile(int m) {
		mobile = m;
	}
	
	//setters
	public String setName() {
		return name;
	}
	
	public int setAge() {
		return age;
	}
	
	public long setMobile() {
		return mobile;
	}
	
	
	
	public void acceptData(String n , int a , long m) {
		System.out.print("Enter Person name : ");
		name = sc.next();
		System.out.print("Enter Person age : ");
		age=sc.nextInt();
		System.out.println("Enter Person Mobile  : ");
		mobile=sc.nextLong();
	}
	
	public void displayData() {
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Person Data");
		System.out.println("Person Name : " + name);
		System.out.println("Person age : " + age);
		System.out.println("Person Mobile : " + mobile);
	}
	
	//constructor
		Person(){
		}
}
