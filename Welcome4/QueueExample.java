package Welcome4;
	import java.util.LinkedList;
	import java.util.Queue;

	public class QueueExample {
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        // Inserting elements into the queue
	        queue.add("Element 1");
	        queue.add("Element 2");
	        queue.add("Element 3");

	        System.out.println("Queue: " + queue);

	        // Removing elements from the queue
	        String removedElement = queue.remove();
	        System.out.println("Removed element: " + removedElement);
	        System.out.println("Updated Queue: " + queue);

	        // Inserting another element
	        queue.add("Element 4");
	        System.out.println("Updated Queue: " + queue);
	    }
	}

