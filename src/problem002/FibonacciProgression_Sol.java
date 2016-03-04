package problem002;

public class FibonacciProgression_Sol {
	private static long MAX_LIMIT = 4000000;

	public static void main(String[] args) {
		long[] intArr = new long[2];
		intArr[0] = 2;
		intArr[1] = 8;

		long sum = intArr[0] + intArr[1];

		long start = System.nanoTime();
		while(true){
			long nextNum = 4*intArr[1] + intArr[0];
			sum += nextNum;

			intArr[0] = intArr[1];
			intArr[1] = nextNum;

			if(nextNum>MAX_LIMIT){
				break;
			}
		}
		long end = System.nanoTime();

		System.out.println("sum = " + sum);
		System.out.println(end-start + "(ns)");
	}
}
