package MoviePackage;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuOptions {
	
	public MenuOptions() {
		
		
	}
	
	public MenuOptions(int choice) throws FileNotFoundException {
		this.choice = choice;
		
		switch(choice) {
			case 1:
				Option1();
				break;
			case 2:
				Option2();
				break;
		}
	}
	
	//Register User and create User login
	public void Option1() throws FileNotFoundException{
		
		System.out.print("\nPlease enter your First Name: ");
		fname = input.next();
		
		System.out.print("\nPlease enter your Last Name: ");
		lname = input.next();
		
		System.out.print("\nPlease enter a Unique UserID: ");
		userID = input.next();
	
		System.out.print("\nPlease enter an 8 character password: ");
		password = input.next();
		
		User user = new User(fname,lname,userID,password);
		
		
		System.out.println("\nA new User was created!\n");
		System.out.println("Press Enter key to continue...");
        try{
            System.in.read();
        }  
        catch(Exception e) {
        }
        
        int nextChoice  = showMenu();
	}
	
	//Login existing user
	public void Option2(){
		System.out.print("\nPlease enter your userID: ");
		userID = input.next();
		
		System.out.print("\nPlease enter your password: ");
		password = input.next();
		
		User user = new User().loginUser(userID, password);
		
		System.out.println("\nYou have successfully logged in as: " + user.fname + " " + user.lname + "\n");
		
		int nextChoice = showMenu();
		if(nextChoice == 3) {
			Option3();
		}
	}
	
	//Watch a movie
	public void Option3(){
		
		String[] titles = {
				"Harry Potter I", 
				"Harry Potter II", 
				"Harry Potter III",
				"Harry Potter IV",
				"Harry Potter V",
				"Harry Potter VI",
				"Harry Potter VII",
				"The Lord of the Rings: The Fellowship of The Ring",
				"The Lord of the Rings: The Two Towers",
				"The Lord of the Rings: The Return of the King",
				"TRON:Legacy",
				"The Terminator",
				"Beverly Hills Cop",
				"The Goonies",
				"Ghostbusters",
				"Raiders of the Lost Ark",
				"Back to the Future",
				"Coming to America",
				"Alien",
				"Airplane!",
				"Star Wars: Return of the Jedi",
				"Jaws",
				"Superman",
				"The Good, the Bad, and the Ugly",
				"Dr. No"
		};
		
		String[] genres = {
				"Action", 
				"Comedy", 
				"Romance",
				"Horror",
				"Documentary",
				"Fantasy"

		};
		
		Movies movie1 = new Movies(titles[0],genres[0]);
		Movies movie2 = new Movies(titles[1],genres[1]);
		Movies movie3 = new Movies(titles[2],genres[2]);
		Movies movie4 = new Movies(titles[3],genres[3]);
		Movies movie5 = new Movies(titles[4],genres[4]);
		Movies movie6 = new Movies(titles[5],genres[5]);
		Movies movie7 = new Movies(titles[6],genres[6]);
		Movies movie8 = new Movies(titles[7],genres[7]);
		Movies movie9 = new Movies(titles[8],genres[8]);
		Movies movie10 = new Movies(titles[9],genres[9]);
		Movies movie11 = new Movies(titles[10],genres[10]);
		Movies movie12 = new Movies(titles[11],genres[11]);
		Movies movie13 = new Movies(titles[12],genres[12]);
		Movies movie14 = new Movies(titles[13],genres[13]);
		Movies movie15 = new Movies(titles[14],genres[14]);
		Movies movie16 = new Movies(titles[15],genres[15]);
		Movies movie17 = new Movies(titles[16],genres[16]);
		Movies movie18 = new Movies(titles[17],genres[17]);
		Movies movie19 = new Movies(titles[18],genres[18]);
		Movies movie20 = new Movies(titles[19],genres[19]);
		Movies movie21 = new Movies(titles[20],genres[20]);
		Movies movie22 = new Movies(titles[21],genres[21]);
		Movies movie23 = new Movies(titles[22],genres[22]);
		Movies movie24 = new Movies(titles[23],genres[23]);
		Movies movie25 = new Movies(titles[24],genres[24]);
		
		
		int choice;
		System.out.println("Great!, so what movie do you want to watch?");
		System.out.println("\nYou can search by title or genre");
		System.out.println("1. search by title");
		System.out.println("2. search by genre");
		choice = input.nextInt();
		String search;
		
		if(choice == 1) {
			
			System.out.print("Enter a title to search for: ");
			search = input.next();
			
			
			
			
			
			
			
		}else if(choice == 2){
			
		}

	}
	
	//Check the complete watch history of movies in chronological order
	public void Option4(){
		
		
	}
	
	//Check the history of movies watched in reverse chronological order
	public void Option5(){
		
		
	}
	
	//Number of times each movie is watched
	public void Option6(){
		
		
	}
	
	//Most watched movie
	public void Option7(){
		
		
	}
	
	//Most watched genre
	public void Option8(){
		
		
	}
	
	//Show Menu with more options
	public static int showMenu()  {
		int choice = 0;
		
		while(1 == 1){
			System.out.println("Select an option to move forward:");
			
			System.out.println("1. Watch a movie");
			System.out.println("2. Check the complete watch history of movies in chronological order");
			System.out.println("3. Check the history of movies watched in reverse chronological order ");
			System.out.println("4. Number of times each movie is watched ");
			System.out.println("5. Most watched movie ");
			System.out.println("6. Most watched genre");
			System.out.println("7. Logout");
			
			choice = input.nextInt();
			
			if(choice == 7) {
				break;
			}
		}
		return choice;
	}
	
	// User info
		public String userID;
		public String password;
		public String fname;
		public String lname;
		public static boolean loggedIn;
	
		
	public static Scanner input = new Scanner(System.in);
	public int choice;
}