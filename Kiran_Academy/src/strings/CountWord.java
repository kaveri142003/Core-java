package strings;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "the quick brown dog jumps over the lazy dog";
		String s2 = "the";
		
		
		String[] words = s1.split(" ");
		
		int count =0;
		
		for(String word : words) {
			if(word.equals(s2)) {
				count++;
			}
		}
		
		System.out.println(s2 + " comes " + count + " times");

	}

}
