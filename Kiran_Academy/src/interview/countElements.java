package interview;

public class countElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5};
		
		int count = 0;
		
		for(int num : numbers) {
			count++;
		}
		
		System.out.println("Count : " + count);
	}

}
