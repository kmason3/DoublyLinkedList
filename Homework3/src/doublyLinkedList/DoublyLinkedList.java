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
		head = new Node(null);
		tail = new Node(null);
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
	 * gets element of first node in list without deleting it
	 * 
	 * @return String
	 */

	public String first() {
		if (isEmpty())
			return null;
		return head.getNext().getElement();

	}

	/**
	 * gets the element in the last node without deleting it
	 * 
	 * @return String
	 */
	public String last() {
		if (isEmpty())
			return null;
		return tail.getPrev().getElement();
	}

	/**
	 * add node element to the position right after the header
	 * 
	 * @param Node
	 *            e
	 */

	public void addFirst(Node e) {
		if (isEmpty())
			addBetween(e, head, tail);
		else
			addBetween(e, head, head.getNext());
	}

	public void addLast(Node e) {
		Node last = tail.getPrev();

		last.setNext(e);

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

		Node current = head.getNext();

		while (current != null) {

			System.out.print(current.getElement());
			current = current.getNext();
			// result += current.getElement();
		}
		// if (size == 1) {
		// System.out.println("List: " + result);
		// } else
		// System.out.println("List: " + result + last());
		//
	}

}
