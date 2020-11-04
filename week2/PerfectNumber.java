package neobistasks.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) { // uri: Accepted

		Scanner scan = new Scanner(System.in);
		int testCaseNum = scan.nextInt();
		int j = 0;
		while(j<testCaseNum) {
			long num = scan.nextLong();
			List<Long> numList = new ArrayList<Long>();

			long positiveDevisor = 0;
			for (long i = 1; i < num; i++) {
				if (num % i == 0) {
					positiveDevisor = i;
					numList.add(positiveDevisor);
				}

			}
			 System.out.println(numList);
			long sum = 0;
			for (int i = 0; i < numList.size(); i++) { // int?
				sum = sum + numList.get(i);
			}

			if (sum == num) {
				System.out.println(num + " eh perfeito");
			} else {
				System.out.println(num + " nao eh perfeito");

			}
			
			j++;
		}
	
		

	}

}
