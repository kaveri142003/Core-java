package strings;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I LOVE PUNE";
		s1 = s1.toLowerCase().trim();
		System.out.println(s1);
		String b = "";
		int k=0;
		
		
		
		while(k<s1.length()) {
			
			int code = s1.codePointAt(k);
			
			if(k == 0 ) {
				b = b + (char)(code-32); 
			}else if(code == 32 ) {
				int c = s1.codePointAt(k+1);
				b = b +  (char)(code) + (char)(c-32);
				k++;
			}else {
				b += (char)(code);
			}
			k++;
		}
		
		System.out.println(b);

	}

}
