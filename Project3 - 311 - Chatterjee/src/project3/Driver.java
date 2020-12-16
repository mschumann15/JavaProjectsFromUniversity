package project3;

public class Driver {

	public static void main(String[] args) {
		showMenu();
	}
	
	public static void showMenu() {
		String msg = "Welcome to Marcus' incredible Card Game!\n";
		typeWrite(msg,20);
		
		System.out.println("\n\nPress Enter key to continue...");
        try
        {
        	System.in.read();
        }  
        catch(Exception e)
        {}  
		
		msg = "\nThe game is simple, with 4 players:\n"
				+"\t\n-Each player begins with 13 cards\n"
				+"\t\n-One of the players starts the game by putting \n their first card on the table\n"
				+"\t\n-In each round, players take turns by putting the \n top card from their hand on the table\n"
				+ "\t\n-The player who puts the card with the\n maximum value, gets all the 4 cards for that round\n"
				+"\t\n-It can be assumed that the values for the cards\n are the card numbers, and 1 for Ace,\n 11 for Jack, 12 for Queen and 13 for King\n"
				+ "\t\n-If more than one player has the same value card,\n then the suit decides the winner of the round\n"
				+ "\t\n-clubs have more value than diamonds, which in turn \n has greater value than hearts, and hearts\n have greater value than spades\n"
				+ "\t\n-The winner of each round gets all the 4 cards currently\n on the table and adds them at the end of the cards currently\n in his or her hand\n"
				+ "\t\n-The Game continues until one player gets all the cards or \n for 15 rounds,\n whichever is earlier\n"
				+ "\t\n-If one player doesn’t have all the cards before round 15,\n the player with the maximum number of cards at the end of\n 15 rounds is the winner";
		//typeWrite(msg,10);
		
		
		System.out.println("\n\nPress Enter key to Begin!");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
        
        Game game = new Game();
        
	}
	
	//Source: https://stackoverflow.com/questions/35673302/java-typewriter-effect
	//Author: Andrew
	//wanted a cool effect for the game
	public static void typeWrite(String text,int time) {
		
		for(int i = 0; i < text.length(); i++){
		    System.out.printf("%c", text.charAt(i));
		    try{
		        Thread.sleep(time);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
	}
}
