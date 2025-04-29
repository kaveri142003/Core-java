package array;

import java.util.HashSet;
import java.util.Scanner;

public class Common {
	
	Scanner sc = new Scanner(System.in);
	
	//accept array1 and array2 from user
	public void accept(int arr1[] , int arr2[]) {
		System.out.println("Enter the integer array 1 : ");
		for(int k=0 ; k<arr1.length ; k++) {
			arr1[k]= sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the integer array 2 : ");
		for(int k=0 ; k<arr2.length ; k++) {
			arr2[k]= sc.nextInt();
		}
	}
	
	
	//display array1 and array2 
	public void displayIntArray(int arr1[] , int arr2[]) {
		System.out.println("Integer array 1 =>");
		for(int k=0 ; k<arr1.length ; k++) {
			System.out.println(arr1[k]);
		}
		
		System.out.println();
		System.out.println("Integer array 2 =>");
		for(int k=0 ; k<arr2.length ; k++) {
			System.out.println(arr2[k]);
		}
	}
	
	
	//method to find common elements from array1 and array2 using for loop
	public void findCommon(int arr1[] , int arr2[]) {
		for(int i=0 ; i<arr1.length ; i++) {
			for(int j=0 ; j<arr2.length ; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	
	//method to find common elements from array1 and array2 using HashSet
		public void findCommonHash(int arr1[] , int arr2[]) {
			HashSet<Integer> h = new HashSet<>();
			for(int i=0 ; i<arr1.length ; i++) {
				for(int j=0 ; j<arr2.length ; j++) {
					if(arr1[i] == arr2[j]) {
						h.add(arr1[i]);
						break;
					}
				}
			}
			

			System.out.println(h);
		}
		
		//method to find Uncommon elements from array1 and array2 using HashSet
		public void findUncommon(int arr1[] , int arr2[]) {
			HashSet<Integer> hs1 = new HashSet<>();
			HashSet<Integer> hs2 = new HashSet<>();
			
			for(int no : arr1) {     //store array1 in hs1 HashSet
				hs1.add(no);
			}
			
			for(int no : arr2) {	//store array2 in hs2 HashSet
				hs2.add(no);
			}
			
			HashSet<Integer> uncommon = new HashSet<>(hs1);  //new HashSet uncommon contains all uncommon elements from array1 and array2 
			uncommon.addAll(hs2);   
			
			HashSet<Integer> common = new HashSet<>(hs1);	 //new HashSet common contains all common elements from array1 and array2
			common.retainAll(hs2);
			
			uncommon.removeAll(common);
			
			System.out.println(uncommon);
		}
		
		
		//method to print Union of array1 and array2
		public void arrayUnion(int arr1[] , int arr2[]) {
			HashSet<Integer> hs1 = new HashSet<>();
			HashSet<Integer> hs2 = new HashSet<>();
			
			for(int no : arr1) {     //store array1 in hs1 HashSet
				hs1.add(no);
			}
			
			for(int no : arr2) {	//store array2 in hs2 HashSet
				hs2.add(no);
			}
			
			HashSet<Integer> union = new HashSet<>(hs1);  //new HashSet uncommon contains all uncommon elements from array1 and array2 
			union.addAll(hs2);   
			
			System.out.println(union);
		}

}
