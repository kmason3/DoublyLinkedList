package doublyLinkedList;

public class Main {
	
	public static void main(String[]args){
		DoublyLinkedList list = new DoublyLinkedList();
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.getSize());
//		System.out.println(list.first());
//		System.out.println(list.last());
		
		Node a = new Node("A");
		Node b = new Node("B");
		
		list.addFirst(a);
		
//		System.out.println(list.getSize());
//		System.out.println(list.first());
		
		list.addFirst(b);
		
		System.out.println(list.getSize());
		System.out.println(list.first());
		System.out.println(list.last());
		
		
		Node c = new Node("C");
		
		list.addBetween(c, b, a);
		
		System.out.println(list.getSize());
		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(b.getNext().getElement());
		
		list.printForward();
		
		
		
		
	}

}
