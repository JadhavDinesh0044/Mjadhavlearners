package Welcome4;
	class Node1 {
	    int data;
	    Node prev;
	    Node next;

	    public Node1(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;

	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }

	    public void traverseForward() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void traverseBackward() {
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        System.out.println("Forward traversal:");
	        list.traverseForward();

	        System.out.println("Backward traversal:");
	        list.traverseBackward();
	    }
	}

