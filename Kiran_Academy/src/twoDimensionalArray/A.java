package twoDimensionalArray;

import java.util.Scanner;

public class A {
	Scanner sc = new Scanner(System.in);
	
//	public void getProduct(int a[][] , int b[][] , int product[][]) {
//		int s=0;
//		for(int k=0; k<a.length ; k++) {
//			for(int c=0 ; c<a[k].length ; c++) {
//				product[k][c]=0;
//				for(int z=0 ; z<a[c].length ; z++) {
//					product[k][c]+= a[k][c]*b[k][c];
//				}
//			}
//		}
//	}
	
	public void getSum(int a[][] , int b[][] , int sum[][]) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
	}
}
	
	public void getdiff(int a[][] , int b[][] , int diff[][]) {
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				diff[i][j] = a[i][j] - b[i][j];
			}
	}
}
	
	public void acceptData(int y[][]) {
		System.out.println("Value from array : ");
		for(int i=0 ; i<y.length ; i++) {
			for(int j=0 ; j<y[i].length ; j++) {
				y[i][j]= sc.nextInt();
			}
		}
	}
	
	public void showData(int y[][]) {
		System.out.println("Display Data: ");
		for(int i=0 ; i<y.length ; i++) {
			for(int j=0 ; j<y[i].length ; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
	}

}
