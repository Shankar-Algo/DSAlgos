package com.pkg1;

public class Stack {

	
	
	public static void main(String[] args) 
	{
	
		Stack obj = new Stack();
		obj.init();
	
	}
	void init()
	{
		this.push(10);
		this.push(20);
		this.push(30);
		System.out.println((int)this.pop());
	}
	
	 Node top; 
	  Object pop() { 
		  if (top != null) 
		  { 
			  Object item = top.d; 
			  top = top.next; 
			  
			  return item;   
		  }     
		  return null; 
		  } 
	  void push(int item) 
	  { 
		  Node t = new Node(item); 
		 
		  t.next = top;
		  
		  top = t;
		 
	  } 

}
