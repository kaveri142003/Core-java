package encapsulation;

import java.util.Scanner;

public class Developer {
	Scanner sc = new Scanner(System.in);
	private double basic_salary,pf,pt,hra,tra,da;
	private double gross_salary , net_salary;
	
	public void getSalary() {
		System.out.print("Enter Basic Salary : ");
		basic_salary = sc.nextDouble();
		System.out.println("Basic Salary : "  + basic_salary);
	}
	
	public void calpf() {
		pf = (basic_salary*8)/100;
		System.out.println("pf 8% of "+ basic_salary + " is :" + pf);
	}
	
	public void calpt() {
		pt = (basic_salary*10)/100;
		System.out.println("pt 10% of "+ basic_salary + " is :" + pt);
	}
	
	public void calhra() {
		hra = (basic_salary*15)/100;
		System.out.println("hra 15% of "+ basic_salary + " is :" + hra);
	}
	
	public void caltra() {
		tra = (basic_salary*5)/100;
		System.out.println("tra 5% of "+ basic_salary + " is :" + tra);
	}
	
	public void calda() {
		da = (basic_salary*8)/100;
		System.out.println("da 8% of "+ basic_salary + " is :" + da);
	}
	
	public void calGross() {
		gross_salary = basic_salary + da + hra + tra;
		System.out.println("Gross Salary : " + gross_salary);
	}
	
	public void calNet() {
		net_salary = gross_salary - (pt + pf);
		System.out.println("Net Salary : " +net_salary);
	}
	
//	public void display() {
//		System.out.println("  ");
//		System.out.println("Basic Salary : "  + basic_salary);
//		System.out.println("pf 8% of "+ basic_salary + " is :" + pf);
//		System.out.println("pt 10% of "+ basic_salary + " is :" + pt);
//		System.out.println("hra 15% of "+ basic_salary + " is :" + hra);
//		System.out.println("tra 5% of "+ basic_salary + " is :" + tra);
//		System.out.println("da 8% of "+ basic_salary + " is :" + da);
//		System.out.println("Gross Salary : " + gross_salary);
//		System.out.println("Net Salary : " +net_salary);
//	}

}
