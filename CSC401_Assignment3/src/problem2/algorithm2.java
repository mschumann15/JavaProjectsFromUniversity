package problem2;

public class algorithm2 {

	public static void main(String[] args) {
		
		int array[] = {10,50,70,20,15,90,80,7,200,7,42};
		
		int low = 0;
		int high = array.length - 1;
		
		int result = FindLargest(array,low,high);
		
		
		System.out.print("Test array: {");
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]  + ",");
			}
			
		}
		System.out.println("}");
		
		
		
		System.out.println("\n\nLargest Number in Array: " + result);
	
		
		

	}
	
	public static int FindLargest(int A[], int low, int high) {
		
		if(low == high) {
			return A[low];
		}
		
		int leftLargest = FindLargest(A,low, (int) Math.floor((low+high)/2));
		int rightLargest = FindLargest(A,((int) Math.floor((low+high)/2) + 1),high);
		
		return Math.max(leftLargest,rightLargest);
		
	}

}
