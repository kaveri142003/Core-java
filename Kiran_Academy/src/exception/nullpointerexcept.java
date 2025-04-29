package exception;

public class nullpointerexcept {
	
	class A {
		void m1() {
			System.out.println("Mango");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = null;
		try {
			a.m1();
		}catch(NullPointerException n) {
			System.out.println(n);
		}finally{
			System.out.println("Done");
		}

	}

}
