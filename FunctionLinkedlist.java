package com.Linkedlist;

public class FunctionLinkedlist {
 Node Head = null;
 
public void Firstelements(int Data) {
 Node Newnode =new Node(Data);
 Newnode.next=Head;
 Head = Newnode;
}

public void Displayelements() {
 Node CurrentNode = Head;
 
 while(CurrentNode != null) {
	 System.out.println(CurrentNode.Data);
	 CurrentNode=CurrentNode.next;
  }
 }
}
