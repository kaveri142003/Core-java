package strings;

public class ConvertFirstLetterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "I LOVE PUNE";
		String b = "";
		int k=0;
		
		//convert to lower case
		while(k < S.length()){
			int code = S.codePointAt(k);
			if(code>=65 && code<=90) {
				b +=(char)(code+32);
			}else {
				b+=(char)(code);
			}
			k++;
		}
		
//		//convert to upper case
//				while(k < S.length()){
//					int code = S.codePointAt(k);
//					if(code>='a' && code<='z') {
//						b +=(char)(code-32);
//					}else {
//						b+=(char)(code);
//					}
//					k++;
//				}
		
		System.out.println(S);
		System.out.println(b);
	}

}
