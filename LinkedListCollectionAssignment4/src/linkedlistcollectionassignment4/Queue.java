//lex_auth_012892687903694848116
//do not modify the above line

package linkedlistcollectionassignment4;

import java.util.LinkedList;

public class Queue {
    private int maxSize;
    private LinkedList<String> queue;  
    
    public Queue(int maxSize) {
		this.maxSize = maxSize;
		queue=new LinkedList<String>();
	}

	public LinkedList<String> getQueue() {
		return this.queue;
	}
	
	public boolean isFull() {
		if(queue.indexOf(queue.peekLast())==maxSize-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(this.queue.peekFirst()==null)
			return true;
		else 
			return false;
	}
	
	public boolean enqueue(String data) {
		if(isFull())
			return false;
		else {
			this.queue.add(data);
			return true;
		}
	}
	
	public boolean dequeue() {
		if(isEmpty())
			return false;
		else {
			System.out.println(this.queue.pollLast());
			return true;
		}
	}
}