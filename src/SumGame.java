import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumGame {

	public static int generateSum(Integer number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			int j = 1;
			for (; j <= number; j++) {
				int k = 1;
				for (; k <= number; k++) {
					int l = 1;
					for (; l <= number; l++) {

						/*
						 * System.out.println("i  "+i+"  j   "+j+"  k "+k+"  l  "
						 * +l); System.out.println((i<=j)&&(j<=k)&&(k<=l));
						 */
						if ((i <= j) && (j <= k) && (k <= l)) {

							if ((i + j + k + l) == number) {
								count++;
							}
						}

					}
					if (k > l) {
						break;
					}
				}
				if (j > k) {
					break;
				}
				if (i > j) {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer noOfTestCases = Integer.parseInt(br.readLine());
		while (noOfTestCases > 0) {
			/* System.out.println("The answer is "); */
			System.out.println(generateSum(Integer.parseInt(br.readLine())));
			noOfTestCases--;
		}
	}

}
