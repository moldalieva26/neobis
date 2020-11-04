package neobistasks.week2;

public class CompareSubstring {
	public static void main(String[] args) { // uri: how to take input?
		String str1 = "Hey This java is hot";
		String str2 = "Java is a new paradigm"; // 7

		int countMaxLength = 0;
		int endIndex = str1.length();

		int[][] lookup = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 1; i <= str1.length(); i++) {

			for (int j = 1; j <= str2.length(); j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					// review!
					lookup[i][j] = lookup[i - 1][j - 1] + 1; /// ?
					if (lookup[i][j] > countMaxLength) // ?
					{
						countMaxLength = lookup[i][j]; /// ?
						endIndex = i;
					}

				}

			}
		}

		String longestSubstring = str1.substring(endIndex - countMaxLength, endIndex);
		// System.out.println(longestSubstring + " - " + countMaxLength);
		System.out.println(countMaxLength);

	}

}
