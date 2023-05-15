package Welcome4;

public class CircularSortedListInsert {
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            next = null;
	        }
	    }

	    static Node insert(Node head, int data) {
	        Node newNode = new Node(data);

	        if (head == null) { // If the list is empty
	            newNode.next = newNode;
	            return newNode;
	        }

	        Node current = head;

	        // Case 1: Insertion at the beginning of the list
	        if (data < current.data) {
	            while (current.next != head) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.next = head;
	            head = newNode;
	        }
	        // Case 2: Insertion in the middle or at the end of the list
	        else {
	            while (current.next != head && current.next.data < data) {
	                current = current.next;
	            }
	            newNode.next = current.next;
	            current.next = newNode;
	        }

	        return head;
	    }

	    static void displayList(Node head) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node current = head;

	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Node head = null;

	        // Inserting elements into the sorted circular linked list
	        head = insert(head, 4);
	        head = insert(head, 2);
	        head = insert(head, 6);
	        head = insert(head, 1);
	        head = insert(head, 5);
	        displayList(head);
	    }

}
