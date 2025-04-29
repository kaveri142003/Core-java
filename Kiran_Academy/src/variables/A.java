package variables;

public class A {
	
	
		final int y=100; //Instance-Final-Primitive
		static String s="Mango"; //Static-Reference
		double dd=11.55; //Primitive-Instance
		static boolean b1=false; //Static-Primitive
		A bl = new A(); //Reference-Instance
		final static A a2 = new A(); //Static-Final-Reference
		
		public void kk() {
			long h=100; //local-primitive
			final char ch='T';//local-final-Reference
			final A a2=new A();//Reference-Final-Local
			String s="Orange";//Reference-Local
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
