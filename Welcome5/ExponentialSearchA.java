package Welcome5;

public class ExponentialSearchA {
	    public static int exponentialSearch(int[] arr, int target) {
	        int n = arr.length;
	        
	        // If the target element is present at the first position
	        if (arr[0] == target) {
	            return 0;
	        }
	        
	        // Find the range for binary search
	        int i = 1;
	        while (i < n && arr[i] <= target) {
	            i *= 2;
	        }
	        
	        // Perform binary search within the range
	        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
	    }
	    
	    public static int binarySearch(int[] arr, int target, int low, int high) {
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        return -1; // Element not found
	    }
	    
	    public static void main(String[] args) {
	        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        int target = 14;
	        
	        int position = exponentialSearch(numbers, target);
	        
	        if (position != -1) {
	            System.out.println("Element found at position " + position);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}

