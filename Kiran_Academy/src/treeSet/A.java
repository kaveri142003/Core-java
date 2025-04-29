package treeSet;

import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to add element in a TreeSet it should implement comparable or comparator interface
		//here string and integer class already implements one of them interface
		
		TreeSet a = new TreeSet();
		a.add("Rushikesh");  a.add("Prakash");
		a.add("Shinde");     a.add("Male");    //can insert only homoeneous elements
		a.add("Pune");
		
		System.out.println("TreeSet a : " + a);  //output in ascending order
		
		TreeSet b = new TreeSet();
		b.add(10);  b.add(3);                   //can insert only homoeneous elements
		b.add(-29);     b.add(0);
		b.add(32);
		
		System.out.println("TreeSet b : " + b);       //output in ascending order
	}

}
