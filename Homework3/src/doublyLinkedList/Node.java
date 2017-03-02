package doublyLinkedList;

public class Node {
	//instance variables
	private String element;
	private Node prev;
	private Node next;
	/**
	 * constructor for node 
	 * @param String element
	 * @param Node previous
	 * @param Node next
	 */
	public Node (String e, Node p, Node n){
		setElement(e);
		setPrev(p);
		setNext(n);
	}
	
	//getters and setters
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
