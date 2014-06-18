package com.pkg1;

public class Stack_Prev 
{

	Node top ;
	Node bottom;
	
	void push(int n)
	{
		Node item = new Node(n);
		if(bottom==null)
			bottom = item;
		if(top!=null)
			top.previous=item;
	
		item.next = top ;
		top = item;
		
	}
	
	
	int pop()
	{
		int d = top.d;
		System.out.println("Popped out : "+d);
		top = top.next;
		top.previous = null;
		return d;
		
	}
	int pop_bottom()
	{
		int d = bottom.d;
		System.out.println("Popped bottom out : "+d);
		bottom = bottom.previous;
		bottom.next=null;
		return d;
	}
	
}
