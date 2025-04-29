package statements;

import java.util.Scanner;

public class ElectricityBill {
	
	Scanner sc = new Scanner(System.in);
	
	float unit , unit_charge , meter_charge , total_bill_amount;
	
	public void acceptUnit() {
		System.out.println("Enter the user meter unit : ");
		unit = sc.nextFloat();
	}
	
	public void logic() {
		
		if(unit >= 0 && unit <= 100) {
			meter_charge = 150;
			unit_charge = 100;
			total_bill_amount = meter_charge + (unit * unit_charge);
			System.out.println("Total Electricity Bill is : " + total_bill_amount);
		}else if(unit >= 101 && unit <= 200) {
			meter_charge = 200;
			unit_charge = 150;
			total_bill_amount = meter_charge + (unit * unit_charge);
			System.out.println("Total Electricity Bill is : " + total_bill_amount);
		}else if(unit >= 201 && unit <= 300) {
			meter_charge = 250;
			unit_charge = 200;
			total_bill_amount = meter_charge + (unit * unit_charge);
			System.out.println("Total Electricity Bill is : " + total_bill_amount);
		}else if(unit >= 301) {
			meter_charge = 300;
			unit_charge = 250;
			total_bill_amount = meter_charge + (unit * unit_charge);
			System.out.println("Total Electricity Bill is : " + total_bill_amount);
		}else {
			System.out.println("Enter correct meter unit !!");
		}
	}
	
}
