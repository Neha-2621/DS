
public class TestLL {

	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.createNode(10);
		l1.insert(5);
		l1.insert(50);
		l1.insert(15);
		l1.insert(30);
		l1.DisplayList();
		System.out.println(l1.countNodes());
	}


}
