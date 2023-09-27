//lex_auth_01289490689703936088
//do not modify the above line

package binarysearchexercise1;

public class Tester {
	public static int iterations=0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		 Tester.iterations=1;
	        int mid;
	        while (low <= high) { 
	            mid = (low + high)/2;
	            
	            //Checking if the element is present in the mid position
	            if (elements[mid] == elementToBeSearched){
	                return mid;
	            } 
	            // If the element is greater than the element in the mid position, 
	            // low is updated
	            if (elements[mid] < elementToBeSearched) {
	                ++Tester.iterations;
	                low = mid+1;
	            }
	            	
	         
	            // Else high is updated
	            else{
	                ++Tester.iterations;
	                high = mid - 1;
	            }
	        }
	        //Tester.iterations=0;
	        return -1;
	}
	
	public static void main(String[] args) {
	    int[] elements = { 1, 2,3,4,5 };
		int elementToBeSearched = 6;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}
}
