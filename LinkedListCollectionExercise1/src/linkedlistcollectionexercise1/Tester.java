//lex_auth_012895580319694848112
//do not modify the above line

package linkedlistcollectionexercise1;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class Tester {

	public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
		ListIterator <Object> item = listTwo.listIterator(listTwo.size());
		while(item.hasPrevious())
		{
			listOne.add(item.previous());
		}
		return listOne;
	}

	public static void main(String args[]) {
		List<Object> listOne = new LinkedList<Object>();
		listOne.add("Hello");
		listOne.add(102);
		listOne.add(25);
		listOne.add(38.5);

		List<Object> listTwo = new LinkedList<Object>();
		listTwo.add(150);
		listTwo.add(200);
		listTwo.add('A');
		listTwo.add("Welcome");

		List<Object> concatenatedList = concatenateLists(listOne, listTwo);

		System.out.println("Concatenated linked list:");
		for (Object value : concatenatedList) {
			System.out.print(value + " ");
		}
	}
}
