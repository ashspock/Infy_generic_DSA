//lex_auth_012892737233928192129
//do not modify the above line

package linkedlistcollectionassignment2;

import java.util.LinkedList;
import java.util.List;

public class Tester {
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    List<Integer> nl=new LinkedList<Integer>();
	    for(int i:listOne) {
	    	if(listTwo.contains(i))
	    		nl.add(i);
	    }
	    return nl;
	}
	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne, listTwo));
	}

}
