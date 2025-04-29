package inheritance;

import java.util.Scanner;

public class Table extends Furniture{

	Scanner sc = new Scanner(System.in);
	
	private String material ;
	private int height , width ,legs;
	
	
	//setters
	public void setMaterial(String m) {
		material = m;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setLegs(int l) {
		legs=l;
	}
	
	//getters
	public String getMaterial() {
		return material;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void acceptTableData() {
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Enter Table Data ==> ");
		System.out.println();
		System.out.println("Enter Table material : ");
		setMaterial(sc.next());
		System.out.println("Enter Table height : ");
		setHeight(sc.nextInt());
		System.out.println("Enter Table width : ");
		setWidth(sc.nextInt());
		System.out.println("Enter Table legs no : ");
		setLegs(sc.nextInt());
	}
	
	public void displayTableData() {
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		System.out.println("Table Material : " + getMaterial());
		System.out.println("Table height : " + getHeight());
		System.out.println("Table width : " + getWidth());
		System.out.println("Table legs : " + getLegs());
	}
	
	Table(){
		acceptTableData();
	}
	
}
