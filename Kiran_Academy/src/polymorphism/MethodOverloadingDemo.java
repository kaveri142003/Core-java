package polymorphism;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m = new M1();
		
		m.datatypes(50);
		m.datatypes(50.1);
		System.out.println();
		
		m.params('A');
		m.params('A', 4);
		System.out.println();
		
		m.check(0, 0);
		m.check("ABC", 'v');
		System.out.println();
		
		m.logic("abc" , "def" , "hij");
		m.logic(1,2,3);
		System.out.println();
		
		m.access(3);
		m.access("ABC");
		System.out.println();
		
		m.return1(6);
		m.return1(189);
		System.out.println();
		
		m.counts("Rushi");
		m.counts(3, 'v');
		System.out.println();
		
		m.change(6);
		m.change('c', 9);
		System.out.println();
		
		m.args("Rushi" , "Prakash" , "Shinde");
		m.args(5, "Kaveri" , "Chavanke");
		
		
//		double ddd=33.2;
//		int y1=(int)(ddd);
		m.ambi(5, 10.0);
		m.ambi((double)5,8);
		
	}

}
