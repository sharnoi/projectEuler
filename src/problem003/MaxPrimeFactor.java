package problem003;


public class MaxPrimeFactor {
	
	public static void main(String[] args) {
		double maxNum = 600851475143d;
						
		double startTime = System.nanoTime();
		int primeNum = 2;
		
		while(maxNum != 1){			
			if(maxNum%primeNum == 0){
				maxNum /= primeNum;
			}else{
				primeNum++;
			}
		}
		
		double endTime = System.nanoTime();
		
		System.out.println(primeNum);
		System.out.println(endTime - startTime);
	}
}
