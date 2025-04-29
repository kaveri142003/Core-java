package abstraction;

import java.util.Scanner;

public class Cube3D extends Shape3D{
	
Scanner sc = new Scanner(System.in);
	
	private double edge;
	
	public void acceptData() {
		System.out.print("Enter edge of cube : ");
		edge = sc.nextDouble();
	}
	
	@Override
	void calVolume() {
		System.out.println();
		acceptData();
		double volume = edge * edge * edge;
		System.out.println("Volume of Sphere is : " + volume);
	}
	
	@Override
	void calSurfaceArea() {
		System.out.println();
		acceptData();
		double SurfaceArea = 6 * edge * edge;
		System.out.println("Surface Area of sphere : " + SurfaceArea);
	}
}
