package abstraction;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b = new SavingAccount();
		b.deposit();
		b.withdraw();
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		BankAccount a = new CurrentAccount();
		a.deposit();
		a.withdraw();

	}

}
