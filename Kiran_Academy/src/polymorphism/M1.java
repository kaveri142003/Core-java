package polymorphism;

public class M1 {
	
	// 1. diffrent datatypes
	public void datatypes(int a) {
		System.out.println("I am integer method");
	}
	
	public void datatypes(double a) {
		System.out.println("I am double method");
	}
	
	// 2. diffrent no. of parameters
	public void params(char c) {
		System.out.println("I am char argument method");
	}
	
	public void params(char c , int a) {
		System.out.println("I am char and int argument method");
	}
	
	// 3. diffrent datatypes and same parameters
	public void check(int a  , float f) {
		System.out.println("This is int and float method");
	}
	
	public void check(String b , char d) {
		System.out.println("This is String and Char method");
	}
	
	// 4. varargs
	public void logic(String... n) {
		for(String i : n) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	public void logic(int... n) {
		for(int i : n) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	// 5.  diffrent order of parameters
	public void order(char c , int a) {
		System.out.println("I am char and int argument method");
	}
	
	public void order(int a , char c) {
		System.out.println("I am int and char argument method");
	}
	
	// 6. diffrent access modifiers
	public void access(int a) {
		System.out.println("This is a public method");
	}
	
	protected void access(String f) {
		System.out.println("This is a private method");
	}
	
	 // 7. difrrent return types
	public int return1(byte a) {
		System.out.println("This method returns byte");
		return a;
	}
	
	protected float return1(int f) {
		System.out.println("This method returns int");
		return f;
	}
	
	// 8. mixture of datatypes and parameter counts
	public void counts(String s) {
		System.out.println("This method has String datatypes and 1 parameter count");
	}
	
	public void counts(int a  , char c) {
		System.out.println("This method has int and char datatypes and 2 parameter count");
	}
	
	// 9. changing datatypes and parameters
	public void change(int a ) {
		System.out.println("This is integer method");
	}
	
	public void change(char a , int v ) {
		System.out.println("This is Char & int method");
	}
	
	// 10. diffrent datatypes , varargs , changing order of params
	public void args(String... s ) {
		for(String i : s) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	public void args(int a,String...c) {
		
		System.out.println("First argument is int");
		
		for(String i : c) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	// 11. ambiguity error and its resolution
	public void ambi(int a , double b) {
		System.out.println("This is int and double method");
	}
	
	public void ambi(double a , int b) {
		System.out.println("This is double and int method");
	}
	
	

}
