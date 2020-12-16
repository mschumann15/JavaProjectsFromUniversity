package project3;


public interface BareBonesArrayList <E> {
	// There are 2 versions of add for arrayList
	public void add (E a);		// This method adds at the end of list
	public void add (int index, E a);	// This is overloaded method
								// adds at location index
	
	// Remove method
	public E remove (int index);	// remove from index
	
	// get and set
	public E get (int index);		// Returns the object at index
	public void set(int index, E a); // Update the value at index
	
	public int getSize();		// Returns the number of elements in list
	public int indexOf(E a);	// Returns the index of the object
}
