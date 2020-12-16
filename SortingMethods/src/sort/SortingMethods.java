package sort;

public class SortingMethods {
	
	//Insertion Sort
	public static void insertionSort(int[] array) {
		int n = array.length;
		//loop over each index, starting from the second index
		for(int i = 1;i < n; i++) {
			//Need counters for indices
			int j = i - 1; // This is the first element to compare with
			int temp = array[i]; //Store it, because shifting might overwrite it
			while(j >= 0 && array[j] > temp) {
				// index is valid, and larger value then before
				array[j + 1] = array[j]; //shift right
				j--; // go to previous index
			}
			//this is the proper place for the data
			array[j + 1] = temp; // we checked one too many before, so increment
			System.out.println(printArray(array));
		}
		
		
	}
	
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int index = i;
			int minimum = i + 1;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[minimum]) {
					//we found a new minimum
					minimum = j;    // So, we have a new index for minimum
				}
			}
			
			if(array[minimum] > array[index]) {
				//we found the lower value in the array, that needs to  come before
				//so we will swap the values
				array[minimum] = array[index] ^ array[minimum];
				array[index] = array[index] ^ array[minimum];
				array[minimum] = array[index] ^ array[minimum];
				
			}
			
			System.out.println(printArray(array));
		}
	}
	
	public static void bubbleSort(int[] array) {
		boolean isSwap = true;
		for(int i = 0;i < array.length && isSwap; i++) { //  controls number of iterations
			//Assume that the checkings will not result in a swap
			isSwap = false;
			for(int j = 0;j < array.length - 1 - i; j++) {	
				//Here, check the elements in pairs and swap if out of order
				if(array[j] > array[j+1]) {
					//Swap
					array[j] = array[j] ^ array[j + 1];
					array[j + 1] = array[j] ^ array[j + 1];
					array[j] = array[j] ^ array[j + 1];
					//Swapping happened here
					isSwap = true;
				}
			}
			System.out.println(printArray(array));
		}	
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		// let's check the error conditions first
		if(arr == null || arr.length == 0) {
			return;
		}
		
		if(low >= high) {
			return;
		}
		
		//Pick the pivot
		int middle = (low + high) / 2;
		int pivot = arr[middle];
		
		//make the left side < pivot, and right  > pivot
		int i = low, j = high;
		while(i <= j) {
			while(arr[i] < pivot) { // Checking on the left side
				i++; // Go to the next element
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				//Swap the values at i and j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		
		System.out.println(printArray(arr));
		
		//at this point the pivot is in it's place
		//recursively sort the sub arrays
		
		//sort the left part, if any
		if(low < j) {
			quickSort(arr, low, j);
		}
		
		//sort the right part, if any
		if(high > 1) {
			quickSort(arr, i, high);
		}
		
	}
	
	//this is the wrapper method for quickSort
	public static void quickSort(int[] arr) {
		int low = 0;
		int high = arr.length  - 1;
		quickSort(arr, low, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A =  {12,-9,45,7,21,32,-99,-11};
		int[] A =  {1,3,7,2,9,8};
		System.out.println("Contents of original Array: " + printArray(A));
		quickSort(A);
		System.out.println("Contents of sorted Array: " + printArray(A));
		
		
		

	}
	
	private static String printArray(int[] a) {
		
		String s = "";
		for(int i = 0; i < a.length;i++) {
			s += a[i] + " | " ;
		}
		
		return s;
		
	}
}