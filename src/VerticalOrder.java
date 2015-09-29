import java.io.BufferedReader;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


//vertical sum can be calculated by iterating hashmap
public class VerticalOrder {

	public static HashMap<Integer, ArrayList<Integer>> result = new HashMap<Integer, ArrayList<Integer>>();

	public Node insertion(Node root, int data) {

		if (root == null) {
			root = new Node();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		} else {
			if (root.getData() < data) {
				root.setRight(insertion(root.getRight(), data));
			}
			if (root.getData() > data) {
				root.setLeft(insertion(root.getLeft(), data));
			}
		}
		return root;
	}

	public void printVerticalOrder(Node root, int count) {
		if (root != null) {

			if (root.getLeft() != null) {
				count--;
			}
			printVerticalOrder(root.getLeft(), count);
			ArrayList<Integer> temp=new ArrayList<Integer>();
			if(result.get(count)!=null){
			 temp=result.get(count);
			temp.add(root.getData());
			}
			else{
				temp.add(root.getData());
			}
			result.put(count,temp);
			if (root.getRight() != null) {
				count++;
			}
			printVerticalOrder(root.getRight(), count);
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		VerticalOrder in = new VerticalOrder();
		Node root = null;
		String check = "yes";
		do {

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int data = Integer.parseInt(br.readLine());

			root = in.insertion(root, data);
			System.out.println("Do you want to continue");
			BufferedReader strCheck = new BufferedReader(new InputStreamReader(
					System.in));
			check = strCheck.readLine();

		} while (check.equalsIgnoreCase("yes"));

		in.printVerticalOrder(root, 0);
		System.out.println("The verical order is");
		for (Integer key : result.keySet()) {
			System.out.print(key + "  --   ");
			System.out.println(result.get(key));
		}
	}

}

class Node {
	private int data;
	private Node left;
	private Node right;

	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}