package assignment1_test;

public class Chessboard {
	
	Chessboard(){
		
		//board = 
		//System.out.print(board[4][7] + " ");

	}

	
	int getCoords(int x, int y){
		
		return board[x][y];
	}
	               
	
	public void setCoordstoValue(int x,int y,int num) {
		
		board[x][y] =  num;
		
	}
	
	
	
	//return true if can place rook
	public boolean checkCoord(int x, int y) {
		
		int origin = board[x][y];
		
		//check that the origin doesn't already have a queen
			if(origin == 1) {
				return false;
			}
		
		//check all columns
			for(int i = x + 1 ; i < 8; i++) {
				//System.out.print(i);				
				if(board[i][y] == 1) {
					return false;
				}
			}
			
			for(int i = x - 1;-1 < i; i--) {
				//System.out.print(i);
				if(board[i][y] == 1) {
					return false;
				}
			}
	
		//check all rows
			for(int i = y + 1; i < 8 ; i++) {
				//System.out.print(i);
				if(board[x][i] == 1) {
					return false;
				}
			}
			
			for(int i = y - 1;-1 < i; i--) {
				//System.out.print(i);
				if(board[x][i] == 1) {
					return false;
				}
			}
		
		return true;
	}
	
	public void printBoard() {
		
		System.out.print("\n");
		for (int i = 0; i < 8; i++) { 
			int count = 0;
	        for (int j = 0; j < 8; j++) { 
	        	
	        	if(board[i][j] == 1) {
	        		System.out.print(" " + ANSI_GREEN + board[i][j] + ANSI_RESET + " "); 
	        	}else {
	        		System.out.print(" "  + board[i][j]  + " "); 
	        	}

	        	if(count == 7) {
	        		System.out.print("\n");
	        	}
	        
	            count++;
	        } 
	    }
	}
	
	public int[][] board = 
	{	
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0}	   
	};
	
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
}