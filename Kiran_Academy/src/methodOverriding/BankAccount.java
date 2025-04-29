package methodOverriding;

import java.util.Scanner;

public class BankAccount {
	
	float balance = 1000;
	
	
	public void deposit() {
		System.out.println("Deposit under bank account");
		System.out.println("Starting balance : " + balance);
	}
	
	public void withdraw() {
		System.out.println("withdraw under bank account");
	}
}
