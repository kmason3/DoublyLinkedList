package doublyLinkedList;

public class Main {
	
	public static void main(String[]args){
		DoublyLinkedList list = new DoublyLinkedList();
//			
		Node a = new Node("A");
		Node b = new Node("B");
//		
//		list.addFirst(a);
		list.addFirst(b);
////		
//////		System.out.println(list.getSize());
//////		System.out.println(list.first());
//////		System.out.println(list.last());
////		
////		
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
//		Node i = new Node("I");
////		
		list.addBetween(c, b, a);
		list.addBetween(d, c, a);
		list.addBetween(e, d, a);
		list.addBetween(f, e, a);
		list.addBetween(g, f, a);
		list.addBetween(h, g, a);
//		list.addLast(i);
////		
////		
		
		System.out.println(list.getSize());
		System.out.println(list.first());
//		System.out.println(list.last());
//				
		list.printForward();
		
		
		
		
	}

}
