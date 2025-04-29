package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		
		HashMap a = new HashMap();
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println();
		
		a.put(1, "Rushikesh");
		a.put(2, "Trupti");
		a.put(null, true);
		a.put("Nishchal", null);
		
		System.out.println(a);
		
		a.put(2, "Rushikesh");
		
		System.out.println(a);
		
		a.put("Nishchal", "Chaudhari");
		
		System.out.println(a);
		
		System.out.println();
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
//		a.clear();
//		
//		System.out.println();
//		System.out.println(a.size());
//		System.out.println(a.isEmpty());
		
		System.out.println();
		System.out.println("Displaying only keys : ");
		Set key_set = a.keySet();
		Iterator itr = key_set.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("Displaying keys and objects : ");
		Set key_set_1 = a.keySet();
		Iterator itr1 = key_set_1.iterator();
		while(itr1.hasNext()) {
			Object o = itr1.next();
			System.out.println(o + "-> "+ a.get(o));
		}
		
		System.out.println();
		System.out.println("Displaying only Values : ");
		Collection collect_values = a.values();
		Iterator itr2 = collect_values.iterator();
		while(itr2.hasNext()) {
			Object o = itr2.next();
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("Displaying Pairs : ");
		Set entry_set = a.entrySet();
		Iterator itr3 = entry_set.iterator();
		while(itr3.hasNext()) {
			Object o = itr3.next();
			Map.Entry entry = (Map.Entry) (o);
			System.out.println(o);
		}
		
		
	}

}
