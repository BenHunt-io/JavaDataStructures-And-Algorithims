
public class CircularLinkedList<T> {
	
	private Node tail;
	//private Node head;
	
	private class Node{
		public T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	// tail.next is implicity head
	public void addFirst(T data) {
		
		if(tail == null) {
			tail = new Node(data);
			tail.next = tail;
		}
		else {
			Node newNode = new Node(data);
			newNode.next = tail.next;
			tail.next = newNode;

			
			
		}
	}
	
	public void addLast(T data) {
		addFirst(data);
		rotate();
	}
	
	
	public void printList() {
		
		Node ptr = tail.next;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public void printTail() {
		
		if(tail != null) {
			System.out.println(tail.data);
		}
		else {
			System.out.println("null");
		}
	}
	
	public void printHead() {
		
		if(tail.next != null) {
			System.out.println(tail.next.data);
		}
	}
	
	//Roundrobin
	public void rotate() {
		tail = tail.next;
	}
	
	
}
