package com.Linkedlist;

public class Linkedlist {
	public static void main(String[] args) {
		
	
     
	Node node1st =new Node(56);
	Node node2nd =new Node(30);
	Node node3rd =new Node(70);
	
	Node Head = node1st;
	node1st.setNext(node2nd);
	node2nd.setNext(node3rd);
	Node Tail = node3rd;
	
	Node current = Head;
	while(current!= null) {
System.out.println(current.getData());
 current=current.getNext();
	}
		
  }
}