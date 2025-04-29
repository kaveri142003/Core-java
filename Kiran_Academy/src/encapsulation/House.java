package encapsulation;
import java.util.Scanner;

public class House {
	Scanner sc = new Scanner(System.in);
	private String address;
	private int noOfRooms;
	private double area;
	double rate;

	
	//setter
	public void setAddress(String a) {
		address = a;
	}
	
	public void setnoOfRooms(int r) {
		noOfRooms = r;
	}
	
	public void setArea(double a) {
		area = a;
	}
	
	//getter
	public String getAddress() {
		return address;
	}
	
	public int getnoOfRooms() {
		return noOfRooms;
	}
	
	public double getArea() {
		return area;
	}
	
	public void calculateArea() {
		System.out.println("Enter Address: ");
		setAddress(sc.nextLine());
		
		System.out.println("Enter no of rooms: ");
		setnoOfRooms(sc.nextInt());
		
		System.out.println("Enter Area:");
		setArea(sc.nextDouble());
		
		System.out.println("Enter Rate:");
		rate = sc.nextDouble();
		
	}
	
	public void display() {
		System.out.println(" ");
		System.out.println("Address : " + getAddress());
		System.out.println("No of Rooms : " + getnoOfRooms());
		System.out.println("Price : " + getArea());
		System.out.println("Rate : " + rate);
		System.out.println("House Price : "+ area*rate);
	}
	
}
