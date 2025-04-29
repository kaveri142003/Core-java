package practical;

import java.util.Scanner;

public class ArrayPractical {
	Scanner sc = new Scanner(System.in);
	
	public void acceptArray(int i[]) {
			System.out.println("Enter integer array:");
			for(int k=0 ; k<i.length ; k++) {
				i[k]=sc.nextInt();
			}
		}
		
		public int elementCubeSum(int i[]) {
			int sum =0;
			for(int k=0 ; k<i.length ; k++) {
				int a = i[k]*i[k]*i[k];
				sum+=a;
			}
		return sum;
		}
		
		public int elementSquareProduct(int i[]) {
			int product = 1;
			for(int k=0 ; k<i.length ; k++) {
				int square = i[k]*i[k];
				product *=square;
			}
			return product;
		}

		
}

