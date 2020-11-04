package neobistasks.week2;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnInArrayW2 {
	public static void main(String[] args) { // uri: runtime error
		float avg = 0, sum = 0;
		float[][] M = new float[3][3]; //12
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine(); //?
		
		for(int i=0; i<3; i++) { //12
			for(int n=0; n<3; n++) { //12
				M[i][n] = scan.nextFloat();
			}
		} System.out.println(Arrays.deepToString(M));
		
		

		
		for(int i=0; i<3; i++) { //12
			sum = sum + M[i][num];
			}
		if (str.equals("S")) {
			System.out.println(sum);

		} else if (str.equals("M")) {
			System.out.println(sum/3); //12
		}
		
		
	}

}
