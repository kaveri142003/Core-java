package exception;


public class classnotfoundexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Class.forName("p1.Shape"); //class loaded
			Class.forName("Shape"); //exception occurs
			System.out.println("Class Loaded");
			
		}catch(ClassNotFoundException f) {
			System.out.println(f);
		}

	}

}
