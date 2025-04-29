package statements;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	double  num1 , num2;
	
	public void acceptData() {
		System.out.println("Enter number 1 : ");
		num1 = sc.nextDouble();
		System.out.println("Enter number 2 : ");
		num2 = sc.nextDouble();
	}
	
	public void getSum() {
		double sum;
		sum = num1+num2;
		System.out.println("Sum of " + num1 +" & " + num2 + " is : " + sum);
	}
	
	public void getdiff() {
		double diff;
		diff = num1-num2;
		System.out.println("Difference of " + num1 +" & " + num2 + " is : " + diff);
	}
	
	public void getProduct() {
		double pro;
		pro = num1*num2;
		System.out.println("Product of " + num1 +" & " + num2 + " is : " + pro);
	}
	
	public void getDivide() {
		double divide;
		divide = num1/num2;
		System.out.println("Quotient of " + num1 +" & " + num2 + " is : " + divide);
	}
	
	public void getMod() {
		double mod;
		mod = num1%num2;
		System.out.println("Remainder of " + num1 +" & " + num2 + " is : " + mod);
	}
	
	public void logic() {
		
		System.out.println("Choices are as Follows :");
		System.out.println("Choice 1 for Addition");
		System.out.println("Choice 2 for Substraction");
		System.out.println("Choice 3 for Multiplication");
		System.out.println("Choice 4 for Division");
		System.out.println("Choice 5 for Modulous");
		
		System.out.println();
		
		System.out.println("Enter Choice  : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : getSum();
		break;
		
		case 2 : getdiff();
		break;
		
		case 3 : getProduct();
		break;
		
		case 4 : getDivide();
		break;
		
		case 5 : getMod();
		break;
		
		default : System.out.println("Enter Correct Choice !!");
		}
	}
}
