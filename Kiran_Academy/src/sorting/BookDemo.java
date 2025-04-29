package sorting;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b[] = new Book[5];
		
		Book b1 = new Book();
		b1.acceptData(b);
		b1.displayData(b);
		
		System.out.println();
		System.out.println("Sorted Data");
		Book.sortData(b);
		b1.displayData(b);
	}

}
