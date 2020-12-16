package One;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class setDemo {

	public static void main(String[] args) throws IOException {
		
		HashSet<String> set = new HashSet();  
		getNames(set);
		searchNames(set);
		printNames(set);
		
		
	}
	
	public static void searchNames(HashSet set) {
	
		
		//System.out.println(set);
		
		Scanner input  = new Scanner(System.in);
		String searchTerm = null;
		
		while(true) {
			
			System.out.print("\nEnter a name to Search for, use 99 to terminate searching: ");
			searchTerm = input.next();
			
			if(searchTerm.equals("" + 99)) {
				break;
			}
			
			if(set.contains(searchTerm)) {
				System.out.println(searchTerm + " is found in the Set.");
			}else {
				System.out.println(searchTerm + " is NOT found in the Set. Try again");
			}
			
		}
		
		System.out.println("\nYou have exited the Search loop.");
	
	}
	
	public static void printNames(HashSet set) {
		
		Iterator value = set.iterator(); 
		
		System.out.println("List of Names with no Duplicates: ");
		while(value.hasNext()) {
			System.out.println("\n" + value.next());
		}
		
	}
	
	
	public static void getNames(HashSet set) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("What is the name of your input file of random names: ");
		String fname = input.next();
		
		
		File file = new File(fname);
		
		
		try {
			
		   
		    Scanner s = new Scanner(file);
            while (s.hasNext()) {
            	set.add(s.next());
            }
            s.close();
		    
		   
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} 
		
	}
	
	
	

}
