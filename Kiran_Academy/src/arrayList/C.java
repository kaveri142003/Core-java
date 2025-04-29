package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList student = new ArrayList();
		student.add("Rushikesh");   student.add("Prakash");
		student.add("Shinde");   student.add("Neeta");
		student.add("Trupti");   student.add("Manasi");
		student.add("Nishchal");  student.add("Kaveri");
		
		C.run(student);
	}
	
	public static void run(ArrayList student) {
		Iterator i = student.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			String s = (String)(o);
			System.out.println(o);
		}
	}

}
