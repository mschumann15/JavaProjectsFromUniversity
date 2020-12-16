package MoviePackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
	
	public User() {
		
	}
	
	public User(String fname, String lname, String userID,String password) throws FileNotFoundException {
		// System.out.println(loggedIn);
		
		this.fname = fname;
		this.lname = lname;
		
		while(isUniqueID(userID) == false) {
			System.out.print("\nPlease enter a Unique UserID: ");
			userID = input.next();
		}
		this.userID = userID;
		
		//System.out.println(password.length());
		while(8 > password.length()) {
			System.out.print("\nPlease enter a password with 8 characters: ");
			password = input.next();
		}
		this.password = password;
		
		try {
			
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.append(this.toString());
            bufferedWriter.newLine();
            
            bufferedWriter.close();
        } catch(IOException ex) {
            System.out.println("Error with file: '" + fileName + "'");
        }
	
	}
	
	public User(String fname, String lname, String userID,String password,boolean isloggedIn)  {
		
		this.fname = fname;
		this.lname = lname;
		this.userID = userID;
		this.password = password;
		
	}
	
	public User loginUser(String userID, String password) {
		
		File file = new File(fileName);
		
		if(file.exists()) {
			
			String line;
			
			try {
	            
	            FileReader fileReader = new FileReader(fileName);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                //System.out.println(line);
	                String[] elements = line.split(",");
	                
	                if(elements[2].equals(userID) && elements[3].equals(password)) {
	                	loggedIn = true;
		            	User foundUser = new User(elements[0],elements[1],elements[2],elements[3],true);
		            	foundUser.loggedIn = true;
		            	return foundUser;
		            }
	            }   
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println("Can't open file '" + fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println("Error reading file '" + fileName + "'");                  
	        }
		}
		
		while(1 == 1) {
			
			System.out.print("\nThat user does not exist try again: \n");
			
			System.out.print("\nPlease enter your userID: ");
			userID = input.next();
			
			System.out.print("\nPlease enter your password: ");
			password = input.next();
			
			User user = new User().loginUser(userID, password);
			if(user != null) {
				return user;
			}
		}
		
		//return null;
	}
	
	public boolean isUniqueID(String userID) throws FileNotFoundException {
		
		File file = new File(fileName);
		
		if(file.exists()) {
			
			String line;
			
			try {
	            
	            FileReader fileReader = new FileReader(fileName);

	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                //System.out.println(line);
	                String[] elements = line.split(",");
	                
	                if(elements[2].equals(userID)) {
		            	return false;
		            }
	            }   
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println("Can't open file '" + fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println("Error reading file '" + fileName + "'");                  
	        }
		}
		return true;
	}
	
	public boolean isLoggedIn() {
	
		if(loggedIn = true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean userFileExists() {
		
		File file = new File(fileName);
		
		if(file.exists()) {
			return true;
		}
		
		return false;
	}
	
	
	
	public String toString() {
		return(fname + "," + lname + "," + userID + "," + password);
	}
	
	String fileName = "Users.txt";
	public static Scanner input = new Scanner(System.in);
	
	protected String fname;
	protected String lname;
	protected String userID;
	protected String password;
	protected boolean loggedIn;
}
