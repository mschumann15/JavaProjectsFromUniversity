package Pong;

public class driver {
	
	
	
	public static void main(String args[]) {
		
		
		

		
		field map = new field();
		player1 player1 = new player1();
		
		
		for(int i = 0; i < (map.width/2)-2; i++) {
			System.out.print(" ");
		}
		String text = "PONG\n";
		TypeWriter(text);
		
		
		map.drawField();
		
	}
	
	public static void TypeWriter(String text) {
	
		int i;
		for(i = 0; i < text.length(); i++){
		    System.out.printf("%c", text.charAt(i));
		    try{
		        Thread.sleep(50);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
	}
	

	
}
