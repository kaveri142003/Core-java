package practical;

import java.util.Scanner;
public class Geometry {
	
	Scanner sc = new Scanner(System.in);
	float pi=3.14f;
	
	public void calCircleArea() {
		System.out.println("Enter the value of radius :");
		double radius = sc.nextDouble();
		
		double circleArea = pi*radius*radius;
		System.out.println("Area of Circle : " + circleArea);
	}
	
	public void calTriangleArea() {
		System.out.println("Enter value of height :  ");
		double height = sc.nextDouble();
		System.out.println("Enter the value of Breadth : ");
		double breadth = sc.nextDouble();
		
		double triangleArea = (height*breadth)*1/2;
		System.out.println("Area of triangle : " + triangleArea);
		
	}
	
	public void calSquareArea() {
		System.out.println("Enter the value of side : ");
		double side = sc.nextDouble();
		
		double squareArea =  side*side;
		System.out.println("Area of Square : " + squareArea);
	}
	
	public void rectangle() {
		System.out.println("Enter value of Length :  ");
		double length = sc.nextDouble();
		System.out.println("Enter the value of Breadth : ");
		double breadth = sc.nextDouble();
		
		double rectangleArea = length*breadth;
		System.out.println("Area of Rectangle : " + rectangleArea);
	}
	
	public void calArea() {
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			calCircleArea();
			break;
		case 2 :
			calTriangleArea();
			break;
		case 3 :
			calSquareArea();
		case 4 :
			rectangle();
			break;
		default :
			System.out.println("Enter valid choice");
		}
	}
	
}
