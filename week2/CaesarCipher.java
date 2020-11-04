package neobistasks.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) { // uri: Accepted

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner scan = new Scanner(System.in);
		int testCaseNum = scan.nextInt();
		scan.nextLine();

		int j = 0;
		while (j < testCaseNum) {
			String str = scan.nextLine(); 
			int shiftNum = scan.nextInt(); 
			scan.nextLine();

			String newStr = "";

			for (int i = 0; i < str.length(); i++) {
				int index = alphabet.indexOf(str.charAt(i)); 
	
				int newIndex = index - shiftNum;

				if (newIndex >= 0) {
					newStr = newStr + alphabet.charAt(newIndex); 
				}
				if (newIndex < 0) {
					int newIndex2 = 26 + newIndex;
					newStr = newStr + alphabet.charAt(newIndex2);
				}
			}
			System.out.println(newStr);

			j++;
		}

	}
}
