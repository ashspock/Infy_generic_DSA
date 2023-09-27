//lex_auth_012889379825164288907
//do not modify the above line

package queueexercise1;


public class Tester {
	 public static void main(String[] args) {
         
	        Queue queue = new Queue(7);
	        queue.enqueue(2);
	        queue.enqueue(7);
	        queue.enqueue(9);
	        queue.enqueue(4);
	        queue.enqueue(6);
	        queue.enqueue(5);
	        queue.enqueue(10);

	        Queue[] queueArray = splitQueue(queue);
	            
	        System.out.println("Elements in the queue of odd numbers");
	        queueArray[0].display();
	            
	        System.out.println("\nElements in the queue of even numbers");
	        queueArray[1].display();

	    }
	      
	    public static Queue[] splitQueue(Queue queue) {
	    	//Implement your code here and change the return value accordingly
	    	
	    	Queue even=new Queue(queue.getMaxSize());
	    	Queue odd=new Queue(queue.getMaxSize());
	    	Queue []qArray=new Queue[2];
	    	while(!queue.isEmpty()) {
	    		int n=queue.dequeue();
	    		if(n%2==0) {
	    			even.enqueue(n);
	    				
	    		}
	    		else {
	    			odd.enqueue(n);
	    		}
	    	}
	    	qArray[0]=odd;
	    	qArray[1]=even;
	    	return qArray;
	    }
}
