//lex_auth_012891246204076032304
//do not modify the above line

package linkedlistassignment2;

public class Tester {
	public static void main(String args[]) {

		LinkedList linkedList = new LinkedList();
		LinkedList reversedLinkedList = new LinkedList();

		linkedList.addAtEnd("Data");
		linkedList.addAtEnd("Structures");
		linkedList.addAtEnd("and");
		linkedList.addAtEnd("Algorithms");

		System.out.println("Initial List");
		linkedList.display();

		System.out.println();

		reverseList(linkedList.getHead(), reversedLinkedList);
		System.out.println("Reversed List");
		reversedLinkedList.display();
	}

	public static void reverseList(Node head, LinkedList reversedLinkedList) {
		// Implement your code here
		 while(head!=null){
			 reversedLinkedList.addAtBeginning(head.getData());
			 head=head.getNext();
		 }
	}
}
