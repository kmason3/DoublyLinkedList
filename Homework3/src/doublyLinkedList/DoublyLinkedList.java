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
		head.setNext(tail);
		tail.setPrev(head);

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
			head.setNext(tail);
			tail.setPrev(head);

			size++;

		} else {

			head.setPrev(newNode);

			newNode.setNext(head);

			this.head = newNode;

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

		current.setNext(newNode);
		newNode.setPrev(tail);
		this.tail = newNode;

		tail.setPrev(current);

	}

	public void add(String input) {
		Node current = head;
		Node newNode = new Node(input);

		if (isEmpty()) {
			head = newNode;

		}

		else if (current.getElement().compareTo(input) >= 0) {
			addFirst(input);
		}

		else {
			while (input.compareTo(current.getElement()) > 0
					&& current.getNext() != null) {
				current = current.getNext();
			}

			if (current.getNext() == null
					&& input.compareTo(current.getElement()) > 0) {
				addLast(input);

			} else {
				current.getPrev().setNext(newNode);
				newNode.setPrev(current.getPrev());
				newNode.setNext(current);
				current.setPrev(newNode);

			}
		}
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

			System.out.print(current.getElement() + " ");
			current = current.getNext();

		}
		System.out.println("");

	}

}
