package problem6;

import java.util.LinkedList;
import java.util.Random;

public class graph{

  public graph(int num){
    this.num = num;

    undirectedGraph = new LinkedList[num];

    for(int i = 0;i < num;i++){
      undirectedGraph[i] = new LinkedList<>();
    }

  }

  public graph(){
    this.num = 5;

    undirectedGraph = new LinkedList[num];
  }

  public void addEdge(int source, int destination){

      graph.undirectedGraph[source].add(destination);

      graph.undirectedGraph[destination].add(source);
  }
  
  
  public void generateGraph() {
	  
	  Random random = new Random();
	  
	  //int randomInteger = random.nextInt(10);
	  
	  while(true) {
		  
		  int x = random.nextInt(10);
		  int y = random.nextInt(10);
		  
		  if(x != y) {
			  for(int i = 0;i < num;i++) {
				 if(x == undirectedGraph[i + 1].element() && y == undirectedGraph[i].element() ) {
					 
				 }
			  }
			  this.addEdge(x,y);
		  }
		  
	  }
	  
  }
  
  
  
  
  public void printGraph() {        
	  
	  System.out.println(this.num);
	  
	  for(int i = 0; i < (this.num); i++) 
      { 
    	  
          System.out.println("Adjacency list of vertex "+ i); 
          //System.out.print("head"); 
          
          
          if(graph.undirectedGraph[i].peek() != null) {
        	  System.out.print(" -> " +  graph.undirectedGraph[i].peek());
          }
           
           
          System.out.println("\n"); 
      } 
  } 


  public int num;
  public int size = 0;
  public static LinkedList<Integer> undirectedGraph[];

}
