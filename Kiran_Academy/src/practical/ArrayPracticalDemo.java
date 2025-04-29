package practical;

public class ArrayPracticalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i[] =new int[5];
		
		ArrayPractical a = new ArrayPractical();
		
		a.acceptArray(i);
		
		int cube= a.elementCubeSum(i);
		System.out.println("Sum of cube of Array elements are : "+ cube);
		
		int product = a.elementSquareProduct(i);
		System.out.println("Product of Square of elements are : "+ product);
	}

}
