package Welcome4;

public class LinkedList {
	    private Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void deleteFirstOccurrence(int key) {
	        // Check if the list is empty
	        if (head == null) {
	            return;
	        }

	        // Check if the key is present at the head
	        if (head.data == key) {
	            head = head.next;
	            return;
	        }

	        Node prev = head;
	        Node current = head.next;

	        while (current != null) {
	            if (current.data == key) {
	                prev.next = current.next;
	                return;
	            }
	            prev = current;
	            current = current.next;
	        }
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        LinkedList linkedList = new LinkedList();

	        // Create the linked list: 1 -> 2 -> 3 -> 4
	        linkedList.head = new Node(1);
	        Node second = new Node(2);
	        Node third = new Node(3);
	        Node fourth = new Node(4);

	        linkedList.head.next = second;
	        second.next = third;
	        third.next = fourth;

	        System.out.println("Linked List before deletion:");
	        linkedList.display();

	        int keyToDelete = 3;
	        linkedList.deleteFirstOccurrence(keyToDelete);

	        System.out.println("Linked List after deleting the first occurrence of " + keyToDelete + ":");
	        linkedList.display();
	    }
	}


