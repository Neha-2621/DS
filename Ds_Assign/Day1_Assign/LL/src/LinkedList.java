
public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}
	
	public boolean createNode(int data) {
		Node newNode=new Node(data);
		if(newNode==null)
			return false;
		if(head==null) {
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null)
			last=last.getNext();
		last.setNext(newNode);
		return true;
	}
	
	public boolean insertAtBeg(int data){
		Node newNode=new Node(data);
		if(newNode==null)
			return false;
		if(head==null) {
			head=newNode;
			return true;
		}
		newNode.setNext(head);
		head=newNode;
		return true;
	}
	
	public boolean insertAtLAst(int data) {
		Node newNode=new Node(data);
		if(newNode==null)
			return false;
		if(head==null) {
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null)
			last=last.getNext();
		last.setNext(newNode);
		return true;
	}
	
	public boolean deleteAtBeg(){
		if(head==null)
			return false;
		if(head.getNext()==null) {
			head=null;
			return true;
		}
		head=head.getNext();
		return true;
	}
	
	public boolean deleteAtLAst(){
		if(head==null)
			return false;
		if(head.getNext()==null) {
			head=null;
			return true;
		}
		Node last=head;
		Node prev=null;
		while(last.getNext()!=null) {
			prev=last;
			last=last.getNext();
		}
		prev.setNext(null);
		return true;
	}
	
	public void display(){
		if(head==null)
			System.out.println("List is empty!!");
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
}
