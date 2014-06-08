package com.pkg1;


public class Stack_As_Is
{ 
	Node top; 
	int pop() 
	{
		if (top != null) 
		{ 
			int item = top.d; 
			top = top.next; 
			return item; 
		} 
		return 0; 
	} 
  void push(int item) 
  { 
	  Node t = new Node(item); 
	  t.next = top; 
	  top = t; 
	  } 
  

	int peek()
	{
		if(top!=null)
		return top.d;
		else
			return 10;
	}

	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
} 