package interview;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println("Prime number");
		}else {
			System.out.println("not a prime number");
		}

	}
	
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		
		for(int i=2 ; i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
