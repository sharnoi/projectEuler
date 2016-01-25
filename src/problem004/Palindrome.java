package problem004;

public class Palindrome {

	public static void main(String[] args) {
		double start = System.nanoTime();
		int solution = 0;
		for(int i=100; i<1000; i++){
			for(int k=i; k<1000; k++){
				String palindrome = String.valueOf((i*k));
				if(isNumPalindrome(palindrome)){
					solution = (solution < i*k) ? solution=i*k : solution;
				}
			}
		}
		double end = System.nanoTime();
		
		System.out.println(solution);
		System.out.println(end-start);
	}

	private static boolean isNumPalindrome(String palindrome) {
		for(int j=0; j<palindrome.length()/2; j++){
			if(palindrome.charAt(j) != palindrome.charAt(palindrome.length()-1-j)){
				return false;
			}
		}
		
		return true;
	}
}
