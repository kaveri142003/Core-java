package practical;

public class Armstrong {
	
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
	
	public void checkArmstrong(int n) {
		
		System.out.println("N : " +n);
		int count = countNo(n);
		System.out.println("Count : "+count);
		int d=0 , sum=0;
		int t=n;
		while(n>0) {
			d=n%10;
			sum=sum+(power(d,count));
			n=n/10;
		}
		
		if(t==sum)
			System.out.println(t+" is Armstrong Number");
		else
			System.out.println(t+" is Armstrong Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		a.checkArmstrong(1634);
	}

}
