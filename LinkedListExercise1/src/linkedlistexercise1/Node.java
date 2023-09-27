//lex_auth_012891254270844928318
//do not modify the above line

package linkedlistexercise1;

public class Node {
	private String data;
	private Node next;

	public Node(String data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public String getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}
}
