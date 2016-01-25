package problem011;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyInMatrix {

	public static void main(String[] args) {
		int[][] numArr = getFileString("src/problem011/Matrix.txt");
		
		int solution = 0;
		int count = 1;
		for(int i=0; i<numArr.length; i++){
			for(int j=0; j<numArr[i].length; j++){
				for(int k=0; k<4; k++){
					int multi=0;
					switch(k){
					case 0:
						if(i < numArr.length-3){
							multi = numArr[i][j] * numArr[i+1][j] * numArr[i+2][j] * numArr[i+3][j];
						}						
						break;
					case 1:
						if(i<numArr.length-3 && j<numArr.length-3){
							multi = numArr[i][j] * numArr[i+1][j+1] * numArr[i+2][j+2] * numArr[i+3][j+3];
						}						
						break;
					case 2:
						if(j<numArr.length-3){
							multi = numArr[i][j] * numArr[i][j+1] * numArr[i][j+2] * numArr[i][j+3];
						}
						break;
					case 3:
						if(i<numArr.length-3 && j>=3){
							multi = numArr[i][j] * numArr[i+1][j-1] * numArr[i+2][j-2] * numArr[i+3][j-3];
						}						
						break;
					}
					
					System.out.println(count++ + " : " + multi + "(" + i + "," + j + "," + k + ")");
					
					if(solution < multi){
						solution = multi;
					}
				}
			}
		}
		
		System.out.println(solution);
	}

	private static int[][] getFileString(String filePath) {
		BufferedReader br = null;
		int[][] numArr = new int[20][20];
		try {
			br = new BufferedReader(new FileReader(new File(filePath)));
			String str = null;
			int count = 0;
			while((str = br.readLine()) != null){
				String[] splitStr = str.split(" ");
				for(int i=0; i<splitStr.length; i++){
					numArr[count][i] = Integer.valueOf(splitStr[i]);
				}
				count++;
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
		
		return numArr;
	}
}
