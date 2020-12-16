package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		//path to textFile
		String path = "/Users/marcus/Documents/Eclipse Workspace/CSC471_Project2/test.txt";
		File file = new File(path);
		Scanner input = new Scanner(file);
		CFG cfg = new CFG();
		String [][] elements;
		
		//parseFile class will take the file and turn it into an ArrayList for use
		parseFile(file,input,cfg);
		cfg.storeCFGVars();
		
		
		
		
		//get lines, set elements for each CFG item to be accessed by a arraylist
		ArrayList<String> Elements = new ArrayList<String>();
		ArrayList<ArrayList<String>> Holder = new ArrayList<ArrayList<String>>();
		for(int i = 0;i < cfg.Lines.size();i++) {
			
			Elements = cfg.getLineElements(cfg.cfgElements.get(i).toString());
			Holder.add(i, Elements);
			
		}
		
		ArrayList<ArrayList<String>> nonTerminals = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> terminals = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> symbols = new ArrayList<ArrayList<String>>();
		
		for(int i = 0; i < cfg.Lines.size();i++){
			
			ArrayList<String> item1 = new ArrayList<String>();

			ArrayList<String> item2 = new ArrayList<String>();

			ArrayList<String> item3 = new ArrayList<String>();
			
			for(int a = 0; a < Holder.get(i).size();a++) {
				
				
				if(Character.isUpperCase(Holder.get(i).get(a).charAt(0))) {
					item1.add(Holder.get(i).get(a));
				}
				
				if(Holder.get(i).get(a).contains("-") || Holder.get(i).get(a).contains("|")) {
					//System.out.println(Holder.get(i).get(a));
					item2.add(Holder.get(i).get(a));
				}
				
				if(Character.isLowerCase(Holder.get(i).get(a).charAt(0))) {
					item3.add(Holder.get(i).get(a));
				}
			}
			
			//System.out.println(item.toString());
			
			nonTerminals.add(item1);
			symbols.add(item2);
			terminals.add(item3);
			
			//break;
		}
		
		//System.out.println(nonTerminals.toString());
		//System.out.println(terminals.toString());
		//System.out.println(symbols.toString());
		
		
		//loop through each line
		
		boolean lineGood;
		for(int i = 0; i < cfg.Lines.size(); i++) {
			//0-3 0 1 2 3
			
			
			//System.out.println(nonTerminals.toString());
			
			int lineLength = nonTerminals.get(i).size();
			
			//System.out.print(lineLength);
			//lines 1 line at a time of nonTerminals in each line
			for(int a = 1;a < lineLength;a++ ){
				//varies based on each lines character length
				
				//skip first nonTerminal because that will be to the  left of the ->
				//System.out.println(nonTerminals.get(i).get(a));
				
				String tempcurrentNonTerminal = nonTerminals.get(i).get(a);
				
				//System.out.println(lineLength);
				
				//System.out.println(tempcurrentNonTerminal);
				
				//System.out.println(nonTerminals.get(i).get(0));
				
				
				//System.out.println(a);
				
				
				//check to make sure current nonTerminal is not the same as the first one. To the left of the ->. S -> 
				if(nonTerminals.get(i).get(0).equals(tempcurrentNonTerminal)){
					//System.out.println("hey");
				}else {
					//have to go through next lines and figure out the rules
					String currentNonTerminal = nonTerminals.get(i).get(a);
					//System.out.println(currentNonTerminal);
					
					
					for(int b = 1; b < lineLength; b++) {
						
						//System.out.println(Holder.get(b).get(0).toString());
						if(Holder.get(b).get(0).equals(currentNonTerminal) ){
							//int num = 2;
							//Holder.get(b).get(b+1)) 
						
							//for(int c = 0;c < lineLenght) {
								
							//}
							
							
							
							int lineLength2 = cfg.Lines.get(b).toString().length();
							for(int c = 2; c < lineLength2-2; c++) {
								
								//System.out.println(Holder.get(b).get(c).charAt(0));
								
								//System.out.println(b);
								
								
								
								//System.out.println(Holder.get(b).get(c).equals("-"));
								
							
								if(Character.isLowerCase(Holder.get(b).get(c).charAt(0)) && Holder.get(b).get(c).equals("-") == false) {
									lineGood = true;
								}else {
									Holder.remove(b);
									cfg.Lines.remove(b);
									nonTerminals.remove(b);
									
									//System.out.println(b);
									
									//lineLength = lineLength - 1;
									break;
								}
								
							}	
						}
						
						//break;
					}
					
			
					//break;
				}
				
				//break;
			}
			
			//break;
		}
		
		System.out.println("Text File Input: ");
		System.out.println(cfg.cfgElements.toString());
		
		System.out.println("\n\nOutput Get ride of Useless: ");
		System.out.println(Holder.toString());
		
		
	
	}
	
	public static void parseFile(File file,Scanner input,CFG cfg) {
		
		while(input.hasNextLine()) {
			cfg.Lines.add(input.nextLine());
			
		}
		
	}

}
