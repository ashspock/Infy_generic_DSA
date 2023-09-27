package day2;

/*				Check whether the queue is full. 
				If the queue is full, return false
				If the queue is not full,
     			Increment rear by 1
     			Add the element at rear position in the elements array
     			Return true
*/

public class Queue {
	
	private int front; // front represents the index position of the first element in the queue
	private int rear; // rear represents the index position of the last element in the queue
	private int maxSize; // maxSize represent the maximum number of elements that can be stored in the queue
	private String arr[];
	
	Queue(int maxSize) {
		this.front = 0; // front is 0 when the queue is created
		this.rear = -1; // rear is -1 when the queue is created
		this.maxSize = maxSize;
		this.arr = new String[maxSize];
	}
	
	//Checking if the queue is full or not
	public boolean isFull() {
		if (rear == maxSize - 1) {
			return true;
		}
		return false;
	}
	
	//Adding a new element to the rear of queue
	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	//Displaying all the elements in the queue
	public void display() {
		System.out.println("Displaying queue elements");
		for (int index = front; index <= rear; index++) {
			System.out.println(arr[index]);
		}
	}

		
		/*			Iterate over the queue from front to rear
					Print the element in each iteration
		*/
	
	/*	Check whether the queue is empty.
		If the queue is empty, return appropriate message
		If the queue is not empty,
     			Retrieve data at the front of the queue
     			Increment front by 1
     			Return the retrieved element
     */
	
	// Checking if the queue is empty or not
		public boolean isEmpty() {
			if (front > rear)
				return true;
			return false;
		}

	
	// Removing an element from the front of queue
	public String dequeue() {
		if (isEmpty()) {
			return "empty";
		} else {
			String data = arr[this.front];
			arr[front++] = null;
			return data;
		}
	}
}