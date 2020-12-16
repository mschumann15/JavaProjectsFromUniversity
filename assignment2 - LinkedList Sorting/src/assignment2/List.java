package assignment2;

public class List {
	
	private int size;

	public List() {
		this.head = null;
		this.last = null;
		this.size = 0;
	}
	
	
	//bubbblybubblysort
	public void bubblySort(int[] a) {
		int outer,inner;
		for(outer = a.length - 1; outer > 0; outer--) {
			for(inner = 0; inner < outer; inner++) {
				if(a[inner] > a[inner + 1]) {
					int temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp;
				
				}
			}
		}
		
		//print out the array
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	//selectyselectysort
	public  void selectionSort(int[] a) {
		int outer, inner, min;
		for(outer = 0; outer < a.length - 1; outer++) {
			min = outer;
			for(inner = outer + 1; inner < a.length; inner++) {
				if(a[inner] < a[min]) {
					min = inner;
				}
			}
			
			int temp = a[outer];
			a[outer] = a[min];
			a[min] = temp;
			
		}
		
		//print out the array
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	//insertyinsertysort
	void insertionSort(int [] a) 
    { 
        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            int key = a[i]; 
            int j = i - 1; 
  
            
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        }
        
      //print out the array
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
    } 
	

	//Inserting a new first element
	public void insertAtFront(Node node) {
		node.succ = this.head;
		this.head = node;
	
	}
	
	//Inserting a new last element
	public void insertAtLast(Node node) {
		node.succ = this.head;
		this.head = node;
		while(true) {
			if(node.succ == null) {
				node.succ = node;
			}
		}
	}
	
	
	//Add before a given node(specified by reference)
	public void addBeforeNode(Object object, Node pointer) {
		pointer = getNode(size);
		this.addAfterNode(object, pointer);
	}
	
	
	//get Node to use in addBeforefunction
	public Node getNode(int index) {

		if(index < 0 || index > size) {

			return null;			

		}

		Node iter = head;	

		for(int i = 0; i < index; i++) {

			iter = iter.succ;	

		}
		
		return iter;

	}
	
	
	//Add after a given node
	public void addAfterNode(Object element, Node target) {
		target.succ = new Node(element,target.prev, target.succ);
		size++;
	}
	
	//Add before a given value
	public void addBeforeValue(Object element, Node target) {
		target.prev = new Node(element, target.prev, target.succ);
	}
	
	//Add after a given value
	void insertAfter(Object obj, Node node) {
		for(Node here = this.head;here != null; here = here.succ) {
			if(here.element.equals(obj)) {
				node.succ = here.succ;
				here.succ = node;
				return;
			}
			
		}
		
		System.out.println("could not insert");
	}
	
	
	//Print all node values from the first element
	public void printFirstToLast() {
		for(Node currentNode = head; currentNode != null; currentNode = currentNode.succ) {
			System.out.print(currentNode.element + " ");
		}
	}
	
	//Print all node values from the last element
	public void printLastToFirst() {
		
		Node datapoint = head;
	    Node previous = null;
	    Node current = null;

	    while (datapoint != null) {
	      current = datapoint;
	      datapoint = datapoint.succ;

	      // reverse the link
	      current.succ = previous;
	      previous = current;
	      head = current;
	    }
	    
	    Node nodeagain = head;
	    
	    while(nodeagain != null) {
	      System.out.print(nodeagain.element + " ");
	      nodeagain = nodeagain.succ;
		}
	}	
	
	public static class Node {
		
		//actual item to add to list
		public Object element;
		
		//reference to next Node
		public Node succ,prev;
		
		//node constructor
		public Node(Object elem,Node prev,Node succ) {
			this.element = elem;
			this.prev = prev; 
			this.succ = succ;
		}
	}
	
	public Node head;
	public Node last;
}