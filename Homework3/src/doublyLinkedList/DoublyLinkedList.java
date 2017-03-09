package doublyLinkedList;

public class DoublyLinkedList {

	// instance variables

	private Node head;
	private Node tail;
	private int size;

	/**
	 * Constructor for an empty list
	 */

	public DoublyLinkedList() {
		this.head = new Node(null);
		this.setTail(new Node(null));
	

	}

	/**
	 * gets size
	 * 
	 * @return int size
	 */

	public int getSize() {
		return size;
	}

	/**
	 * if empty returns true else returns false
	 * 
	 * @return boolean
	 */

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * add node element to the position right after the header
	 * 
	 * @param Node
	 *            e
	 */

	public void addFirst(String input) {
		
		Node newNode = new Node(input);
		
		if(isEmpty()){
		this.head = newNode;
		size++;}
		else{
		newNode.setNext(head);
		this.head = newNode;
		size++;}
		
	}

	/**
	 * add node between two others
	 * 
	 * @param Node
	 *            e
	 * @param Node
	 *            p
	 * @param Node
	 *            n
	 */

	public void addBetween(Node e, Node p, Node n) {

		p.setNext(e);
		n.setPrev(e);

		size++;
	}

	/**
	 * loops through nodes, making a list of the elements as strings then prints
	 * them
	 * 
	 * 
	 */
	public void printForward() {

		if (isEmpty())
			System.out.println("List is Empty");

		Node current = head;

		while (current != null) {

			System.out.print(current.getElement());
			current = current.getNext();
			// result += current.getElement();
		}

	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}
