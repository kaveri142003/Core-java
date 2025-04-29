package hashSet;

import java.util.HashSet;

public class A {
	
	public static void printSet_a(HashSet a) {
		System.out.println("Hashset a : ");
		for(Object o : a) {
			System.out.println(o);
		}
	}
	
	
	public static void printSet_b(HashSet b) {
		System.out.println();
		System.out.println("Hashset b : ");
		for(Object o : b) {
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet a = new HashSet();
		a.add("Rushikesh");    a.add("Prakash");
		a.add("Shinde");       a.add("Male");
		a.add(null);           a.add(23);
		
		HashSet b = new HashSet();
		b.add("Rohan");        b.add("Anil");
		b.add("Jadhav");       b.add("Male");
		b.add(null);           b.add(26);
		
//		A.printSet_a(a);
//		A.printSet_b(b);
		
//		a.addAll(b);
//		A.printSet_a(a);
		
//		int sizeOfa = a.size();
//		System.out.println("Size of hashset a: " + sizeOfa);
//		int sizeOfb = a.size();
//		System.out.println("Size of hashset b: " + sizeOfb);
		
//		a.remove("Rushikesh");
//		A.printSet_a(a);
		
//		a.removeAll(b);  //remove all comman elements 
//		System.out.println(a);
		
//		a.retainAll(b);  //remove all un common elements
//		System.out.println(a);

	}

}
