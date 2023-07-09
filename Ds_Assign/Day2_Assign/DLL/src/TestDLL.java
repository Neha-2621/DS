
public class TestDLL {
	public static void main(String[] args) {

		DLL dll = new DLL();
		dll.insertNode(10);
		dll.insertNode(20);
		dll.insertNode(30);
		dll.insertNode(40);
		dll.displayData();

		dll.insertAtPosition(50, 1);
		dll.displayData();
		dll.insertAtPosition(60, 4);
		dll.displayData();
		dll.insertAtPosition(70, 7);
		dll.displayData();
		dll.insertAtPosition(80, 9);
		dll.displayData();

		dll.deleteByPosition(1);
		dll.displayData();
		dll.deleteByPosition(4);
		dll.displayData();
		dll.deleteByPosition(5);
		dll.displayData();
		dll.deleteByPosition(5);
		dll.displayData();

	}
}
