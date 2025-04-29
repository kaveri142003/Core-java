package array;

public class DemoClass {
	public static void main(String[] args) {
		int arr1[] = new int[6];
		int arr2[] = new int[5];
		
		Common c = new Common();
		
		c.accept(arr1, arr2);
		System.out.println();
		c.displayIntArray(arr1, arr2);
		
		System.out.println();
		System.out.println("Common elements in array1 & array2 are :");
		c.findCommon(arr1, arr2);
		
		System.out.println();
		System.out.println("Common elements in array1 & array2 are :");
		c.findCommonHash(arr1, arr2);
		
		System.out.println();
		System.out.println("Uncommon elements in array1 & array2 are :");
		c.findUncommon(arr1, arr2);
		
		System.out.println();
		System.out.println("Union of array1 & array2 is :");
		c.arrayUnion(arr1, arr2);
		
	}
}
