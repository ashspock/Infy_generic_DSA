package linkedList;

public class Node {
	private String data;//data field
	private Node ptr;//reference obj to type Node
	
	public Node(String data) {//param. constructor
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getPtr() {
		return ptr;
	}
	public void setPtr(Node ptr) {
		this.ptr = ptr;
	}
}
