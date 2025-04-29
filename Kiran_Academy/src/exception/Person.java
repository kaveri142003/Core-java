package exception;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;

		try {
			System.out.println("Enter age :");
			age = sc.nextInt();
			
			if (age < 0) {
				throw new AgeException("do n ot enter -ve age");
			}
			
			if (age >=0 && age<=17) {
				throw new AgeException("You can't vote");
			}
			
			if (age >=18 && age<=100) {
				throw new AgeException("You can vote");
			}
			
			if(age > 100) {
				System.out.println("Enter aadhar number");
			}

		} catch (AgeException a) {
			a.showError();
		}
		
	}
	
	

}
