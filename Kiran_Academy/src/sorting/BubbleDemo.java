package sorting;

public class BubbleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[5];
		Bubble b = new Bubble();
		
		b.acceptIntArray(i);
		b.bubbleSortAsending(i);
		System.out.println("Ascending Sorted Array :");
		b.displayIntArray(i);
		b.bubbleSortDescending(i);
		System.out.println("Descending Sorted Array :");
		b.displayIntArray(i);
	}

}
