package project2;

import java.util.ArrayList;

public class CFG<cfgElements> {
	
	public CFG() {
		
		
	}
	
	public void printLines() {
		System.out.println(Lines.toString());
	}
	
	public void printCFGList() {
		System.out.println(cfgElements.toString());
	}
	
	public void printmasterList() {
		System.out.println(masterList.toString());
	}

	
	public ArrayList<String> getLineElements(String line) {
		
		int lineLength = line.length();
		
		
		ArrayList<String> Elements = new ArrayList<String>();
		//outer 4 lines loop
		for(int i = 0;i < Lines.size();i++) {
			
			//System.out.println(i);
			//inner loop, loop through line length for each line
			for(int a = 0; a < lineLength;a++) {
				
				String item = line.substring(a,a+1);
				
				if(item.equals("[") || item.equals("]") || item.equals(" ") || item.equals(",")) {
					
				}else {
					Elements.add(item);	
				}
				
		
				//elements[i][a] = item;
					
				
				//System.out.println(item);
				
				
				//System.out.println(elements[i][a]);
				
				//break;
				
				
				
			}
			break;
		}
			
		
		
		return Elements;
	}
	
	
	

	public void storeCFGVars() {
		
		
		String elem = "";
		int lineLength;
		StringBuilder build = new StringBuilder();
		
		//get first element, Non-terminals(variables)
		for(int i = 0;i < Lines.size();i++) {
			lineLength = Lines.get(i).length();
			
			//System.out.println(Lines.get(i).toString());
			//System.out.println(lineLength);
		
			elem = "";
			ArrayList<String> Elements = new ArrayList<String>();
			for(int a = 0; a < lineLength;a++) {
				
				if(a == 1 || a == 3 ) {
					
				}else {
					
					elem = Lines.get(i).substring(a, a + 1);
					ArrayList<String> subElement = new ArrayList<String>();
					
					//build.append(elem);
					Elements.add(elem);
					
					
			
					
					
					
					//System.out.println(elem);
					
				}
				
			}
			
			cfgElements.add(Elements);
			
			//System.out.println(cfgElements.toString());
			
			
			
			
			
			//System.out.println(build.toString());
			
			//cfgElements.add(build.toString());
			
			
			
			//cfgElements.remove(0);
			
			
			//build.setLength(0);
			
			
			
			
			
			
			//cfgElements.add(build.toString());
			
			
			/*
			firstElem =	Lines.get(i).substring(0,1);
			secondElem = Lines.get(i).substring(2,3);
			
			cfgElements.add(firstElem);
			cfgElements.add(secondElem);
			*/
			
			
			
			
			//Lines.add(cfgElements);
			
			//masterList.add(cfgElements);
			//break;
			
		}
		
		//masterList.add(cfgElements);
	}
	
	
	

	
	ArrayList<ArrayList<String>> cfgElements = new ArrayList<ArrayList<String>>(); // S - aS|A|C //converted to: S[0],-[1],aS[2],A[3],C[4]
	ArrayList<String> Lines = new ArrayList<String>(); //Stores each line form File
	ArrayList<ArrayList<ArrayList<String>>> masterList = new ArrayList<ArrayList<ArrayList <String>>>(); //Stores each line form File
	String elements[][] = new String[50][50];
}
