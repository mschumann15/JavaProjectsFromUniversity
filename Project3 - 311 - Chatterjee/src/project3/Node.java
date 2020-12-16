package project3;

//Chatterjee code
//Node for single linked list

public class Node {
	//Data
	Object data;
	//Link
	Node next;
	

	//Constructors
	//Default constructor
	public Node(Object data) {
		this.data = data; // Assign the given data	
		this.next = null; // by default there is no next node
		
		
	}
	
	
	//Overloaded constructor
	//Creates a node and points it to another
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}
}