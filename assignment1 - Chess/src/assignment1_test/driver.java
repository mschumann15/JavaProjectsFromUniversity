package assignment1_test;

import java.util.Random;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chessboard board = new Chessboard();
		
		int rookVal = 1;
		Random CoordinateRandomizer = new Random();
		
		
		//manually placing Rooks
		/*
		
			//manual integration
			int rook1 = board.getCoords(0,0);
			int rook2 = board.getCoords(1,1);
			int rook3 = board.getCoords(2,2);
			int rook4 = board.getCoords(3,3);
			int rook5 = board.getCoords(4,4);
			int rook6 = board.getCoords(5,5);
			int rook7 = board.getCoords(6,6);
			int rook8 = board.getCoords(7,7);
			
			board.setCoordstoValue(0,0, rookVal);
			board.setCoordstoValue(1,1, rookVal);
			board.setCoordstoValue(2,2, rookVal);
			board.setCoordstoValue(3,3, rookVal);
			board.setCoordstoValue(4,4, rookVal);
			board.setCoordstoValue(5,5, rookVal);
			board.setCoordstoValue(6,6, rookVal);
			board.setCoordstoValue(7,7, rookVal);
		*/
		
		
		//Randomly placing Rooks
		int count = 0;
		
		//keep searching until 8 rooks are placed
		while(count < 8){
			int randomInt1 = CoordinateRandomizer.nextInt(8);
			int randomInt2 = CoordinateRandomizer.nextInt(8);
			//System.out.print("Random Coordinates: (" + randomInt1 + "," + randomInt2 + ")" );
			
			if(board.checkCoord(randomInt1,randomInt2) == true) {
				
				board.setCoordstoValue(randomInt1,randomInt2,rookVal);
				
				if(count == 8) {
					break;
				}
				
				count++;
			}
		}
		
		board.printBoard();
		
		//System.out.print(board.getCords(0, 0));
		
		System.out.print("\n\nChecking coordinate (2,7), returned:");
		System.out.print("\n" + board.checkCoord(2,7));
		
	}

}
