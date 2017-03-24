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
		System.out.println(list.find("a"));
		System.out.println(list.find("z"));

		
		
	}

}
