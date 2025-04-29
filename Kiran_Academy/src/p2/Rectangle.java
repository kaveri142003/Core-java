package p2;

import java.util.Scanner;

public class Rectangle extends p1.Shape{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void shapeArea() {
		System.out.print("Enter Rectanle length : ");
		double length = sc.nextDouble();
		System.out.print("Enter Rectanle breadth : ");
		double breadth = sc.nextDouble();
		double area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}
}
