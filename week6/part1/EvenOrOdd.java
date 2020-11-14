package neobistasks.week6;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("foo " + num);
		} else {
			System.out.println("bar " + num);

		}
	}

}
