package problem002;

public class FibonacciProgression {

	public static void main(String[] args) {
		long[] intArr = new long[2];
		intArr[0] = 1;
		intArr[1] = 2;

		long number = intArr[0] + intArr[1];
		long sum = intArr[1];

		long start = System.nanoTime();
		while(number <= 4000000){
			if(number%2 == 0){
				sum += number;
			}
			
			intArr[0] = intArr[1];
			intArr[1] = number;
			number = intArr[0] + intArr[1];
		}
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(end-start + "(ns)");
	}

}
