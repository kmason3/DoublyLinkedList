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
			System.out.println("The head is: " + this.head.getElement());

			
		} else {

			head.setPrev(newNode);

			newNode.setNext(head);

			this.head = newNode;
			size++;
			
			System.out.println("The head is: " + this.head.getElement());
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
		tail= newNode;
		current.setNext(newNode);
		
		tail.setPrev(current);
		size++;
		System.out.println("the tail is: " + this.tail.getElement());
		System.out.println("before the tail is: " + tail.getPrev().getElement());
		
		

	}

	public void add(String input) {

		if (isEmpty() || head.getElement().compareTo(input) >= 0) {
			addFirst(input);
		}
		if(tail ==null || head.getElement().compareTo(input)<0){
			addLast(input);
		}
		
		
		
		else{
			

			Node current = head;
			Node newNode = new Node(input);
			
			
			while(current != null && newNode.getElement().compareTo(current.getElement()) > 0){
				
				current = current.getNext();
				
			}
			
			
		}
			
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
