package project3;

//Chatterjee code

// Single Linked List implementation

public class SingleLinkedList {
	
	private Node head; // Head of the Linked list
	private int size; // How many nodes are there in the list
	
	//Constructor
	public SingleLinkedList() {
		this.head = new Node(null); //this creates the head
		this.size = 0; // Initially there are no nodes in the list
		
	}
	
	// Method to add at the beginning of the linked list
	public void addFirst(Object item) {
		/*
		Node first = new Node(item);  // Creates the node
		first.next = head.next;  // copy the link from the head
		head.next = first; // Update the head.next  pointer
		*/
		
		//this bit does the same thing as the above but in 1 line
		head.next = new Node(item, head.next);
		size++; // Increase the size
	}
	

	
	//Method to insert value after a node
	public void addAfter(Object item, Node target) {
		/*
		Node insert = new Node(item);
		insert.next = target.next;
		target.next = insert; */
		
		target.next = new Node(item, target.next);
		size++;
	}
	
	//for users to be able to use addAfter
	//Overload the addAfter method
	public void addAfter(Object item, int index) {
		/*Node target = getNode(index);
		addAfter(item, target);*/
		if(index < 0 || index > size) {
			System.out.println("Cannot add at invalid index!");
			return;
		}
		
		
		addAfter(item,getNode(index));
		
	}
	
	
	// Method to insert at the end of the list
	public void addLast(Object item) {
		Node target = getNode(size); // Get the reference of last node
		this.addAfter(item, target); // Use the addAfter() method to insert
		
	}

	public Node getNode(int index) {
		// this method returns the reference of the node at index
		// FIrst check if the index is valid or not
		if(index < 0 || index > size) {
			return null;
		}
		
		//otherwise , we iterate over the list and return the reference 
		Node iter = head;
		for(int i = 0; i < index; i++) {
			iter = iter.next;
		}
		//At the end of the loop, you are pointing to the node at index
		
		return iter;
	}
	
	//Method to remove data from the beginning of the list
	public Object removeFirst() {
		//Check if there is an object to remove
		if(size == 0) {
			//There is no data
			return null;
		}
		
		Node temp = head.next; // Store in a temp reference to return
		head.next = head.next.next; // Point the head to the second node or null
		
		return temp;
	}
	
	//Method to remove data after a target node
	public Node removeAfter(int target) {
		Node temp = getNode(target);
		
		if(temp != null) {
			removeAfter(temp);
		}
		
	
		return null;
	}
	
	
	public Node removeAfter(Node target){
		Node temp = target.next; // This is the node being deleted
		if(temp != null) {
			target.next = temp.next;
			size--;
		}else {
			return null;
		}
		
		return temp;
	}
		

	//to String method to print the contents of the linked list
	public String toString() {
		String value = "List: ";
		Node temp = head; // this is the iterator to go over the nodes
		while(temp.next != null) { // While there is still some nodes
			value += " | " + temp.next.data; //get the node data
			temp = temp.next; // move to next node	
		}
		return value;
	}		
}