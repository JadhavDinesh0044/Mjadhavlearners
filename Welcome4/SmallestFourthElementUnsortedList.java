package Welcome4;


	import java.util.Arrays;
	public class SmallestFourthElementUnsortedList {
	    public static int findFourthSmallest(int[] arr) {
	        if (arr.length < 4) {
	            throw new IllegalArgumentException("The array must contain at least 4 elements.");
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Return the fourth element
	        return arr[3];
	    }

	    public static void main(String[] args) {
	        int[] arr = {9, 5, 7, 1, 3, 8, 2, 6, 10};
	        int fourthSmallest = findFourthSmallest(arr);
	        System.out.println("The fourth smallest element is: " + fourthSmallest);
	    }
	}


