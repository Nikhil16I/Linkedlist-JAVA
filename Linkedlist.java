package com.Linkedlist;

public class Linkedlist {
	public static void main(String[] args) {
		
	FunctionLinkedlist newlist =new FunctionLinkedlist();
		newlist.Firstelements(56);	
		newlist.LastElements(30);
		newlist.LastElements(70);
		newlist.InsertBetween(30, 40);	
		newlist.Displayelements();
		System.out.println("size of element " +newlist.Size());
		
		newlist.Deleteelement(40);
	newlist.Displayelements();
	System.out.println("size of element " +newlist.Size());
	}
			
}