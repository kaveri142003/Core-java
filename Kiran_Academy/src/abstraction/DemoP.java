package abstraction;
import java.util.Scanner;

import p1.Shape;
import p2.Rectangle;
import p3.Circle;

public class DemoP {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		
		System.out.println("Choice 1 : Area of Rectangle");
		System.out.println("Choice 2 : Area of Circle");
		
		System.out.println();
		System.out.println("Enter choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
			case 1 : s1.shapeArea();
			break;
		
			case 2 : s2.shapeArea();
			break;
		
			default : System.out.println("Enter valid choice !");
		}
		
	}

}
