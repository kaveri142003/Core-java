package inheritance;

import java.util.Scanner;

public class Furniture {
	Scanner sc = new Scanner(System.in);
	
	private String brand , quality , warranty;
	
	//setters
	public void setBrand(String b) {
		brand = b;
	}
	
	public void setQuality(String q) {
		quality = q;
	}
	
	public void setWarranty(String w) {
		warranty = w;	
	}
	
	//getters
	public String getBrand() {
		return brand;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public String getWarranty() {
		return warranty;
	}
	
	public void acceptFrurnitureData() {
		System.out.println("Enter Furniture Data ==>");
		System.out.println();
		System.out.println("Enter Brand name : ");
		setBrand(sc.next());
		System.out.println("Enter Quality : ");
		setQuality(sc.next());
		System.out.println("Enter Warranty : ");
		setWarranty(sc.next());
	}
	
	public void displayFurnitureData() {
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Furniture Brand name : "+ getBrand());
		System.out.println("Furniture Quality : " + getQuality());
		System.out.println("Furniture Warrenty : " + getWarranty());
	}
	
	Furniture() {
		acceptFrurnitureData();
	}
}
