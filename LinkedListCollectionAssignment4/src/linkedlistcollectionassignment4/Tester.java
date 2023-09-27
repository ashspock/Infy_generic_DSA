//lex_auth_012892687903694848116
//do not modify the above line

package linkedlistcollectionassignment4;

public class Tester {
	public static void main(String arga[]){
		
		//Uncomment the code given below after implementing the class Queue
		Queue queue= new Queue(5);
		
		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");
		queue.enqueue("Rock");
		queue.dequeue();
		queue.dequeue();
	
		System.out.println(queue.getQueue());
	}
	
	
}
