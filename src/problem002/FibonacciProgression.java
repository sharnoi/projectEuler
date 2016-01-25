package problem002;

public class FibonacciProgression {

	public static void main(String[] args) {
		int[] intArr = new int[2];
		intArr[0] = 1;
		intArr[1] = 2;
		
		int number = intArr[0] + intArr[1];
		int sum = intArr[1];
		while(number <= 4000000){
			if(number%2 == 0){
				sum += number;
				System.out.println(number + " - " + sum);
			}
			
			intArr[0] = intArr[1];
			intArr[1] = number;
			number = intArr[0] + intArr[1];
		}
		
		System.out.println(sum);
	}

}
