package MoviePackage;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * show menu to get the choice from the user
		 * use Scanner and stuff
		 */
		
		showMenu();
	}
	
	
	public static void showMenu() throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		choice = 0;
		
		System.out.println("\nWelcome to Marcus' magical Menu-based Movie App!\n");
		
		while(1 == 1){
			System.out.println("Select an option to move forward: \n");
		
			System.out.println("1. Register User and create User login");
			System.out.println("2. Login existing user");
			System.out.println("3. Logout");
			
			choice = input.nextInt();
			
			if(choice == 3) {
				break;
			}
			
			MenuOptions menuOption = new MenuOptions(choice);
		}
		
		System.out.println("You have exited my lovely program");
	}
	
	public static int choice;
}