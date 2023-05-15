package Welcome4;
import java.util.Scanner;
	
	public class RangeLandR {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();
	        
	        System.out.print("Enter the value of L: ");
	        int L = scanner.nextInt();
	        
	        System.out.print("Enter the value of R: ");
	        int R = scanner.nextInt();
	        
	        if (L < 0 || R > n - 1 || L > R) {
	            System.out.println("Invalid range!");
	            return;
	        }
	        
	        int sum = 0;
	        for (int i = L; i <= R; i++) {
	            sum += i;
	        }
	        
	        System.out.println("The sum of elements in the range of " + L + " and " + R + " is: " + sum);
	    }
	}

