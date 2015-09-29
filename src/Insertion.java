import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insertion {

	public void print(BinarySearchNode root) {

		if (root != null) {
			print(root.getLeft());
			System.out.print(root.getData());
			System.out.print(" ");
			print(root.getRight());
		}
	}

	public BinarySearchNode delete(BinarySearchNode root, int data) {

		BinarySearchNode parent;
		if (search(root, data) == null) {
			//System.out.println("element not found .... cannot delete ");
			return null;
		} else {

			if (root.getData() == data) {
				BinarySearchNode temp = root;
				if (temp.getLeft() == null && temp.getRight() == null) {
					return null;
				}
				if (temp.getLeft() == null) {

					parent = temp;
					temp = temp.getRight();
					parent.setData(temp.getData());
					return delete(parent.getRight(), data);
				} else if (temp.getRight() == null) {

					parent = temp;
					temp = temp.getLeft();
					parent.setData(temp.getData());
					return delete(parent.getLeft(), data);
				} else {

					temp = temp.getRight();
					while (temp.getLeft() != null) {
						temp = temp.getLeft();
					}
					root.setData(temp.getData());
					temp.setData(data);
					root.setRight(delete(root.getRight(), data));
					return root;
				}

			} else {
				if (data < root.getData()) {
					root.setLeft(delete(root.getLeft(), data));
				} else if (data > root.getData()) {
					root.setRight(delete(root.getRight(), data));
				}
				return root;
			}

		}

	}

	public BinarySearchNode search(BinarySearchNode root, int data) {

		if (root == null)
			return null;
		if (root.getData() == data) {
			System.out.println("Element found");
			return root;
		} else {
			if (root.getData() < data) {
				search(root.getRight(), data);
			}
			if (root.getData() > data) {
				search(root.getLeft(), data);
			}
		}
		return null;

	}

	public BinarySearchNode insert(BinarySearchNode root, int data) {

		if (root == null) {
			root = new BinarySearchNode();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		}

		if (root.getData() > data) {
			root.setLeft(insert(root.getLeft(), data));
		} else if (root.getData() < data) {
			root.setRight(insert(root.getRight(), data));
		}
		return root;
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BinarySearchNode root = null;
		Insertion in = new Insertion();
		int i = 0;
		
		String check="yes";
		do {
			System.out.println("Enter any number for operation");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			i = Integer.parseInt(br.readLine());
			switch (i) {

			case 1: {
				System.out.println("Enter the data");
				BufferedReader k = new BufferedReader(new InputStreamReader(
						System.in));
				root=in.insert(root, Integer.parseInt(k.readLine()));
				break;
			}
			case 2: {
				System.out.println("print the tree contents in inorder traversal");
				in.print(root);
				break;
			}
			case 3: {
				System.out.println("Find the element");
				BufferedReader k = new BufferedReader(new InputStreamReader(
						System.in));

				if (in.search(root, Integer.parseInt(k.readLine())) != null) {
					System.out.println("Element  found");
				}
				else{
					System.out.println("Element not found");
				}
				break;
			}
			case 4: {
				System.out.println("Delete this element");
				BufferedReader k = new BufferedReader(new InputStreamReader(
						System.in));
				BinarySearchNode temp=in.delete(root, Integer.parseInt(k.readLine()));
				if(temp!=null){
				root=temp;
				System.out.println("Elements after deletion");
			     in.print(root);
				}
				else{
					System.out.println("element not found");
				}
				break;
			}
			}
         System.out.println("you want to continue");
         BufferedReader brCheck=new BufferedReader(new InputStreamReader(System.in));
        		 check=brCheck.readLine();
		} while (check.equalsIgnoreCase("yes"));

	}
}

class BinarySearchNode {

	private int data;
	private BinarySearchNode left;
	private BinarySearchNode right;

	public int getData() {
		return data;
	}

	public BinarySearchNode getLeft() {
		return left;
	}

	public BinarySearchNode getRight() {
		return right;
	}

	public void setLeft(BinarySearchNode left) {
		this.left = left;
	}

	public void setRight(BinarySearchNode right) {
		this.right = right;
	}

	public void setData(int data) {
		this.data = data;
	}
}