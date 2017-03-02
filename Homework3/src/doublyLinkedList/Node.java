package doublyLinkedList;

public class Node {
	
	private String element;
	private Node prev;
	private Node next;
	
	public Node (String e, Node p, Node n){
		setElement(e);
		setPrev(p);
		setNext(n);
	}
	
	
	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
