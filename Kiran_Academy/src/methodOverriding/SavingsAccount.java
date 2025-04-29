package methodOverriding;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void withdraw() {
		if(balance <100) {
			System.out.println("your balance is under 100-RS , you can't withdraw money");
		}else {
			float withdrawAmount=0;
			System.out.println("Enter amount to be withdraw : ");
			withdrawAmount = sc.nextFloat();
			balance -= withdrawAmount;
			System.out.println("your withdrawal Successful");
			System.out.println("Remaining Balance : " + balance );
	}
	
	 
	}
}
