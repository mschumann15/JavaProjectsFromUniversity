package assignment1;

public class driver {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {
		
		generateBoard();

	}
	
	public static void generateBoard() {
		
		System.out.println("\n" + ANSI_GREEN);
		
		int count1 = 0;
		for(int a = 0; a < 9; a++) {
			
			int count2 = 1;
			System.out.print("|");
			for(int i = 0; i < 32; i++) {
				System.out.print("-");
				
				if(count2 == 4) {
					System.out.print("|");
					count2 = 0;
				}
				
				count2++;
			}
			
			count1++;
			
			System.out.print("\n");
			if(count1 < 9) {
				
				System.out.print(ANSI_GREEN + "|");
				
				//adding the side walls on the right of the board and board walls for each square on the right
				//System.out.print("    |    |    |    |    |    |    |    |");
				
				switch(count1) {
					
					case 1:
						System.out.print(" " + ANSI_CYAN + "RR" + ANSI_RESET + ANSI_GREEN + " |    |    |    |    |    |    |    |");
						break;
					case 2:
						System.out.print(ANSI_GREEN + "    | " + ANSI_CYAN + "RR" + ANSI_RESET + ANSI_GREEN + " |    |    |    |    |    |    |");
						break;
					case 3:
						System.out.print(ANSI_GREEN + "    |    |" + ANSI_CYAN +" RR" + ANSI_RESET + ANSI_GREEN + " |    |    |    |    |    |");
						break;
					case 4:
						System.out.print(ANSI_GREEN + "    |    |    |" + ANSI_CYAN + " RR" + ANSI_RESET + ANSI_GREEN+ " |    |    |    |    |");
						break;
					case 5:
						System.out.print("    |    |    |    |" + ANSI_CYAN + " RR" + ANSI_RESET + ANSI_GREEN + " |    |    |    |");
						break;
					case 6:
						System.out.print("    |    |    |    |    |" + ANSI_CYAN + " RR" + ANSI_RESET + ANSI_GREEN + " |    |    |");
						break;
					case 7:
						System.out.print("    |    |    |    |    |    |" + ANSI_CYAN + " RR" + ANSI_RESET + ANSI_GREEN + " |    |");
						break;
					case 8:
						System.out.print("    |    |    |    |    |    |    |" + ANSI_CYAN + " RR" + ANSI_RESET + ANSI_GREEN + " |");
						break;
					default:
						System.out.print("    |    |    |    |    |    |    |    |");
				}
				
				System.out.print(ANSI_GREEN);
				
				System.out.print("\n");
	
			}			
			
		}	
	}
}