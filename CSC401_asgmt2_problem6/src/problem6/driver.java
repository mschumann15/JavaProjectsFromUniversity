package problem6;

import java.util.Scanner;

public class driver{

  public static void main(String[] args){

    int num = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("\n\n\nEnter a postive integer to generate the graph: ");
    
    try {
    	
    	num = input.nextInt();
    	
		if(0 < num){
			
			System.out.print("\n\nNode List: ");
			System.out.print("{");
			for(int i = 0;i < num;i++){
			  System.out.print(i + ",");
			}
			
			System.out.println("}\n");
			
			
			graph graph1 = new graph(num);
			graph1.generateGraph();
			
			 
			graph1.printGraph();  
		  
		}else {
				
			System.out.println("Integer must be positive and more than 0");
			
		}

    	
    } catch(Exception e) {
    	
    	if(e.hashCode() == 853993923) {
    		System.out.println("\n\nInput must be an Integer. Try Again");
    	}
    }
  }
}