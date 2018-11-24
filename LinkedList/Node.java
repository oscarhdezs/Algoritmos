public class Node {

	private Node next;
	private int element;
	
	public Node(int element) {
		this.element = element;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}

}
