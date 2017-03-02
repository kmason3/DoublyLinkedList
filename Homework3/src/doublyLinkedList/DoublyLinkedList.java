package doublyLinkedList;

public class DoublyLinkedList {

	// instance variables

	private Node header;
	private Node trailer;
	private int size;

	/**
	 * Constructor for an empty list
	 */

	public DoublyLinkedList() {
		header = new Node(null, null, null);
		trailer = new Node(null, header, null);
		header.setNext(trailer);
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
		return header.getNext().getElement();

	}

	/**
	 * gets the element in the last node without deleting it
	 * 
	 * @return String
	 */
	public String last() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement();
	}

	/**
	 * add node element to the position right after the header
	 * 
	 * @param Node
	 *            e
	 */

	public void addFirst(Node e) {

		addBetween(e, header, header.getNext());

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
	
	public String toString(){
		String result = "";
		Node current = header;
		
		while(current.getNext() != null){
			current = current.getNext();
            result += current.getElement() + ", ";
		}
		return "List: " + result;
	}
	public void printForward() {
		
		System.out.println(toString() + last());

	}

}
