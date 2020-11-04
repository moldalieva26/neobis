package neobistasks.week2;

import java.util.Scanner;

public class Combiner {

	public static void main(String[] args) { // uri: Accepted
		Scanner scan = new Scanner(System.in);
		int testCaseNum = scan.nextInt();
		scan.nextLine();

		int j = 0;
		while (j < testCaseNum) {

			String str = scan.nextLine();
			String[] strArr = str.split(" ");
			
			String str1 = "";
			String str2 = "";
			
			try {
			 str1 = strArr[0];
			 str2 = strArr[1];
			} catch ( Exception ArrayIndexOutOfBoundsException) {
				System.out.println("PrintP two string separated by space in one line ");
			}
			
			String strResult = "";
			if (str1.length() > str2.length()) {
				for (int i = 0; i < str2.length(); i++) {
					strResult = strResult + str1.charAt(i) + str2.charAt(i);
				}
				strResult = strResult + str1.substring(str2.length());
			} else if (str1.length() == str2.length()) {
				for (int i = 0; i < str2.length(); i++) {
					strResult = strResult + str1.charAt(i) + str2.charAt(i);
				}
			} else if (str1.length() < str2.length()) {
				for (int i = 0; i < str1.length(); i++) {
					strResult = strResult + str1.charAt(i) + str2.charAt(i);
				}
				strResult = strResult + str2.substring(str1.length());
			}
				System.out.println(strResult);
				j++;
			

		}
	}
	
	
		public static void appendStrings() {
			Scanner scan = new Scanner(System.in);
			int testCaseNum = scan.nextInt();
			scan.nextLine();

			int j = 0;
			while (j < testCaseNum) {

				String str1 = scan.nextLine();
				String str2 = scan.nextLine();
				String strResult = "";
				if (str1.length() > str2.length()) {
					for (int i = 0; i < str2.length(); i++) {
						strResult = strResult + str1.charAt(i) + str2.charAt(i);
					}
					strResult = strResult + str1.substring(str2.length());
				} else if (str1.length() == str2.length()) {
					for (int i = 0; i < str2.length(); i++) {
						strResult = strResult + str1.charAt(i) + str2.charAt(i);
					}
				} else if (str1.length() < str2.length()) {
					for (int i = 0; i < str1.length(); i++) {
						strResult = strResult + str1.charAt(i) + str2.charAt(i);
					}
					strResult = strResult + str2.substring(str1.length());
				}
					System.out.println(strResult);
					j++;
				
		}
	
}}
