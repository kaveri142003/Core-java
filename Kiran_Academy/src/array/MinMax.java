package array;

import java.util.Scanner;

public class MinMax {
	
	Scanner sc = new Scanner(System.in);
	
	public int bubbleSortAsending(int i[]) {
		for(int k=0 ; k<i.length ; k++) {
			for(int j=k+1 ; j<i.length  ; j++) {
				if(i[k]>i[j]) {
					int t =i[k];
					i[k]=i[j];
					i[j] = t;
				}
			}
		}
		return i[1];
	}
	
	public int bubbleSortDescending(int i[]) {
		for(int k=0 ; k<i.length ; k++) {
			for(int j=k+1 ; j<i.length  ; j++) {
				if(i[k]<i[j]) {
					int t =i[k];
					i[k]=i[j];
					i[j] = t;
				}
			}
		}
		return i[1];
	}

	
	public int getMax(int y[]) {
		int max = y[0];
		for(int k=0 ; k<y.length ; k++) {
			if(max<y[k]) {
				max=y[k];
			}
		}
		return max;
	}
	
	public int getMin(int y[]) {
		int min = y[0];
		for(int k=0 ; k<y.length ; k++) {
			if(min>y[k]) {
				min=y[k];
			}
		}
		return min;
	}
	
	public void acceptIntArray(int y[]) {
		System.out.println("Enter the integer array : ");
		for(int k=0 ; k<y.length ; k++) {
			y[k]= sc.nextInt();
		}
	}
	
	public void displayIntArray(int y[]) {
		System.out.println("Integer array =>");
		for(int k=0 ; k<y.length ; k++) {
			System.out.println(y[k]);
		}
	}

}
