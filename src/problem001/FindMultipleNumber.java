package problem001;

public class FindMultipleNumber {

	public static void main(String[] args) {
		int sum = 0;
		long start = System.nanoTime();
		for(int i=0; i<1000; i++){
			if(i%3 == 0){
				sum+=i;
			}else if(i%5 == 0){
				sum+=i;
			}
//			System.out.println(i + " : " + sum);
		}
		long end = System.nanoTime();
		System.out.println(sum);
		System.out.println(end-start + "(ns)");
	}
	
}
