package Pong;

public class field {

	public int width;
	public int height;
	
	public field() {
		width = 50;
		height = 20;
	}
	
	public void drawField() {
		
		player1 player1 = new player1();
		
		//top
		System.out.print("|");	
		for(int i = 0; i < width; i++) {
			System.out.print("-");	
		} 
		System.out.print("|");	
		
		//side walls
		for(int i = 0; i < (height); i++) {
			
			if(i == 0) {
				System.out.print("\n");	
			}
			
			System.out.print("|");	
			
			if(i == (height-1)) {
				player1.draw(height);
				width = width - 5;
			}
			
			for(int a = 0; a < width; a++) {
				System.out.print(" ");
			} 
			
			System.out.print("|");	
			
			System.out.print("\n");	
			
			//System.out.print("|\n");
			
		} 
	
		//bottom
		System.out.print("|");	
		for(int i = 0; i < width; i++) {
			System.out.print("-");	
		} 
		System.out.print("|");	
	
	}
	
	
	
	
}