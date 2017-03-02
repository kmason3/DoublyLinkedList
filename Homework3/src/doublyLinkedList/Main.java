package doublyLinkedList;

public class Main {
	
	public static void main(String[]args){
		DoublyLinkedList list = new DoublyLinkedList();
		
		System.out.println(list.isEmpty());
		System.out.println(list.getSize());
		System.out.println(list.first());
		System.out.println(list.last());
		
		Node first = new Node("A");
		Node next = new Node("B");
		
		list.addFirst(first);
		
		System.out.println(list.getSize());
		System.out.println(list.first());
		
		list.addFirst(next);
		
		System.out.println(list.getSize());
		System.out.println(list.first());
		System.out.println(list.last());
		
		
	}

}
