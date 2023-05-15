package Welcome4;

	import java.util.Stack;

	public class StackExample {
	    public static void main(String[] args) {
	        // Create a stack
	        Stack<Integer> stack = new Stack<>();

	        // Insert elements into the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        System.out.println("Stack elements: " + stack);

	        // Remove an element from the stack
	        int removedElement = stack.pop();
	        System.out.println("Removed element: " + removedElement);
	        System.out.println("Stack after removal: " + stack);

	        // Get the top element without removing it
	        int topElement = stack.peek();
	        System.out.println("Top element: " + topElement);
	        System.out.println("Stack after peek: " + stack);
	    }
	}

