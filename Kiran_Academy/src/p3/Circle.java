package p3;

import java.util.Scanner;

public class Circle extends p1.Shape{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void shapeArea() {
		System.out.print("Enter Circle radius : ");
		double radius = sc.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
	}

}
