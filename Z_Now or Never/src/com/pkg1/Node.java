package com.pkg1;

public class Node 
{

	int d ;
	Node next;
	Node previous;
	Node(int d)
	{
		this.d=d;
	}
	
	public  void Node_Insert(int n)
	{
		Node new_node = new Node(n);
		Node temp = this;
		while(temp.next!=null)
			temp = temp.next;
	
		temp.next = new_node;
	}
}
