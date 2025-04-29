package strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "level";
		boolean b = true;
		int k=0 , m=s.length()-1;
		
		while(k< s.length()) {
			if(s.charAt(k) != s.charAt(m)) {
				b = false;
				break;
			}
			k++;
			m--;
		}
		
		if(b==true)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");

	}

}
