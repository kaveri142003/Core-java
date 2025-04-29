package abstraction;

import java.util.Scanner;

public class SavingAccount extends BankAccount{
	Scanner sc = new Scanner(System.in);
	
	private double depositAmount , totalBalance = 50000 , withdrawAmount; 
	
	@Override
	void deposit() {
		System.out.println("Savings Account Balance : " +totalBalance);
		System.out.print("Enter Amount to be Deposit : ");
		depositAmount = sc.nextDouble();
		totalBalance += depositAmount;
		System.out.println("Savings Account Balance after depositing money : "+totalBalance);
	}
	
	@Override
	void withdraw() {
		System.out.println();
		System.out.println("Savings Account Balance : " +totalBalance);
		System.out.print("Enter amount to be Withdraw : ");
		withdrawAmount = sc.nextDouble();
		totalBalance -= withdrawAmount;
		System.out.println("Current Account Balance after Withdrawal : "+totalBalance);
	}

}
