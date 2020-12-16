package project1;

public class Queue {
	
	    Node front,rear;
	    public static int count = 0;
	  
	    public Queue(){ 
	        this.front = null;
	        this.rear = null; 
	    }
	    
	    public static int size() {
	    	return count;
	    }
	    
	    public boolean empty() {
	    	if(size() == 0) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }
	    
	    // add a key to the queue. 
	    public void enqueue(Object key) { 
	        // Create a new LL node 
	        Node temp = new Node(key); 
	  
	        // If queue is empty, then new node is both the front and rear 
	        if (this.rear == null) { 
	            this.front = temp;
	            this.rear = temp; 
	            return; 
	        } 
	  
	        // Add the new node at the end of queue and change rear 
	        this.rear.next = temp; 
	        this.rear = temp; 
	        
	        count++;
	    } 
	    
	    
	    // Method to remove an key from queue. 
	    public Node dequeue() { 
	        // If queue is empty, return NULL. 
	        if (this.front == null) {
	            return null; 
	        }
	  
	        // Store previous front and move front one node ahead 
	        Node temp = this.front; 
	        this.front = this.front.next; 
	  
	        // If front becomes NULL, then change rear also as NULL 
	        if (this.front == null) {
	            this.rear = null; 
	        }
	        
	        count--;
	        
	        return temp; 
	    } 
	    
	    public Object peek() {
			
			if(!empty()) {
				return this.front.key;
			}else { 
				System.out.println("Queue is empty");
				return -1;
			}
			
		}
	    
	    //print Queue
	    static void printQueue() 
	    { 
	        int n = size(); 
	        for (int i = 0; i < n; ++i) {
	            //System.out.print(this.peek()); 
	        }
	        System.out.println(); 
	    } 
	    
	    
	    
	    public void HeapSort() {
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    //return -1 if not found
	    public int Search(Object search) {
	    	
	    	for(int i = 1; i < size()+2; i++) {
	    		if(this.front.key.equals(search) ) {
		    		return i;
		    	}else if(this.rear.key.equals(search)) {
		    		return size() + 2;
		    	}else {
		    		this.front = this.front.next;
		    	}
	    	}
	    	
			return -1;
	    }
	  
	    

}