
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.createNode(10);
		l1.createNode(20);
		l1.createNode(30);
		l1.createNode(40);
		l1.createNode(50);
		l1.DisplayList();
		l1.insertAtPosition(100, 3);
		l1.DisplayList();
		l1.deleteAtPos(2);
		System.out.println("After deleting");
		l1.DisplayList();
		System.out.println("rev : ");
		l1.DisplayRev(l1.getHead());
		l1.insertAtPosition(102,1);
		l1.insertAtPosition(500,2);
		l1.insertAtPosition(800,1);
		l1.DisplayList();
		l1.DeleteFirstNode();
		System.out.println("after deleting 1st node");
		l1.DisplayList();
		System.out.println("after deleting last node");
		l1.DeleteLastNode();
		l1.DisplayList();
		System.out.println(l1.countNodes());
	}

}
