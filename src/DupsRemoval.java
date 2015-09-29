import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DupsRemoval {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int listSize = Integer.parseInt(br.readLine());
		for (int i = 0; i < listSize; i++) {
			String temp = br.readLine();
			if (list.indexOf(temp) == -1) {
				list.add(temp);
			}

		}
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
	}

}
