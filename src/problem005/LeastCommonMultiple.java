package problem005;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		double lcm = 2d;
		
		double startTime = System.nanoTime();
		for(double i=3d; i<=20; i++){
			lcm = (i<lcm) ? getLcm(i, lcm) : getLcm(lcm, i);
		}
		double endTime = System.nanoTime();
		
		System.out.println(lcm);
		System.out.println(endTime-startTime);
	}
	
	private static double getLcm(double min, double max){
		return (min*max)/getGcd(min, max);
	}

	private static double getGcd(double min, double max) {
		if(max%min == 0){
			return min;
		}else{
			return getGcd(max%min, min);
		}
	}

}
