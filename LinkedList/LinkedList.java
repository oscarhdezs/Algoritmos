public class LinkedList {

	protected Node head;
	protected Node tail;
	protected int size;
	
	public int getSize() {
		return size;
	}
	
	public void add(int element) {
		Node node = new Node(element);
		if(head==null && tail==null) {
			head = node;
			tail = node;
		}
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public void showElement() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.getElement());
			node = node.getNext();
		}
	}
	
	public void sort() {
		Node current;
		Node next;
		int size = this.getSize();
		for(int x=0;x<size-1;x++) {
			current = head;
			next = head.getNext();
			for(int y=0;y<size-1-x;y++) {
				if(current.getElement()>next.getElement()) {
					int temp = current.getElement();
					current.setElement(next.getElement());
					next.setElement(temp);
				}
				current = current.getNext();
				next = current.getNext();
			}
		}
	}
	
	public void reverse() {
		Node current = head;
		Node previous =null;
		Node forward = null;
		
		while(current.getNext()!=null) {
			//aving reference of next node, 
			forward = current.getNext();
			
			//Insert node at start of new list
			current.setNext(previous);
			previous = current;
			
			//Advancing to next node
			current = forward;
		}
		head = current;
		head.setNext(previous);
	}
	
}
