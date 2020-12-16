package MoviePackage;

//Chatterjee code
// Queue implementation using circular array

public class CircularQueue implements BareBonesQueue {

	// Data
	private Object[] Q;   //array reference for the actual Queue
	private int front;  //front of the queue
	private int rear; // rear od the queue
	private int size;  //number of elements in the queue
	private int capacity;  // maximum elements in the queue
	private final int DEFAULT_CAPACITY = 5;  //default capacity
	
	//Constructor
	public CircularQueue() {
		Q = new Object[this.DEFAULT_CAPACITY];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		this.capacity = this.DEFAULT_CAPACITY;
	}
	
	
	//Overrided constructor to change the size
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		Q = new Object[this.capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		
	}
	
	
	@Override
	public void offer(Object obj) {
		//this method adds elements to the queue
		if(this.isFull()) {
			System.out.println("The Queue is full, cannot insert");
			return;
		}
		
		//there is space to insert data
		//insert at the rear
		
		Q[rear] = obj;  //the data is inserted
		rear = (rear + 1) % capacity; //update the rear for the next data
		size++; //update the number of elements in the queue
		
		
	}

	@Override
	public Object poll() {
		// method deletes an element from the Queue
		//Check if there is an element to delete
		if(isEmpty()) { // if there is nothing in the queue
			return null;
		}
		
		//There is some elements to delete in the queue
		Object temp = Q[front]; // save the elemnt that will be deleted
		Q[front] = null; // making the space empty, actual deletion
		front = (front + 1) % capacity; // update front, dont forget mod
		size--; //update size
		
		
		return temp; // return deleted element
	}

	@Override
	public boolean isEmpty() {
		
		
		return (size == 0);
	}

	@Override
	public boolean isFull() {
		if(capacity == size) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Method to display the contents of the Queue
	public String toString() {
		String S = "Q: ";
		// We will loop over the actual elements in the Queue
		/*
		for(int i = front; i < front + size; i++) {
			S +=  " | " + Q[i % capacity]; // Point to the actual data, use mode
			
		}
		*/
		
		for(int i = 0; i < Q.length; i++) {
			
			S += " | " + Q[i];
		}
		
		
		
		return S;
		
	}
	
	
	
	
	
	
	
	

}
