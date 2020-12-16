package assignment2;

import assignment2.List.Node;

public class driver {
	
	public static void main(String [] args) {
		
		List NumberList = new List();
		
		NumberList.head = new Node(1,null, new Node(2, null, new Node(3,null,null)));
	
		//NumberList.addAfterNode(2, NumberList.head);
		
		//System.out.println("Printed out first to last:");
		//NumberList.printFirstToLast();
		
		//System.out.println("\nPrinted out last to first:");
		//NumberList.printLastToFirst();
		
		System.out.println("Bubbly Sort:");
		int array1[] = {0,5,1,8,4,99,6,10,100,22,4,2,85,27,14};
		NumberList.bubblySort(array1);
		
		System.out.println("\n\nSelection Sort:");
		int array2[] = {0,18,78,56,2,21,34,45,90,243,27,44,3};
		NumberList.selectionSort(array2);
		
		System.out.println("\n\nInsertion Sort:");
		int array3[] = {0,90,4,45,67,3,56,4,3,2,56,33,22,17,33};
		NumberList.insertionSort(array3);
		
		
	}
}