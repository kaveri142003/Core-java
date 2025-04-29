package array;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[5];
		
		MinMax m =new MinMax();
		
		m.acceptIntArray(a);
		m.displayIntArray(a);
		int max = m.getMax(a);
		System.out.println("MAX : " +max);
		int min = m.getMin(a);
		System.out.println("Min : " +min);
		int sec_Max= m.bubbleSortDescending(a);
		System.out.println("Second Max : " +sec_Max);
		int sec_Min= m.bubbleSortAsending(a);
		System.out.println("Second Min : " +sec_Min);
	}

}
