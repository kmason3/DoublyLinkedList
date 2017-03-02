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
	 * @return int
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

	public void addFirst(Node e) {

				
		System.out.println("Check");
		addBetween(e, header, header.getNext());

	}
	
	public void addBetween(Node e, Node p, Node n){
		
		p.setNext(e);
		n.setPrev(e);
		
		size++;
	}
}
