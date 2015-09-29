import java.util.ArrayList;
import java.util.List;

public class SamuAndPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		int i = 6;
		while (i >= 1) {
			java.util.Collections.shuffle(list);
			System.out.println(list.toString());
            i--;
		}
	}

}
