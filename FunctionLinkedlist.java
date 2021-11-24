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
	Node CurrentNode = SearchbyNode(Afterelement);
	if(CurrentNode == null) {
	System.out.println("Node is not available in List");
	return;
	}
	Node Newnode=new Node(Data);
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
	return CurrentNode;
	}
	CurrentNode=CurrentNode.next;
 }
System.out.println("Node not found"+Data);
return null;
}
  public void Deleteelement(int Data) {
	  Node CurrentNode =Head;
	  Node exNode =Head;
	 while (CurrentNode != null) {
		if(CurrentNode.Data == Data) {
			exNode.next= CurrentNode.next;
			return;
		}
	exNode=CurrentNode;
	CurrentNode=CurrentNode.next;
	 }
	 System.out.println("Node you were searching for "+Data);
  }
  
  public int Size() {
	  Node CurrentNode = Head;
	  int Count = 0;
while(CurrentNode != null) {
	Count++;
	CurrentNode=CurrentNode.next;
  }
return Count;
}

	public void InsertingHead(int value) {
		Node Newnode = new Node(value);
		Newnode.next = Head;
		Head = Newnode;
		Displayelements();
	}
  public void Sortelement(int Data) {
		Node Newnode = new Node(Data);
		
		if (Head == null) {
			InsertingHead(Data);
			return;
		}
		
		if (Head.Data > Newnode.Data) {
			InsertingHead(Data);
			return;
		}
		
		Node CurrentNode = Head;
		Node exNode = Head;
		
		while (CurrentNode != null) {
			if(Newnode.Data < CurrentNode.Data) {
				Newnode.next = CurrentNode;
				exNode.next = Newnode;
				break;
			}
			else if (Newnode.Data > CurrentNode.Data && CurrentNode.next == null) {
				CurrentNode.next = Newnode;
				break;
			}
			
			exNode = CurrentNode;
			CurrentNode = CurrentNode.next;
		}
		
		Displayelements();
	}

  
  
public void Displayelements() {
 Node CurrentNode = Head;
 
 while(CurrentNode != null) {
	 System.out.println(CurrentNode.Data);
	 CurrentNode=CurrentNode.next;
  }
 }
}
