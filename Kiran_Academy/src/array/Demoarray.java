package array;

public class Demoarray {
	public static void main(String[] args) {
		int a[] =new int[5];
		byte b[] = new byte[5];
		long c[] = new long[5];
		double d[] = new double[5];
		String e[] = new String[5];
		
		Array a1 = new Array();
//		a1.acceptByteArray(b);
//		a1.displayByteArray(b);
		
		a1.acceptIntArray(a);
//		a1.displayIntArray(a);
//		
//		a1.acceptLongArray(c);
//		a1.displayLongArray(c);
//		
//		a1.acceptDoubleArray(d);
//		a1.displaydoubleArray(d);
//		
//		a1.acceptStringArray(e);
//		a1.displayStringArray(e);
		
//		a1.printEvenNoFromArray(a);
//		a1.printArraySquare(a);
//		a1.printCubeOfOddElement(a);
		
//		int sum = a1.intArraySum(a);
//		System.out.println("Sum : " + sum);
		
//		int product = a1.intArrayProduct(a);
//		System.out.println("Product : " + product);
		
		int oddSum = a1.intArrayOddElementSum(a);
		System.out.println("Odd element Sum : " + oddSum);
	}
}
