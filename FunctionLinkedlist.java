package com.Linkedlist;

public class FunctionLinkedlist {
 Node Head = null;
 
public void Firstelements(int Data) {
 Node Newnode =new Node(Data);
 Newnode.next=Head;
 Head = Newnode;
}
public void LastElements(int Data) {
	Node CurrentNode = Head;
	Node Newnode = new Node(Data);
while(CurrentNode.next != null) {
	CurrentNode=CurrentNode.next;
  }

CurrentNode.next = Newnode;

 }

public void InsertBetween(int Afterelement , int Data) {
	Node CurrentNode = Head;
	Node Newnode=new Node(Data);
	while(CurrentNode.Data != Afterelement) {
		CurrentNode=CurrentNode.next;
	}
	
	Newnode.next =CurrentNode.next;
	CurrentNode.next=Newnode;
}
public void Pop() {
	Head=Head.next;
}
public void Poplast(){
 Node CurrentNode =Head;
 Node exNode = Head;
 while(CurrentNode.next != null) {
	 exNode=CurrentNode;
	 CurrentNode=CurrentNode.next;			 
  }
exNode.next=null;
}
public Node SearchbyNode(int Data) {
	Node CurrentNode=Head;
	
	while(CurrentNode != null) {
	   if(CurrentNode.Data == Data) {
	   System.out.println("Node you were searching for "+Data);
	return CurrentNode;
	}
	CurrentNode=CurrentNode.next;
 }
System.out.println("Node not found"+Data);
return null;
}

public void Displayelements() {
 Node CurrentNode = Head;
 
 while(CurrentNode != null) {
	 System.out.println(CurrentNode.Data);
	 CurrentNode=CurrentNode.next;
  }
 }
}
