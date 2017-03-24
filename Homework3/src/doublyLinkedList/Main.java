package doublyLinkedList;

public class Main {
	
	public static void main(String[]args){
		DoublyLinkedList list = new DoublyLinkedList();

		list.add("a");
		list.printForward();
		
		list.add("n");
		list.printForward();
		
		list.add("b");
		list.printForward();
		
		list.add("i");
		list.add("c");
		list.printForward();
		list.printBackward();
		list.find("a");
		list.find("z");

		
		
	}

}
