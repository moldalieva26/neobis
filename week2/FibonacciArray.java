package neobistasks.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciArray {
	public static void main(String[] args) { // uri: Runtime error

		List<Long> fibArray = new ArrayList<Long>();

		fibArray.add(0L);
		fibArray.add(1L);

		for (int i = 2; i <= 60; i++) {
			fibArray.add((fibArray.get(i - 2) + fibArray.get(i - 1)));
		}
		// System.out.println(fibArray);

		Scanner scan = new Scanner(System.in);
		int testCasesNum = scan.nextInt();

		int n = 0;
		while (n <= testCasesNum) {
			int fibTerm = scan.nextInt();
			long finNum = fibArray.get(fibTerm);

			System.out.println("Fib(" + fibTerm + ") = " + finNum);
			n++;
		}

	}

}
