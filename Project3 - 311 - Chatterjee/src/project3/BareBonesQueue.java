package project3;
//Chatterjee code

public interface BareBonesQueue {
	// We will have only 4 methods here
	public void offer(Object obj); // adding data
	public Object poll(); // removing data
	public boolean isEmpty(); // Check if empty
	public boolean isFull();  // Check if full
	public Object peek();   // Check the first element
}
