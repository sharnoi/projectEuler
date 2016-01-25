package problem008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindMaxMutiply {

	public static void main(String[] args) {		
		String numbers = getFileString("src/problem8/Numbers.txt");
		int solution = 0;
		
		double startTime = System.nanoTime();
		
		for(int i=0; i<numbers.length()-5; i++){
			int multiValue = 1;
			for(int k=0; k<5; k++){
				multiValue *= Integer.valueOf(String.valueOf(numbers.charAt(i+k)));
			}
			
			if(solution < multiValue){
				solution = multiValue;
			}
		}
		
		double endTime = System.nanoTime();
		
		System.out.println(solution);
		System.out.println(endTime - startTime + "(ns)");
	}

	private static String getFileString(String filePath) {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(filePath)));
			String str = null;
			while((str = br.readLine()) != null){
				sb.append(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}

}
