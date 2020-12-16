package project3;

public class Game {
	
	public Game(){
		
		Players player1 = new Players();
		Players player2 = new Players();
		Players player3 = new Players();
		Players player4 = new Players();
		
	
		//generate 52
		SingleLinkedList list = new SingleLinkedList();
		
		for(int i = 1; i <= 13; i++) {
			
			Card card = new Card();
			list.addFirst(card);
			
		}
		
		
	}
}