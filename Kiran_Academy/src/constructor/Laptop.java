package constructor;

import java.util.Scanner;

public class Laptop {
	
	Scanner sc = new Scanner(System.in);
	
	private String name , processor,ram;
	
	//setter
	public void setName(String n) {
		name=n;
	}
	
	public void setProcessor(String b) {
		processor=b;
	}
	
	public void setRam(String r) {
		ram=r;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public String getRam() {
		return ram;
	}
	
	
	//non-parameterized constructor
	Laptop(){
		acceptValue();
		display();
	}
	
	
	//parameterized Constructor
	Laptop(String n , String p , String r){
		name = n;
		processor = p;
		ram = r;
		display();
	}
	
	//accept method
	public void acceptValue() {
		System.out.println("Enter Brand name: ");
		setName(sc.nextLine());
		
		System.out.println("Enter Processor: ");
		setProcessor(sc.nextLine());
		
		System.out.println("Enter Ram Size : ");
		setRam(sc.nextLine());
	}
	
	//display method
	public void display() {
		System.out.println(" ");
		System.out.println("Brand Name : " + getName());
		System.out.println("Processor name : " + getProcessor());
		System.out.println("Ram Size : " + getRam());
	}
}
