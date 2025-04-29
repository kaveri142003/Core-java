package strings;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one in upper case : ");
		String s = sc.next();
		System.out.println("Enter String two lower case : ");
		String c = sc.next();
		
		String l = s.toLowerCase();
		String u = c.toUpperCase();
		
		System.out.println(l);
		System.out.println(u);
	}

}
