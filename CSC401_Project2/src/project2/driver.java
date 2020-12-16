package project2;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		int source;
		int dest;
		
		
		//Generate Graph with Random Edges
		System.out.print("Please enter a number of Nodes: ");
		n = input.nextInt();
		
		System.out.print("\n\n\nNode list: {");
		for(int i = 1; i <= n; i++) {
			if(i != (n)) {
				System.out.print(i + ",");
			}else {
				System.out.print(i);
			}
			
		}
		System.out.println("}");
		
		
		graph graph = new graph(n);
		graph.generateGraph();
		graph.printGraphBasic();
		
		//graph.printGraphFancy();
		
		
	
		
		///Widest Path Implementation

		System.out.print("\n\nPlease enter a source node: ");
		source = input.nextInt();
		
		
		System.out.print("\nPlease enter a destination node: ");
		dest = input.nextInt();
		
		
		graph.widestPath(source,dest);
		
		
		
		
		
		

	}

}
