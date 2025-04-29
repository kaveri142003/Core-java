package arrayList;

import java.util.ArrayList;

public class B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("Mango"); a.add("Apple");
		a.add("Cheery"); a.add("Banana");
		a.add("Lemon"); a.add("Chiku");
		a.add("Orange"); a.add("Papaya");
		
		ArrayList b = new ArrayList();
		b.add("Maruti"); b.add("Toyota");
		b.add("Kia"); b.add("Hyundai");
		b.add("Renault"); b.add("BMW");
		b.add("Mahindra"); b.add("Tata");
		
		//checking list
		System.out.println("Checking the list : ");
		System.out.println(a);
		
		System.out.println();
		
		//removing element
		System.out.println("Removing the element : ");
		int size1 = a.size();
		System.out.println("Size of array : " + size1);
	    a.remove(1);
		System.out.println(a);
		int size2 = a.size();
		System.out.println("Size of array after removing element : " + size2);
		
		System.out.println();
		
		//isEmpty
		boolean c = a.isEmpty();
		System.out.println("List is empty : " + c);
		
		System.out.println();
		
//		//adding 2 lists
//		a.addAll(b);
//		System.out.println("List a after adding list b : " + a );
		
		System.out.println();
		
		//adding 2 lists
		    a.addAll(2, b);
			System.out.println("List a after adding list b in between list a : " + a );
				
			System.out.println();
		
		//clear
		a.clear();
		System.out.println("List after clear method : " + a);
		
	}

}
