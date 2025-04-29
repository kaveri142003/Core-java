package inheritance;

import java.util.Scanner;

public class Chair extends Table {
	
	Scanner sc = new Scanner(System.in);
	
	private String material ;
	private int height , width ,legs;

	
	//setters
		public void setMaterialChair(String m) {
			material = m;
		}
		
		public void setHeightChair(int h) {
			height = h;
		}
		
		public void setWidthChair(int w) {
			width = w;
		}
		
		public void setLegsChair(int l) {
			legs=l;
		}
		
		//getters
		public String getMaterialChair() {
			return material;
		}
		
		public int getHeightChair() {
			return height;
		}
		
		public int getWidthChair() {
			return width;
		}
		
		public int getLegsChair() {
			return legs;
		}
		
		public void acceptChairData() {
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("Enter Chair Data ==> ");
			System.out.println();
			System.out.println("Enter Chair material : ");
			setMaterial(sc.next());
			System.out.println("Enter Chair height : ");
			setHeight(sc.nextInt());
			System.out.println("Enter Chair width : ");
			setWidth(sc.nextInt());
			System.out.println("Enter Chair legs no : ");
			setLegs(sc.nextInt());
		}
		
		public void displayChairData() {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println();
			System.out.println("Chair Material : " + getMaterial());
			System.out.println("Chair height : " + getHeight());
			System.out.println("Chair width : " + getWidth());
			System.out.println("Chair legs : " + getLegs());
		}
		
		Chair(){
			acceptChairData();
			displayFurnitureData();
			displayTableData();
			displayChairData();
		}

}
