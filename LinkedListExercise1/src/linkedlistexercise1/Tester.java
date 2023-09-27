//lex_auth_012891254270844928318
//do not modify the above line

package linkedlistexercise1;

public class Tester {
	 public static void main(String args[]) {
         
	        LinkedList linkedList = new LinkedList();
	        linkedList.addAtEnd("AB");
	        linkedList.addAtEnd("BC");
	        linkedList.addAtEnd("CD");
	        linkedList.addAtEnd("DE");
	        linkedList.addAtEnd("EF");

	        String elementToBeFound = "CD";
	        int position = findPosition(elementToBeFound, linkedList.getHead());
	        if (position != 0)
	            System.out.println("The position of the element is " + position);
	        else
	        	System.out.println("The element is not found!");
	    }

	    public static int findPosition(String element, Node head) {
	    	//Implement your code here and change the return value accordingly
	    	int pos=1;
	    	while(head!=null) {
	    		if(head.getData().equals(element))
	    			return pos;
	    		pos=pos+1;
	    		head=head.getNext();
	    	}
	    	return 0;        
	    }
}
