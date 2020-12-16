package problem3;

public class algorithm3 {

	
	public static void main(String[] args) {
		
		int array[] = {1,2,1,1,3,1};
		
		int low = 0;
		int high = array.length - 1;
		
		
		int result = FindMajority(array,low,high);
		
		
		System.out.print("Test array: {");
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]  + ",");
			}
			
		}
		System.out.println("}");
		
		
		if(result == -1) {
			System.out.println("\n\nThe Majority Number is: " + "NULL" + " There were no majority numbers");
		}else {
			System.out.println("\n\nThe Majority Number is: " + result);
		}
		
		

	}
	
	
	
	public static int FindMajority(int A[], int low, int high) {
		
		
		if(low == high) {
			return A[low];
		}
		
		
		
		
		int leftMajority = FindMajority(A,low, ((int) (Math.floor((low + high)/2))));
		int rightMajority = FindMajority(A,((int) ((Math.floor((low + high)/2)) + 1)),high);
		
		
		if(leftMajority == rightMajority ) {
			return leftMajority;
			
		}
		
		
		int leftMajorityCount = 0;
		int rightMajorityCount = 0;
		
		
		
		
		for(int i = low; i <= high;i++) {
			if(A[i] == leftMajority) {
				leftMajorityCount++;
			}else if(A[i] == rightMajority) {
				rightMajorityCount++;
			}
		}
		
		//System.out.println(leftMajorityCount);
		//System.out.println(rightMajorityCount);
		
		//System.out.println(low);
		//System.out.println('\n');
		
		//System.exit(-1);
		
	
		if(leftMajorityCount  < Math.floor(high/2)   ) {
			return leftMajority;
		}else if(rightMajorityCount > Math.floor(high/2) ) {
			return rightMajority;
		}else {
			return -1;
		}
		

	}

}
