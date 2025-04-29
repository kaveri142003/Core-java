package constructor;
import java.util.Scanner;

public class Book {
	
	String book_name;
	String book_author;
	int book_price;
	int book_qnty;
	
	Scanner sc = new Scanner(System.in);
	
	public Book() {
		
		System.out.println("Enter book name:");
		book_name=sc.next();
		
		System.out.println("Enter author name:");
		book_author=sc.next();
		
		System.out.println("Enter book price:");
		book_price=sc.nextInt();
		
		System.out.println("Enter book qnty:");
		book_qnty=sc.nextInt();
		
	}
	
	public void display() {
		
		System.out.println("Book name : "+book_name);
		System.out.println("Author name : "+book_author);
		System.out.println("Book price : "+book_price);
		System.out.println("Book quantity : "+book_qnty);
	}
	
	
	
	
}
