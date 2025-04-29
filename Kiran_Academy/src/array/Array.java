package array;

import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);
	
	
	//accept
	public void acceptIntArray(int y[]) {
		System.out.println("Enter the integer array : ");
		for(int k=0 ; k<y.length ; k++) {
			y[k]= sc.nextInt();
		}
	}
	
	public void acceptByteArray(byte b[]) {
			System.out.println("Enter the byte array : ");
			for(int k=0 ; k<b.length ; k++) {
				b[k]= sc.nextByte();
			}
	}
	
	public void acceptLongArray(long c[]) {
		System.out.println("Enter the long array : ");
		for(int k=0 ; k<c.length ; k++) {
			c[k]= sc.nextLong();
		}
}
	
	public void acceptDoubleArray(double d[]) {
		System.out.println("Enter the double array : ");
		for(int k=0 ; k<d.length ; k++) {
			d[k]= sc.nextDouble();
		}
}
	
	public void acceptStringArray(String e[]) {
		System.out.println("Enter the String array : ");
		for(int k=0 ; k<e.length ; k++) {
			e[k]= sc.nextLine();
		}
}
	
	
	//display
	
	public void displayIntArray(int y[]) {
		System.out.println("Integer array =>");
		for(int k=0 ; k<y.length ; k++) {
			System.out.println(y[k]);
		}
	}
	
	public void displayByteArray(byte a[]) {
		System.out.println("Byte array =>");
		for(int k=0 ; k<a.length ; k++) {
			System.out.println(a[k]);
		}
	}
	
	public void displayLongArray(long c[]) {
		System.out.println("Long array =>");
		for(int k=0 ; k<c.length ; k++) {
			System.out.println(c[k]);
		}
	}
	
	public void displaydoubleArray(double d[]) {
		System.out.println("Double array =>");
		for(int k=0 ; k<d.length ; k++) {
			System.out.println(d[k]);
		}
	}
	
	public void displayStringArray(String e[]) {
		System.out.println("String array =>");
		for(int k=0 ; k<e.length ; k++) {
			System.out.println(e[k]);
		}
	}
	
	public void printEvenNoFromArray(int y[]) {
		System.out.println("Even no from array : ");
		for(int k=0 ; k<y.length ; k++) {
			if(y[k]%2==0) {
				System.out.println(y[k]);
			}
		}
	}
	
	public void printArraySquare(int y[]) {
		System.out.println("Square of Each element : ");
		for(int k=0 ; k<y.length ; k++) {
			System.out.println(y[k] * y[k]);
		}
	}
	
	public void printCubeOfOddElement(int y[]) {
		System.out.println("Cube of Odd elements:");
		for(int k=0 ; k<y.length ; k++) {
			if (y[k]%2!=0) {
				System.out.println(y[k] * y[k] * y[k]);
			}
		}
	}
	
	public void printReverseArray(int y[]) {
		System.out.println("Reverse Array : ");
		for (int k=y.length-1 ; k>=0 ; k--) {
			System.out.println(y[k]);
		}
	}
	
	public int intArraySum(int y[]) {
		int sum = 0;
		for(int k=0 ; k<y.length ; k++) {
			sum += y[k];
		}
		return sum;
	}
	
	public int intArrayProduct(int y[]) {
		int product = 1;
		for(int k=0 ; k<y.length ; k++) {
			product = product* y[k];
		}
		return product;
	}
	
	public int intArrayOddElementSum(int y[]) {
		int oddSum = 0;
		for(int k=0 ; k<y.length ; k++) {
			if(y[k]%2!=0) {
				oddSum+=y[k];
			}
		}
		return oddSum;
	}
}
