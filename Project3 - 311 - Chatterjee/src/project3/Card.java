package project3;
import java.util.Random;


import java.util.ArrayList;
import java.util.List;

public class Card {
	
	public Card() {
		
		int max = 4;
		int min = 1;
		//generate Random Suit
			Random rand = new Random();
			int randomSuit = rand.nextInt((max - min) + 1) + min;
			suit = randomSuit;
	
			
		max = 13;
		min = 1;
		//generate random Card Number
			int randomcardNum = rand.nextInt((max - min) + 1) + min;
			cardNum = randomcardNum;
			
		
		
		
	}

	protected int cardCount = 52;
	protected int cardNum;
	protected int suit;
	protected List<Card> card = new ArrayList<Card>();
	
}