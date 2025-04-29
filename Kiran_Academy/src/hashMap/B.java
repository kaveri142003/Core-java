package hashMap;

import java.util.HashMap;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap a = new HashMap();
		
		a.put(1, "Rushikesh");
		a.put(2, "Trupti");
		a.put(null, true);
		a.put("Nishchal", null);
		
		System.out.println(a);
		
		Object o;
		
		o = a.replace(null, "Kaveri");
		System.out.println("After replace");
		System.out.println(a);
		
		System.out.println();
		o = a.remove(1 , "Rushikesh");
		System.out.println(o);
		System.out.println(a);

	}

}
