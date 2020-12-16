package problem1;

public class algorithm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		
		int key = 889; //search key
		int low = 0;
		int high = array.length - 1;
		
		int result = ImprovedBinarySearch(array,key,low,high);
		
		
		System.out.print("Test array: {");
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]  + ",");
			}
			
		}
		System.out.println("}");
		
		
		System.out.println("\n\nSearch for: " + key);
		System.out.println("Result: " + result);
		
		if(result == -1) {
			System.out.println("Couldn't find: " + key + " in our array");
		}else {
			System.out.println("Which is the index for: " + key);
		}
		
		
		

	}
	
	
	public static int ImprovedBinarySearch(int A[], int key, int low, int high) {
		
		if(low > high) {
			return -1;
		}
		
		int p = (int) (low + Math.floor((high-low)/3));
		int q = (int) (high - Math.floor((high-low)/3));
		
		if(key == A[p]) {
			
			return p;
			
		}else if(key == A[q]) {
			
			return q;
			
		}else if(key < A[p]) {
			
			return ImprovedBinarySearch(A,key,low,p-1);
			
		}else if(key > A[q]){
			
			return ImprovedBinarySearch(A,key,q+1,high);
			
		}else{
			
			return ImprovedBinarySearch(A,key,p+1,q-1);
		}
				
	}

}
