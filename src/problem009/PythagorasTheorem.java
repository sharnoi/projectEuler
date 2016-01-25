package problem009;

public class PythagorasTheorem {

	public static void main(String[] args) {
		int a,b,c;
		
		double startTime = System.nanoTime();
		for(int i=1; i<500; i++){
			a = i;
			for(int k=a+1; k<500; k++){
				b = k;
				c = 1000-a-b;
				
				if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)){
					System.out.println(a*b*c);
					
					double endTime = System.nanoTime();
					System.out.println(endTime - startTime + "(ns)");
					return;
				}				
			}
		}
	}

}
