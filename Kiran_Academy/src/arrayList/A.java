package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("Mango"); a.add("Apple");
		a.add("Cheery"); a.add("Banana");
		a.add("Lemon"); a.add("Chiku");
		a.add("Orange"); a.add("Papaya");
		
		A.print_1(a);
		A.print_2(a);
		A.print_3(a);
		A.print_4(a);
		A.print_5(a);
	}
	
	//using object and for-each loopo
	public static void print_1(ArrayList a) {
		System.out.println("For each loop =>");
		for(Object o : a) {
//			String s = (String)(o);
			System.out.println(o);
		}
	}
	
	
	//using for loop
	public static void print_2(ArrayList a) {
		System.out.println();
		System.out.println("For loop =>");
			for(int i=0 ; i<a.size() ; i++) {
				System.out.println(a.get(i));
		}
	}
	
	
	//using Iterator
	public static void print_3(ArrayList a) {
		System.out.println();
			System.out.println("Iterator Loop => ");
			Iterator itr = a.iterator();
			while(itr.hasNext()) {
					Object o = itr.next();
					String s = (String)(o);
					System.out.println(s);
		}
	}
	
	
	//Using listIterator
	public static void print_4(ArrayList a) {
		System.out.println();
		System.out.println("Using list iterator in forward direction = > ");
		ListIterator itr = a.listIterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			String s = (String)(o);
			System.out.println(s);
		
		}
	}
	
	//using listIterator
	public static void print_5(ArrayList a) {
		System.out.println();
		System.out.println("Using list iterator in reverse direction = > ");
		ListIterator itr = a.listIterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			String s = (String)(o);
		}
		while(itr.hasPrevious()) {
			Object o = itr.previous();
			String s = (String)(o);
			System.out.println(s);
		
		}
	}
}

