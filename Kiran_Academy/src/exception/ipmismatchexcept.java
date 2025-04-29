package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ipmismatchexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value :");
		
		try {
			b1= sc.nextBoolean();
			System.out.println(b1);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}

	}

}
