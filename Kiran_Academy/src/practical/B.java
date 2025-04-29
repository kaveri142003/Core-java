package practical;

import java.util.Scanner;

public class B {
	
	Scanner sc = new Scanner(System.in);
	
	public int countNo(int n) {
		int count = 0;
		while(n>0) {
			int digit = n%10;
			count++;
			n = n/10;
		}
//		System.out.println(count);
		return count;
		
	}
	
	public int power(int b, int p) {
		int m = 1;
		int i;
		for(i=1;i<=p;i++) {
			m*=b;
		}
//		System.out.println(m);
		return m;
	}
	
	public int printSum(int d) {
		int sum=0;
		while(d>0) {
			int digit = d%10;
			sum+=digit;
			d= d/10;
		}
//		System.out.println(sum);
		return sum;
		
	}

}
