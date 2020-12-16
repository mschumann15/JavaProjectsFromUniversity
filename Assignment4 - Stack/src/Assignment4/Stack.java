package Assignment4;

public class Stack {
	
	private int size = 0;
	public Node last;
	public Node top;
	
	Stack(){
		this.top = null;
	}
	
	public boolean Empty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(Object item) {
		
		Node temp = new Node();
		temp.element = item;
		
		if (temp.element == null) {
			System.out.print("\nHeap Overflow");
			return;
			
		}
		
		temp.element = item;
		
		temp.link = top;
		
		top = temp;
		
		size++;
		
	}
	
	public Object peek() {
		
		if(!Empty()) {
			return top.element;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
		
	}
	
	public Object pop() {
		
		if (top == null) {
			System.out.print("\nStack Underflow");
			return -1;
		}
		
		size--;
		
		return top = (top).link;
	}
	
	public int search(Object o) {
		
		int count = 0;
		int findings = 0;
		int distance = 0;
		
		if(Empty() ==  true) {
			System.out.print("The Stack is empty");
		}else {
			Node temp = top;
			while(temp != null) {
			
				if(temp.element.equals(o)) {
					
					findings++;
					
					distance = count + 1;
					
					if(count == 0) {
						distance = 1;
					}
					
					System.out.print("Posistion of " + o.toString() + " in Stack one-based: ");
					return distance;
				}
				
				count++;
				
				temp = temp.link;
			}
		}
		
		if(findings == 0){
			System.out.print("Could not find the item you searched for|| count = ");	
		}                  
		
		return count;
	}
	
	
	public void printElements() {
		
		if(Empty() ==  true) {
			System.out.print("The Stack is empty");
		}else {
			Node temp = top;
			while(temp != null) {
			
				//print all the nodes
				System.out.println(temp.element.toString());
				
				temp = temp.link;
			}
		}
	}
	
	public static class Node {
		
		//node constructor
		public Node() {
			
		}
		
		public Object element;
		
		//reference to next Node
		public Node succ,prev;
		
		Node link;
	}

}