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
		this.tail = new Node(null);

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
	 * add node element to the first position
	 * 
	 * @param String
	 *            input
	 * 
	 */

	public void addFirst(String input) {

		Node newNode = new Node(input);

		if (isEmpty()) {
			this.head = newNode;

			size++;
		} else {

			head.setPrev(newNode);

			newNode.setNext(head);

			this.head = newNode;
			size++;
		}

	}

	public void addLast(String input) {
		Node newNode = new Node(input);

		if (isEmpty()) {
			this.tail = newNode;

			size++;
		}
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		tail.setPrev(newNode);
		current.setNext(newNode);
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

		}
		System.out.println("");

	}

}
