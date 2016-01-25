package problem003;

import java.util.ArrayList;
import java.util.List;

public class MaxPrimeFactor2 {
	
	public static void main(String[] args) {
		double maxNum = 600851475143d;
		
		List<Integer> primeNumList = new ArrayList<Integer>();
		List<Integer> solutionList = new ArrayList<Integer>();
		
		double startTime = System.nanoTime();
		primeNumList.add(new Integer(2));
		
		while(true){
			int nextPrimeNum = getNextPrimeNum(primeNumList);
			
			primeNumList.add(new Integer(nextPrimeNum));
			
			if(maxNum%primeNumList.get(primeNumList.size()-1) == 0){
				solutionList.add(primeNumList.get(primeNumList.size()-1));
				maxNum /= nextPrimeNum;
			}
			
			if(maxNum == 1){
				break;
			}
		}

		double endTime = System.nanoTime();
		
		System.out.println(solutionList.get(solutionList.size()-1));
		System.out.println(endTime - startTime);
	}

	private static int getNextPrimeNum(List<Integer> primeNumList) {
		int nextPrimeNum = primeNumList.get(primeNumList.size()-1) + 1;
		
		while(true){
			boolean isPrimeNum = true;
			
			for (Integer integer : primeNumList) {
				if(nextPrimeNum%integer == 0){
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
