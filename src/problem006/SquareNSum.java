package problem006;

public class SquareNSum {

	public static void main(String[] args) {
		double startTime = System.nanoTime();
		
		double sumOfSq = getSumOfSq();
		double sqOfSum = getSqOfSum();
		
		double endTime = System.nanoTime();
		
		System.out.println(Math.max(sumOfSq, sqOfSum) - Math.min(sumOfSq, sqOfSum));
		System.out.println(endTime - startTime + "(ns)");
	}

	private static double getSumOfSq() {
		double retVal = 0;
		for(int i=1; i<=100; i++){
			retVal += Math.pow(i, 2);
		}
		return retVal;
	}

	private static double getSqOfSum() {
		double retVal = 0;
		for(int i=1; i<=100; i++){
			retVal += i;
		}
		return Math.pow(retVal, 2);
	}

}
