public class PrintStringsAccordingToNumber {
	static String alphabet = "#abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		parseNumber(4, "10123", "");

	}

	private static void parseNumber(int j, String string, String result) {
		if (j < 0) {
			System.out.println(result);
			return;
		}

		int c = Integer.parseInt(string.charAt(j) + "");
		if (c>0&&c <= 26)
			parseNumber(j - 1, string, alphabet.charAt(c) + result);

		if (j > 0) {
			c = Integer.parseInt(string.charAt(j - 1) + "" + string.charAt(j)
					+ "");
			if (c>0&&c <= 26)
				parseNumber(j - 2, string, alphabet.charAt(c) + result);
		}

	}
}