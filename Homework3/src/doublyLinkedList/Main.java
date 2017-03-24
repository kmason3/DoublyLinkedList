package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		// Creates empty list
		DoublyLinkedList list = new DoublyLinkedList();
		
		// adds a to an empty list
		list.add("a");
		list.printForward();
		
		// adds n in alphabetical order
		list.add("n");
		list.printForward();
		
		// adds b in alphabetical order
		list.add("b");
		list.printForward();
		
		// adds i and c in alphabetical order
		list.add("i");
		list.add("c");
		
		// deletes n
		list.deleteNode("n");
		list.printForward();
		list.printBackward();
		
		// Searches list for a and z
		System.out.println(list.find("a"));
		System.out.println(list.find("z"));
		
		// deletes list
		list.deleteList();
		
		// tests that list is deleted
		list.printForward();
		list.printBackward();

	}

}
