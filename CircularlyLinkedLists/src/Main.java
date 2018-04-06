
public class Main {

	public static void main(String[] args) {
		
		CircularLinkedList<String> linkedList = new CircularLinkedList<String>();
		
		linkedList.addFirst("Player3");
		linkedList.addFirst("Player2");
		linkedList.addFirst("Player1");
		linkedList.addLast("Player4");
		
		// Simulate a game
		for(int i = 0; i<10; i++) {
			linkedList.printHead();
			linkedList.rotate();
		}
		
	}

}
