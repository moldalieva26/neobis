package neobistasks.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
	public static void main(String[] args) throws Exception { // uri: Wrong answer (100%)
		PasswordValidator.validatePassword2();

	}
	public static void validatePassword2() {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();

		while (password!=null) { // scan.hasNext()
			 password = scan.nextLine();
			boolean hasDigit = password.matches(".*\\d+.*");

			Pattern pattern = Pattern.compile("\\s");
			Matcher matcher = pattern.matcher(password);
			
			boolean found = matcher.find();

			if (password.length() >= 6 && password.length() <= 32 && hasDigit && !found) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))) {
						String passwordUpperCase = password.toUpperCase();
						String passwordLowerCase = password.toLowerCase();
						if (!password.equals(passwordLowerCase) && !password.equals(passwordUpperCase)) {
						}
					}
				}
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
		} 			scan.close();

	}


	public static void validatePassword3() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine())!=null) { 
			String password = br.readLine();
			System.out.println(password);

			boolean hasDigit = password.matches(".*\\d+.*");

			Pattern pattern = Pattern.compile("\\s");
			Matcher matcher = pattern.matcher(password);
			boolean found = matcher.find();

			if (password.length() >= 6 && password.length() <= 32 && hasDigit && !found) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))) {
						String passwordUpperCase = password.toUpperCase();
						String passwordLowerCase = password.toLowerCase();
						if (!password.equals(passwordLowerCase) && !password.equals(passwordUpperCase)) {
						}
					}
				}
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}}
	}

	
	
	public static void validatePassword() {

		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine(); // instead of file

		Scanner sn = new Scanner(password);
		while (sn.hasNext()) {

			boolean hasDigit = password.matches(".*\\d+.*");

			Pattern pattern = Pattern.compile("\\s");
			Matcher matcher = pattern.matcher(password);
			boolean found = matcher.find();
			// boolean isWhitespace = password.matches("^\\s*$");

			if (password.length() >= 6 && password.length() <= 32 && hasDigit && !found) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i))) {
						String passwordUpperCase = password.toUpperCase();
						String passwordLowerCase = password.toLowerCase();
						if (!password.equals(passwordLowerCase) && !password.equals(passwordUpperCase)) {
						}
					}
				}
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
		}
	}

}
