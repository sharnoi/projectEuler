package problem010;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		List<Long> primeNumList = new ArrayList<Long>();
		primeNumList.add(2L);
		long primeNum;
		
		long startTime = System.nanoTime();
		
//		int count = 1;
		long sum = 0;
		while((primeNum = getNextPrimeNum(primeNumList)) <= 2000000){
			primeNumList.add(primeNum);
			sum += primeNum;
//			System.out.println(count++ + " : " + primeNum);
		}
		
		long endTime = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(endTime-startTime + "(ns)");
	}

	private static long getNextPrimeNum(List<Long> primeNumList) {
		long nextPrimeNum = primeNumList.get(primeNumList.size()-1) + 1;
		
		while(true){
			boolean isPrimeNum = true;
			
			for (long primeNum : primeNumList) {
				if(nextPrimeNum%primeNum == 0){
					isPrimeNum = false;
					break;
				}
			}
			
			if(isPrimeNum){
				break; 
			}else{
				nextPrimeNum++;
			}
		}
		
		return nextPrimeNum;
	}
}
