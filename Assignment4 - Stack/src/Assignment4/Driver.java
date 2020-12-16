package Assignment4;


public class Driver {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(5);
		stack.push(3);
		stack.push(67);
		
		stack.pop();
		
		stack.push(11);
			
		System.out.println("Peek:");
		System.out.println(stack.peek());
		
		System.out.print("\n");
	
		System.out.println("Printing out all elements:");
		stack.printElements();
		
		
		System.out.print("\n");
		System.out.print(stack.search(3));
		
		
	}
}