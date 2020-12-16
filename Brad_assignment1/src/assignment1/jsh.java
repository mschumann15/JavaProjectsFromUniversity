package assignment1;

import java.io.*;


public class jsh
{
	public static void main(String[] args) throws java.io.IOException {
		
		String commandLine;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String[] command; //variable to hold the command arguments
		File current_dir = null;

		// we break out with <control><C>
		while (true) {
			// read what they entered
			System.out.print("jsh>");
			commandLine = console.readLine();
			
			command = commandLine.split(" ");
			
			// if they entered a return, just loop again
			if (commandLine.equals("")) {
				continue;
			}
			
			ProcessBuilder processBuilder = new ProcessBuilder(command);
			
			if(command.length == 2 || command[0].equals("ls") || command[0].equals("clear") ) {
				
				
				
			
				if(command[0].equals("cd")) {
					processBuilder.directory(new File(System.getProperty("user.home") + "/Desktop" + "/" + command[1])); 
					current_dir = processBuilder.directory();
					System.out.println("now working: " + processBuilder.directory());
					
				}else {
					processBuilder.directory(new File(System.getProperty("user.home") + "/Desktop")); //default directory is desktop
				}
				
				if(command[0].equals("ls") && current_dir != null) {
					processBuilder.directory(current_dir); 
				}
				
				
				
				try {
					Process process = processBuilder.start();
					//Process process = Runtime.getRuntime().exec(command);
					
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					
					String output;
					
					while((output = reader.readLine())  != null) {
						System.out.println(output);
					}
					
				} catch(IOException e) {
					
					System.out.println("error: " + e);
				}
	
				/** 
				  The steps are:
				  (1) parse the input to obtain the command
				      and any parameters
				  (2) create a ProcessBuilder object
				  (3) start the process
				  (4) obtain the output stream
				  (5) output the contents returned by the command
				 */ 
			}else {
				System.out.println("must give a command with 2 paramaters");
			}
			
			 
			System.out.print("\n");
	 	}
		
	}
}
