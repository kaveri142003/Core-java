package abstraction;

import java.util.Scanner;

public class Sphere3D extends Shape3D{
	Scanner sc = new Scanner(System.in);
	
	private double radius;
	
	public void acceptData() {
		System.out.print("Enter radius of sphere : ");
		radius = sc.nextDouble();
	}
	
	@Override
	void calVolume() {
		System.out.println();
		acceptData();
		double volume = 1.33 * 3.14 * radius * radius * radius;
		System.out.println("Volume of Sphere is : " + volume);
	}
	
	@Override
	void calSurfaceArea() {
		System.out.println();
		acceptData();
		double SurfaceArea = 4 * 3.14 * radius * radius;
		System.out.println("Surface Area of sphere : " + SurfaceArea);
	}
}
