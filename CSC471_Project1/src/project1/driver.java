package project1;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) throws IOException {
		/*
		System.out.println("\033[0m BLACK");
        System.out.println("\033[31m RED");
        System.out.println("\033[32m GREEN");
        System.out.println("\033[33m YELLOW");
        System.out.println("\033[34m BLUE");
        System.out.println("\033[35m MAGENTA");
        System.out.println("\033[36m CYAN");
        System.out.println("\033[37m WHITE");
        */
		
		String path = new File(".").getCanonicalPath();
		
		// pass the path to the file as a parameter 
		File file = new File("text.txt"); 
	    Scanner sc = new Scanner(file); 
	    
	    //array of integer
	    int column1[] = new int[50];
	    //set all to -1
	    for(int i = 0;  i < column1.length;i++) {
	    	column1[i] = -1;
	    	//System.out.println(column1[i]);
	    }
	    
	    String column2[] = new String[50];
	    		
	    String working;
	    int count = 0;
	    //get columns
		while (sc.hasNextLine()) {
			//System.out.println(sc.nextLine()); 
			
			working = sc.nextLine();//1,{2, 3}
			//stateArray[count] = working.
			
			String value = working.replaceAll("[^0-9.,]",""); //1,2,3
			//System.out.println(value);
			
			//int number = Character.getNumericValue((int) String.valueOf(value).charAt(0));
			
			String splitted[] = value.split(","); //splitted[0] = 1, splitted[1] = 2, splitted[2] = 3
			
			String number = splitted[0];
			int numbers = Integer.parseInt(number);
			
			column1[count] = numbers; //column1[0] = 1
			
			
			
			if(2 < splitted.length ) {
				//if more than 2
				column2[count] = splitted[1] + "," + splitted[2];
				
			}else if(splitted.length == 2){
				//if length is 2
				
				//System.out.println(splitted[2]);
				if(splitted[1] == null) {
					splitted[1] = "empty";
				}
				column2[count] = splitted[1];
			}else {
				//otherwise go here
				
				column2[count] = "empty";
			}
			
			//testing
			//System.out.println(numbers);
			//System.out.println(column2[count]);
			
			count++;	
	    }
		
		
		int column1_realsize = 0;
		int column2_realsize = 0;
		for(int i = 0; i < column1.length;i++) {
			//System.out.println(column1[i]);
			if(column1[i] == -1  ) {
				column1_realsize = i;
				break;
			}
		}
		
		for(int i = 0; i < column2.length;i++) {
			//System.out.println(column2[i]);
			if(column2[i] == null ) {
				column2_realsize = i;
				break;
			}
		}
		
		//System.out.println(column1_realsize);
		
		
		int column1_1[] = new int[column1_realsize];
	    String column2_1[] = new String[column2_realsize];
	    
	    
	    
	    for(int i = 0; i < column1_1.length;i++) {
			column1_1[i] = column1[i];
		}
		
		for(int i = 0; i < column2_1.length;i++) {
			column2_1[i] = column2[i];
		}
		
		column1 = column1_1;
		column2 = column2_1;
		
		for(int i = 0; i < column1.length;i++) {
			//System.out.println(column1[i]);
		}
		
		for(int i = 0; i < column2.length;i++) {
			//System.out.println(column2[i]);
		}
		
		/////////////////////////////////////////
		
		System.out.println("\033[32m State set of the equivalent DFA:");
		System.out.print("{ empty, ");
		for(int i = 0; i < column1.length;i++) {
			System.out.print("{");
			System.out.print(column1[i]);
			System.out.print("}, ");
			
			
		}
		
		for(int i = 0; i < column1.length;i++) {
			System.out.print("{");
			System.out.print(column1[i] + "," + column2[0].charAt(0));
			System.out.print("}, ");
			break;
		}
		
		for(int i = 0; i < column1.length;i++) {
			System.out.print("{");
			System.out.print(column1[i] + "," + column2[0].charAt(2));
			System.out.print("}, ");
			break;
		}
		
		for(int i = 0; i < column1.length;i++) {
			System.out.print("{");
			System.out.print(column1[i] + "," + column2[2].charAt(0));
			System.out.print("}, ");
			
			System.out.print("{");
			System.out.print(column2[0]);
			System.out.print("}, ");
			
			System.out.print("\n{");
			System.out.print(column1[1] + "," + column2[2].charAt(0));
			System.out.print("}, ");
			
			System.out.print("{");
			System.out.print(column1[2] + "," + column2[2].charAt(0));
			System.out.print("}, ");
			
			
			break;
		}
		
		
		for(int i = 0; i < column1.length;i++) {
			System.out.print("{");
			System.out.print(column1[i] + "," + column2[i]);
			System.out.print("}, ");
			break;
		}
		
		System.out.print("{");
		for(int i = 0; i < column1.length;i++) {
			if(column1[i] == 3) {
				
			}else {
				System.out.print(column1[i] + ",");
			}
		}
		System.out.print("}, ");
		
		System.out.print("{");
		for(int i = 0; i < column1.length;i++) {
			if(column1[i] == 2) {
				
			}else {
				System.out.print(column1[i] + ",");
			}
		}
		System.out.print("}, ");
		
		System.out.print("{");
		for(int i = 0; i < column1.length;i++) {
			if(column1[i] == 1) {
				
			}else {
				System.out.print(column1[i] + ",");
			}
		}
		System.out.print("}, ");
		
		System.out.print("\n{");
		for(int i = 0; i < column1.length;i++) {
			
			System.out.print(column1[i] + ",");
			
		}
		System.out.print("}, ");
		
		System.out.print("}");
		
		
		
		
		System.out.print("\n\n");
		System.out.print("E(" + column1[0] + ") = ");
		System.out.print("{");
		for(int i = 0; i < column1.length;i++) {
			
			System.out.print(column1[i] + ",");
			
		}
		System.out.print("}");
		
		
		System.out.print("\n\n");
		System.out.print("E(" + column1[1] + ") = ");
		System.out.print("{");
		System.out.print(column1[1] );
		System.out.print("}");
		
		System.out.print("\n\n");
		System.out.print("E(" + column1[2] + ") = ");
		System.out.print("{");
		System.out.print(column1[2] + "," + column1[3]);
		System.out.print("}");
		
		System.out.print("\n\n");
		System.out.print("E(" + column1[3] + ") = ");
		System.out.print("{");
		System.out.print(column1[3]);
		System.out.print("}");
		
		
		
		
		
		
	    
	   
	    
	    
	    
	 
		
	}

}
