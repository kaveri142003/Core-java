package inheritance;

import java.util.Scanner;

public class Car extends Vehicle{
	
	Scanner sc = new Scanner(System.in);
	
	private String car_name , car_brand , car_color , gearType;
	private int seating_capacity;
	
	//setter
	public void setCar_name(String n) {
		car_name = n;
	}
	
	public void setCar_brand(String b) {
		car_brand = b ;
	}
	
	public void setcar_color(String c) {
		car_color = c;
	}
	
	public void setGearType(String t) {
		gearType = t;
	}
	
	public void setSeatingCapacity(int s) {
		seating_capacity = s;
	}
	
	//getter
		public String getCar_name() {
			return car_name;
		}
		
		public String getCar_brand() {
			return car_brand;
		}
		
		public String getCar_color() {
			return car_color;
		}
		
		public String getGearType() {
			return gearType;
		}
		
		public int getSeating_capacity() {
			return seating_capacity;
		}
	
		public void acceptCarData() {
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println();
			System.out.println("Enter Car Data =>");
			System.out.println();
			System.out.println("Enter car Brand : ");
			setCar_brand(sc.next());
			System.out.println("Enter Car name : ");
			setCar_name(sc.next());
			System.out.println("Enter car color : ");
			setcar_color(sc.next());
			System.out.println("Enter car gear type : ");
			setGearType(sc.next());
			System.out.println("Enter seating capacity :");
			setSeatingCapacity(sc.nextInt());
		}
		
		public void displayCarData() {
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.println("Car Brand : " + getCar_brand());
			System.out.println("Car name : " + getCar_name());
			System.out.println("Car color : " + getCar_color());
			System.out.println("Car gear type : " + getGearType());
			System.out.println("Car seating Capacity : " + getSeating_capacity());
		}
		
		Car(){
			acceptCarData();
			displayVehicleData();
			displayCarData();
		}
}
