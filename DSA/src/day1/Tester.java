package day1;

public class Tester {

	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Vienna");
		//System.out.println("Adding an element to the linked list");
		list.addAtBeginning("Czech");
		list.insert("Prague", "Munich");
		list.display();
		

		if (list.find("Munich") != null)
			System.out.println("Node found");
		else
			System.out.println("Node not found");
		
		System.out.println("--------------------------");
		list.delete("Czech");
		list.display();
	}

}
