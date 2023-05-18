package Welcome5;

public class MergeSortA {
	    public static void mergeSort(int[] arr) {
	        if (arr.length <= 1) {
	            return;
	        }
	        
	        int mid = arr.length / 2;
	        int[] left = new int[mid];
	        int[] right = new int[arr.length - mid];
	        
	        // Populate the left and right arrays
	        for (int i = 0; i < mid; i++) {
	            left[i] = arr[i];
	        }
	        for (int i = mid; i < arr.length; i++) {
	            right[i - mid] = arr[i];
	        }
	        
	        // Recursive calls to sort the left and right arrays
	        mergeSort(left);
	        mergeSort(right);
	        
	        // Merge the sorted left and right arrays
	        merge(arr, left, right);
	    }
	    
	    public static void merge(int[] arr, int[] left, int[] right) {
	        int i = 0;  // Index for the left array
	        int j = 0;  // Index for the right array
	        int k = 0;  // Index for the merged array
	        
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }
	        
	        // Copy the remaining elements from the left array, if any
	        while (i < left.length) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	        
	        // Copy the remaining elements from the right array, if any
	        while (j < right.length) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] numbers = {5, 3, 8, 4, 2};
	        
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        mergeSort(numbers);
	        
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

