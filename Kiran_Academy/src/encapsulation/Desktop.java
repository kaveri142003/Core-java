package encapsulation;
import java.util.Scanner;

public class Desktop {
	Scanner sc = new Scanner(System.in);
	private String brand , processor ,ramsize;
	String u_ram;
	
	public void setBrand(String b) {
		brand = b;
	}
	
	public void setProcessor(String p) {
		processor = p;
	}
	
	public void setRamsize(String r) {
		ramsize = r;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public String getRamsize() {
		return ramsize;
	}
	
	public void upgradeRam() {
		System.out.println("Enter Brand name: ");
		setBrand(sc.nextLine());
		
		System.out.println("Enter Processor Name: ");
		setProcessor(sc.nextLine());
		
		System.out.println("Enter Ram Size : ");
		setRamsize(sc.nextLine());
		
		System.out.println("Enter the Ram Size to be upgrade : ");
		u_ram = sc.nextLine();
		
	}
	
	public void display() {
		System.out.println(" ");
		System.out.println("Brand Name : " + getBrand());
		System.out.println("Processor name : " + getProcessor());
		System.out.println("Ram Size : " + getRamsize());
		System.out.println("Ram Size to be Upgraded : " + u_ram);
		System.out.println("Upgraded Ram Size : "+ getRamsize()+u_ram);
		
	}
}
