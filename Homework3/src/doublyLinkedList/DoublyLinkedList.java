package doublyLinkedList;

public class DoublyLinkedList {

	private Node header;
	private Node trailer;
	private int size;

	public DoublyLinkedList() {
		header = new Node(null, null, null);
		trailer = new Node(null, header, null);
		header.setNext(trailer);
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public String first(){
		if(isEmpty()) return null;
		return header.getNext().getElement();

	}

	public String last(){
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();
	}
	
}
