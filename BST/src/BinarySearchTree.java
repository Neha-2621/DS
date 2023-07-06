import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (root == null)
			root = newNode;
		Node temp = root;
		while (true) {
			if (data == temp.getData())
				return false;
			if (data > temp.getData()) {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			} else {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			}
		}
	}

	public int getMax() {
		if (root == null)
			return -1;
		Node temp = root;
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getData();
	}

	public int getMin() {
		if (root == null)
			return -1;
		Node temp = root;
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	public void preOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		System.out.println("PreOrder : ");
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}

	public void InOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		System.out.println("InOrder : ");
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	

	public void postOrder() {
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}

		Node temp = root;
		Stack<Pair> stack = new Stack<>();
		System.out.println("PostOrder : ");
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}
			Pair pair = stack.pop();
			if (pair.flag == 'L') {
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);
			} else
				System.out.print(pair.node.getData() + " ");
		}
		System.out.println();
	}

	public boolean find(int data) {
		Node temp = root;

		while (temp != null) {
			if (root == null)
				return false;
			if (data == temp.getData())
				return true;
			if (data > temp.getData())
				temp = temp.getRight();
			else
				temp = temp.getLeft();
		}
		return false;
	}

	public boolean findRec(int data, Node root) {
		if (root == null)
			return false;
		if (data == root.getData())
			return true;
		if (data > root.getData()) {
			findRec(data, root.getRight());
			return true;
		} else {
			findRec(data, root.getLeft());
			return true;
		}
	}

	public int countNodesRec(Node root) {
		Node temp = root;
		int cnt = 0;
		if (root != null) {
			cnt = 1;
			cnt += countNodesRec(temp.getLeft());
			cnt += countNodesRec(temp.getRight());
		}
		return cnt;
	}

	public int countNodes() {
		if (root == null)
			return -1;
		int cnt = 0;
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.empty()) {
			temp = stack.pop();
			cnt++;
			if (temp.getRight() != null)
				stack.push(temp.getRight());
			if (temp.getLeft() != null)
				stack.push(temp.getLeft());
		}
		return cnt;
	}

	public boolean delete(int data) {
		if (root == null)
			return false;
		Node prnt = root, del = root;
		Node curr, prev = null;
		Node temp = null;

		while (del.getData() != data) {
			if (data < del.getData()) {
				prnt = del;
				del = del.getLeft();
			} else {
				prnt = del;
				del = del.getRight();
			}
			if (del == null)
				return false;
		}

		if(data==root.getData()) {
			
		}
		if (del.getLeft() == null && del.getRight() == null) {
			if (del == root) {
				root = null;
				return true;
			}
			if (prnt.getLeft() == del)
				prnt.setLeft(null);
			else
				prnt.setRight(null);
			return true;
		} else if (del.getLeft() != null && del.getRight() != null) {
			temp = del;
			if (prnt.getLeft() == temp) {
				curr = temp.getRight();
				while (curr != null) {
					prev = curr;
					curr = curr.getLeft();
				}
				prev.setLeft(temp.getLeft());
				// curr.setLeft(temp.getLeft());
				prnt.setLeft(temp.getRight());
				return true;
			} else {
				curr = temp.getLeft();
				while (curr != null) {
					prev = curr;
					curr = curr.getRight();
				}
				prev.setRight(temp.getRight());
				// curr.setRight(temp.getRight());
				prnt.setRight(temp.getLeft());
				return true;
			}
		}
		if (prnt.getLeft() == del) {
			if (del.getRight() == null) {
				prnt.setLeft(del.getLeft());
				return true;
			} else {
				prnt.setLeft(del.getRight());
				return true;
			}
		} else if (prnt.getRight() == del) {
			if (del.getLeft() == null) {
				prnt.setRight(del.getRight());
				return true;
			} else {
				prnt.setRight(del.getLeft());
				return true;
			}
		}
		return false;
	}

}
