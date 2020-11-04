package neobistasks.week2;

import java.util.Scanner;

public class Huahua {
	public static void main(String[] args) { // uri: Accepted

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char[] strCharArr = str.toCharArray();

		String resultStr = "";

		for (int i = 0; i < strCharArr.length; i++) {

			char ch = strCharArr[i];

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				resultStr += ch;
			}

		} // System.out.println(resultStr);

		String reversedStr = "";

		for (int i = (resultStr.length() - 1); i >= 0; i--) {
			reversedStr += resultStr.charAt(i);
		}

		// System.out.println(reversedStr);

		if (resultStr.equals(reversedStr)) {
			System.out.println("S");
		} else {
			System.out.println("N");

		}

	}

}
