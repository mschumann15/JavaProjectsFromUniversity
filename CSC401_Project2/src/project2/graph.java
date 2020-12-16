package project2;

import java.util.LinkedList;
import java.util.Random;

public class graph{

  public graph(int num){
    this.num = num; //5
    
    int edge_possible = (num * ((num-1)/2)); //10

    undirectedGraph = new LinkedList[edge_possible]; // new linked list with capacity of 10

    //for each possible edge create an edge linkedlist
    for(int i = 0;i < edge_possible;i++){
    	
      undirectedGraph[i] = new LinkedList<>(); //create 10 new empty linked lists within the mother list
    }

  }

  public graph(){
    this.num = 5;
    
    int edge_possible = (num * ((num-1)/2));

    undirectedGraph = new LinkedList[edge_possible];
    
    for(int i = 0;i < edge_possible;i++){
    	undirectedGraph[i] = new LinkedList<>();
    }
  }
  
  
  public void addEdge(int source,int node1, int node2, int weight){

	  //adds an edgde, given the index and the nodes that are connected
      undirectedGraph[source].add(node1);
      undirectedGraph[source].add(node2);
      undirectedGraph[source].add(weight);
  }
  
  
  public void generateGraph() {
	  
	  Random random = new Random();
	  int min = 1;
	  int max = 5 * this.num;
	  int randomWeight;
	  
	  int edge_possible = (num * ((num-1)/2));
	  Random r = new Random();
	  
	  
	  
	  
	  //int randomInteger = random.nextInt(10);
	  
		  
	  //double y = Math.random();
		  
		 
	  int count = 1;
	  //outer loop going through all edge possiblities
	  for(int k = 0;k < edge_possible;k++) {
		  
		  //looping through list of nodes given: 5 {1,2,3,4,5}
		  for(int i = 1;i <= this.num;i++) {
			 double randomNum = Math.random();
			 //System.out.print(randomNum);
			  
			 
			 if(randomNum < ratio ) {
				 //no self loops
				 if(count != i) {
					 
					 randomWeight = r.nextInt((max - min) + 1) + min;
					 
					 boolean allgood = checkDuplicates(count,i);
					 
					 if(allgood = true) {
						 this.addEdge(k,count,i,randomWeight);
					 }else {
						//i = i-1;
					 }
					 
				 }else {
					 //i = 0;
				 }
			 }
			 
		  }
		  
		  if(count == this.num) {
			  count = 1;
		  }
		  
		  count++;
	  }	 
  }
  

  public boolean checkDuplicates(int count, int i) {
	  
	  int edge_possible = (num * ((num-1)/2)); //10
	  
	  //check for duplicates or same edge already
	  boolean allgood = false;
	  
	  //System.out.print(edge_possible);
	  for(int a = 0;a < edge_possible;a++) {
		  if(undirectedGraph[a].peek() != null) {
			 
			 
			 if(undirectedGraph[a].get(0) == count && undirectedGraph[a].get(1) == i) {
				 allgood = false;
			 }else { 
				 
				 if(undirectedGraph[a].get(0) == i && undirectedGraph[a].get(1) == count) {
					 allgood = false;
					 
				 }else {
					 if(undirectedGraph[a].get(1) == count && undirectedGraph[a].get(0) == i) {
						 allgood = false; 
					 }else {
						 if(undirectedGraph[a].get(1) == i && undirectedGraph[a].get(0) == count) {
							 allgood = false; 
						 }else {
							 allgood = true; 
						 }
					 }
				 }
				 
			 }
		 }
	  }
	  
	  
	  
	  return  allgood;
  }
  
  
  public void widestPath(int source, int dest) {
	  int edge_possible = (num * ((num-1)/2));
	  int runningSum = 0;
	  
	  LinkedList<Integer> widestPath[];
	  widestPath = new LinkedList[1];
	  
	  for(int i = 0;i < edge_possible;i++ ) {
		  if(undirectedGraph[i].peek() != null) {
			  //System.out.println(undirectedGraph[i].toString());
			  
		  }
	  }
	  
	  
	  for(int i = 0;i < edge_possible;i++ ) {
		  if(undirectedGraph[i].peek() != null) {
			  //System.out.println(undirectedGraph[i].get(2));
			  
			  if(undirectedGraph[i].get(0) == source) {
				  //System.out.println(undirectedGraph[i].get(2));
			  }
		  }
	  }
	  
	  
	  
	  
  }
  
  
 
  public void printGraphFancy() {        
	  
	  //System.out.println(this.num);
	  System.out.println("\n"); 
	  
	  int edge_possible = (num * ((num-1)/2));
	  
	  //for(int k = 0; k < (edge_possible); k++) { 
		  
		  //looping through list of nodes given: 5 {1,2,3,4,5}
	  for(int i = 1;i <= this.num;i++) {
		  System.out.println("Adjacency list of vertex: "+ i); 
          //System.out.print("head"); 
		  
		  for(int k = 0; k < edge_possible; k++) {
			 
			  
			  if(undirectedGraph[k].peek() != null) {
				 //System.out.print("\n" +undirectedGraph[k].get(1) + "\n");
				  
				  if(undirectedGraph[k].get(0) == i) {
					  System.out.print(" -> " +  undirectedGraph[k].get(1));
				  }
				  
				  
				  //System.out.print("\n" + undirectedGraph[k].get(1));
			  }
		  }
		  

          //if(undirectedGraph[k].peek() != null) {
        	  //System.out.print(" -> " +  graph.undirectedGraph[k].peek());
          //}
           
           
          System.out.println("\n"); 
          
	  }
  }
  
  public void printGraphBasic() {        
	  
	  //System.out.println(this.num);
	  System.out.println("\n"); 
	  
	  int edge_possible = (num * ((num-1)/2));
	  
	  //for(int k = 0; k < (edge_possible); k++) { 
		  
	  //looping through list of nodes given: 5 {1,2,3,4,5}
	  
	  System.out.print("Edge list: ");
	  System.out.print("{");
	  for(int i = 1;i <= this.num;i++) {
		  //System.out.println("Adjacency list of vertex: "+ i); 
          //System.out.print("head"); 
		  
		  for(int k = 0; k < edge_possible; k++) {
			 
			  
			  if(undirectedGraph[k].peek() != null) {
				 //System.out.print("\n" +undirectedGraph[k].get(1) + "\n");
				  
				  if(undirectedGraph[k].get(0) == i) {
					  System.out.print("(" + i + "," +  undirectedGraph[k].get(1) + "," + undirectedGraph[k].get(2) + "), ");
				  }
				  
				  //System.out.print("\n" + undirectedGraph[k].get(1));
			  }
		  }
		  

          //if(undirectedGraph[k].peek() != null) {
        	  //System.out.print(" -> " +  graph.undirectedGraph[k].peek());
          //}
           
           
          //System.out.println("\n"); 
          
	  }
	  System.out.print("}");
  } 


  public int num;
  public double ratio = 0.25;
  public int size = 0;
  public static LinkedList<Integer> undirectedGraph[];

}
