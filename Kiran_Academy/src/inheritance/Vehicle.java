package inheritance;

import java.util.Scanner;

public class Vehicle {
	Scanner sc = new Scanner(System.in);
	private String vehicle_type ;
	private int vehicle_length , noOFCylinders , power ,torque ;
	
	
	//getter
	public void getVehicleType(String t) {
		vehicle_type = t;
	}
	
	public void getVehicleLength(int l) {
		vehicle_length = l;
	}
	
	public void getCyclinders(int c) {
		noOFCylinders = c;
	}
	
	public void getPower(int p) {
		power = p;
	}
	
	public void getTorque(int t) {
		torque = t;
	}
	
	//setter
	public String setVehicleType() {
		return vehicle_type;
	}
	
	public int setVehicleLength() {
		return vehicle_length;
	}
	
	public int setsetCyclinders() {
		return noOFCylinders;
	}
	
	public int setPower() {
		return power;
	}
	
	public int setTorque() {
		return torque;
	}
	
	public void acceptVehicleData() {
		System.out.println("Enter Vehicle Data =>");
		System.out.println();
		System.out.println("Enter vehicle type : ");
		getVehicleType(sc.next());
		System.out.println("Enter vehicle length : ");
		getVehicleLength(sc.nextInt());
		System.out.println("Enter no of cylinders : ");
		getCyclinders(sc.nextInt());
		System.out.println("Enter vehicle power : ");
		getPower(sc.nextInt());
		System.out.println("Enter vehicle torque : ");
		getTorque(sc.nextInt());		
	}
	
	public void displayVehicleData() {
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Vehicle type : " + setVehicleType());
		System.out.println("Vehicle length : " + setVehicleLength());
		System.out.println("No of Cylinders : " + setsetCyclinders());
		System.out.println("Vehicle Power : " + setPower());
		System.out.println("Vehicle Torque : " +setTorque());
	}
	
	Vehicle(){
		acceptVehicleData();
	}
	
}
