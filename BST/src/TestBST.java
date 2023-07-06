
public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(40);
        bst.insert(25);
        bst.insert(90);
        bst.insert(60);
        bst.insert(100);
        bst.insert(55);
        bst.insert(80);
		System.out.println(bst.find(10));
		System.out.println(bst.findRec(100, bst.getRoot()));
		bst.preOrder();
        bst.InOrder();
        bst.postOrder();
        System.out.println("count : "+bst.countNodes());
        System.out.println("cnt : "+bst.countNodesRec(bst.getRoot()));
        System.out.println(bst.delete(60));
        bst.preOrder();
	}

}
