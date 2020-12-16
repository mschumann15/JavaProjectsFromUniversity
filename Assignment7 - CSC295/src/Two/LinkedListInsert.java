package Two;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListInsert {

	public static void main(String[] args) {
		
		// Creating object of class linked list 
        LinkedList<Integer> randomIntegers = new LinkedList<Integer>(); 
          
        int randomInt;
		Random rand = new Random();
		int max = 101;
	
		
	    //fill in the linked list
	    for(int i = 0; i < 25; i++) {
	    	randomInt = rand.nextInt(max);
	    	//System.out.println(randomInt);
	    	randomIntegers.add(randomInt);
	    }
	    
	    Comparator<Integer> order = Integer::compare;
	    randomIntegers.sort(order);
	    
	    System.out.println(randomIntegers);
	    int sum  = 0;
	    double average;
	    for(int i = 0; i < randomIntegers.size();i++) {
	    	sum = randomIntegers.get(i) + sum;
	    }
	    
	    average = (double) sum/randomIntegers.size();
	    
	    System.out.println("Sum is: " + sum);
	    System.out.println("Avergae is: " + average);
	    
	    randomIntegers.sort(order.reversed());
	    System.out.println(randomIntegers);

	}

}
