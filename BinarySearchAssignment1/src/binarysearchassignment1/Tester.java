//lex_auth_0129590781838786561535
//do not modify the above line

package binarysearchassignment1;

//import binarysearchexercise1.Tester;

public class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
    	//Tester.iterations=1;
    	//int indexPosition=searchElement(customerIds, 0, customerIds.length-1, customerIdToBeSearched);
    	
    	int low=0;
    	int high=customerIds.length-1;
        int mid;
        while (low <= high) { 
            mid = (low + high)/2;
            
            //Checking if the element is present in the mid position
            if (customerIds[mid] ==customerIdToBeSearched){
                return mid;
            } 
            // If the element is greater than the element in the mid position, 
            // low is updated
            if (customerIds[mid] < customerIdToBeSearched) {
               // ++Tester.iterations;
                low = mid+1;
            }
            // Else high is updated
            else{
                //++Tester.iterations;
                high = mid - 1;
            }
        }
        //Tester.iterations=0;
        return -1;
	}
	
	public static void main(String[] args) {
		int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
		int customerIdToBeSearched = 80462;

		int index = searchCustomerId(customerIds, customerIdToBeSearched);
		
		if (index == -1)
			System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
		else
			System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index+"!");
	}
	

}