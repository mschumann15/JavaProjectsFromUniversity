package project1;

import java.util.Scanner;
import java.util.Random;

public class driver {

	public static void main(String[] args) {
		
		int numIntervals;
		int startTime;
		int endTime;
		
		Random rand = new Random();
		String string;
		Scanner input = new Scanner(System.in);
		Queue queue =  new Queue();
		
		System.out.println("Please enter the number of intervals:");
		numIntervals = input.nextInt();
		
		System.out.println("Please enter start time of intervals:");
		startTime = input.nextInt();
		
		System.out.println("Please enter end time of intervals");
		endTime = input.nextInt();
		
		
		//format we want
		// [1, [10,10]]
		
		System.out.println("====================Initial Intervals============================");
		for(int i = 0; i < numIntervals;i++) {
			
			int min = startTime;
			int max = endTime;
			
			//generate 2 random numbers
			int randomNum1 = rand.nextInt((max - min) + 1) + min;
			int randomNum2 = rand.nextInt((max - min) + 1) + min;
			
			//make no repeats and leftside smaller than rightside
			while(randomNum1 == randomNum2 || randomNum1 > randomNum2) {
				randomNum1 = rand.nextInt((max - min) + 1) + min;
				randomNum2 = rand.nextInt((max - min) + 1) + min;
			}
			
		
			//generate intervals steing
			string = "[" + i + "," + "[" + randomNum1 + "," + randomNum2 + "]";
			queue.enqueue(string);
			
			System.out.println(string);
		}
		
		
		System.out.println("====================Interval Scheduling============================");
		
		
		
		
		
		
		
		
		
		
		System.out.println("====================Interval Partitioning============================");

		
		
		
	}

}
