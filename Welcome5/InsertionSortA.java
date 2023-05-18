package Welcome5;

public class InsertionSortA {
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            
	            // Move elements greater than the key to one position ahead
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            
	            // Insert the key into its correct position
	            arr[j + 1] = key;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] numbers = {5, 3, 8, 4, 2};
	        
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        insertionSort(numbers);
	        
	        System.out.println("Sorted array:");
	        printArray(numbers);
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}

