package problem4;

import java.util.Random;
import java.util.Scanner;

public class algorithm4 {

	public static void main(String[] args) {
		int n;
		Random random = new Random();
		
		System.out.print("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		//generate array with [-n,n] and n items
		
		int array[] = new int[n];
		for(int i = 0;i < array.length;i++) {
			int max = n;
			int min  = -n;
			array[i] = random.nextInt((max - min) + 1) + min;
		}
		
		System.out.print("\n\nTest array: {");
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]  + ",");
			}
			
		}
		System.out.println("}");
		
		
		
		
		System.out.print("\n\nNumber of inversions: " + getInversions(array));
		
		
	}
	
	
	
	public static int getInversions(int [] array) {
		
        int count  = 0;
        int arr_length = array.length;
        
        for (int i = 0; i < arr_length - 1; i++) {
        	for (int j = i + 1; j < arr_length; j++) {
                if (array[i] > array[j]) 
                    count++; 
            }
        }
  
        return count; 
	   
	}
	
	
	public static int[] getMaxSubArray(int [] array) {
		
		return array;
	}
	
	
	
	
	

}
