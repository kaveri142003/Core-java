package practical;

import java.util.Scanner;

public class HW {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	public void acceptNum() {
		System.out.println("Enter the number : ");
		num = sc.nextInt();
	}
	
	//perform sum of digit of numbers until number comes single unit
	public void sum () {
		
		while(num >= 10) {
			int sum= 0;
			while (num > 0) {
				sum+= num%10;
				num/=10;
			}
			num=sum;
		}
		System.out.println("Sum : " + num);
	}

	
	public int sumFromTo(int first , int last) {
		
		int sum=0;
		for(int i=first ; i<=last ; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public void enough(int goal) {
		int sum = 0 ;
		int n =0;
		
		while (sum < goal) {
			n++;
			sum+=n;
		}
		System.out.println(n
				);
	}
}
