package com.Linkedlist;

public class Node {
	
	int  Data;
	Node next;
	public Node(int Data) {
		// TODO Auto-generated 
       super();
       this.Data =Data;
	 }
	public int getData() {
		return Data;
	}
	public void setData(int data) {
		Data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
