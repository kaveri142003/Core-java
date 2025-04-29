package sorting;

import java.util.Scanner;

public class Bubble {
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptIntArray(int i[]) {
		System.out.println("Enter the integer array : ");
		for(int k=0 ; k<i.length ; k++) {
			i[k]= sc.nextInt();
		}
	}
	
	public void displayIntArray(int i[]) {
		System.out.println("Integer array =>");
		for(int k=0 ; k<i.length ; k++) {
			System.out.println(i[k]);
		}
	}
	
	public void bubbleSortAsending(int i[]) {
		for(int k=0 ; k<i.length ; k++) {
			for(int j=k+1 ; j<i.length  ; j++) {
				if(i[k]>i[j]) {
					int t =i[k];
					i[k]=i[j];
					i[j] = t;
				}
			}
		}
	}
	
	public void bubbleSortDescending(int i[]) {
		for(int k=0 ; k<i.length ; k++) {
			for(int j=k+1 ; j<i.length  ; j++) {
				if(i[k]<i[j]) {
					int t =i[k];
					i[k]=i[j];
					i[j] = t;
				}
			}
		}
	}
}
