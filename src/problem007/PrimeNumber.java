package problem007;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		List<Double> primeNumList = new ArrayList<Double>();
		primeNumList.add(new Double(2));
		
		double startTime = System.nanoTime();
		
		while(primeNumList.size() != 10001){
			primeNumList.add(getNextPrimeNum(primeNumList));
		}
		
		double endTime = System.nanoTime();
		
		System.out.println(primeNumList.get(primeNumList.size()-1));
		System.out.println(endTime - startTime);
	}

	private static double getNextPrimeNum(List<Double> primeNumList) {
		double nextPrimeNum = primeNumList.get(primeNumList.size()-1) + 1;
		
		while(true){
			boolean isPrimeNum = true;
			
			for (Double primeNum : primeNumList) {
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
