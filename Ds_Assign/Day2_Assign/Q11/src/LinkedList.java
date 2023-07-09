
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public boolean createNode(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null)
			last = last.getNext();
		last.setNext(newNode);
		return true;
	}

	public boolean insertAtBeg(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertAtLAst(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null)
			last = last.getNext();
		last.setNext(newNode);
		return true;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;

		Node temp = head;
		
			if(temp == null || data<temp.getData()) {
				if(temp==head)
					insertAtBeg(data);
				return true;
			}else {
				while(temp.getNext()!=null && data>temp.getNext().getData()) {
					temp=temp.getNext();
				}
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
			}
		return true;
	}

	public boolean deleteAtPos(int pos) {
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}
		Node currNode = prev.getNext();
		Node nextNode = currNode.getNext();
		prev.setNext(nextNode);
		currNode.setNext(null);
		return true;
	}

	public void DeleteFirstNode() {
		Node temp = head;
		if (temp == null)
			return;
		head = head.getNext();
		temp = null;
	}

	public void DeleteLastNode() {
		Node temp = head;
		Node prev = null;
		while (temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
		}
		if (prev == null) // list has only 1 node
			head = null;
		else
			prev.setNext(null);
	}

	public void DisplayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void DisplayRev(Node head) {
		if (head == null)
			return;
		DisplayRev(head.getNext());
		System.out.println(head.getData() + " ");
	}

	public int countNodes() {
		int count = 0;
		Node temp = null;
		if (head == null)
			System.out.println("list is empty");
		else {
			temp = head;
			while (temp != null) {
				count++;
				temp = temp.getNext();
			}
		}
		return count;
	}

}
