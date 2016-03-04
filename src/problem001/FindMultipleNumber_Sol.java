package problem001;

public class FindMultipleNumber_Sol {
	private static int MAX_NUM = 999;

	public static void main(String[] args) {
		long start = System.nanoTime();
		long sum = SumDivisableBy(3) + SumDivisableBy(5) - SumDivisableBy(15);
		long end = System.nanoTime();

		System.out.println("sum = " + sum);
		System.out.println(end-start + "(ns)");
	}

	private static int SumDivisableBy(int divisionNum) {
		int divSol = MAX_NUM/divisionNum;

		return divisionNum*divSol*(divSol+1);
	}
}
