package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "mother in law" , s2 = "woman hitler";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s1 = s1.replace(" ", "").toLowerCase().trim();
		s2 = s2.replace(" ", "").toLowerCase().trim();
		
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println();
		
		String t1 = new String(ch1);
		String t2 = new String(ch2);
		
		if(t1.equals(t2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("not a anagram");
		}
		

	}

}
