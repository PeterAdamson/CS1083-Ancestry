// Authors: Tristen Tulkens, Peter Adamson

public class DoublyLinkedList {

	private Node head, tail;
	private int count;
	
	public DoublyLinkedList() {

		head = tail = null;
		count = 0;

	}

	public int size() {

		return count;

	}

	public void addLast(Ancestor ancestor) {

		Node node = new Node(ancestor);
		
		if( head == null ) {

			head = tail = node;
			System.out.println("Insertion successful.");
			
		}

		else if (node.getAncestor().getBirthYear() - tail.getAncestor().getBirthYear() > 18) {

			node.previous = tail;
			tail = tail.next = node;
			System.out.println("Insertion successful.");

		}

		else {

			System.out.println("Age difference must be greater than 18 and person you are adding must be youngest so far!");

		}

		count++;

	}

	public String toStringAscending() {
			
		Node current = head;
		String end = String.format("%s", current.getAncestor().toString());

		while( current.next != null ) {

			current = current.next;
			end = String.format("%s ---> %s", end, current.getAncestor().toString());

		}
	
		return end;

	}

	public String toStringDescending() {
			
		Node current = tail;
		String end = String.format("%s", current.getAncestor().toString());

		while( current.previous != null ) {

			current = current.previous;
			end = String.format("%s <--- %s", end, current.getAncestor().toString());

		}
		
		return end;

	}
	
	private class Node {

		private Ancestor ancestor;
		private Node next, previous;

		public Node(Ancestor ancestor) {

			this.ancestor = ancestor;
			next = previous = null;

		}

		public Ancestor getAncestor() {

			return ancestor;

		}

	}

}



	
