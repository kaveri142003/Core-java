package sorting;

import java.util.Scanner;

public class Book {
	
	Scanner sc = new Scanner(System.in);
	public String bookName , bookAuthor;
	public int price , publishYear;
	
	public static void sortData(Book b[] ){
		for(int k=0 ; k<b.length ; k++) {
			for (int j=k+1 ; j<b.length ; j++) {
				if(b[k].price> b[j].price) {
					Book t = b[k];
					b[k] = b[j];
					b[j]=t;
				}
			}
		}
		
	}
	
	public static void acceptData(Book b[]) {
		for(int k=0 ; k<b.length ; k++) {
			b[k] = new Book(); 
			b[k].enterStudentInfo();
		}
	}
	
	public static void displayData(Book b[]) {
		for(int k=0 ; k<b.length ; k++) {
			b[k].showStudentInfo();
		}
	}
	
	public void enterStudentInfo() {
		System.out.println("Enter Book name :");
		bookName = sc.nextLine();
		System.out.println("Enter Author name :");
		bookAuthor = sc.nextLine();
		System.out.println("Enter publication year :");
		publishYear = sc.nextInt();
		System.out.println("Enter Book price :");
		price = sc.nextInt();
	}
	
	public void showStudentInfo() {
		System.out.println("-----------------");
		System.out.println("Book name : " +bookName);
		System.out.println("Author name : " +bookAuthor);
		System.out.println("Publication Year : " +publishYear);
		System.out.println("Book Price : " +price);
	}

}
