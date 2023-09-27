//lex_auth_012892758109396992138
//do not modify the above line

package linkedlistcollectionassignment1;

import java.util.LinkedList;
import java.util.List;

public class Tester {
	public static List<Integer> removeDuplicates(List<Integer> list) {
       List<Integer> newList = new LinkedList<Integer>();
       for(int i:list) {
    	   if(!newList.contains(i))
    		   newList.add(i);
       }
       return newList;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
}
