package com.recursions;

import java.util.ArrayList;




public class Stack_As_Is
{ 
	Node top; 
	int cap=0;
	int pop() 
	{
		if (top != null) 
		{ 
			int item = top.d; 
			top = top.next; 
			cap--;
			return item; 
		} 
		return 0; 
	} 
  void push(int item) 
  { 
	  Node t = new Node(item); 
	  t.next = top; 
	  top = t; 
	cap++;  
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
	int capacity = 3;
	ArrayList<Stack_As_Is> stacks  =new ArrayList();
	public static void main(String args[])
	{
		Stack_As_Is obj = new Stack_As_Is();
		obj.init();
		
	}
	void init()
	{
		
		this.m_push(1);
		this.m_push(2);
		this.m_push(3);
		this.m_push(4);
		this.m_push(5);
		display();
		System.out.println("popping");
		this.m_pop();
		display();
		
		
		
	}
	void display()
	{
		for(int i = stacks.size()-1 ; i >=0 ; i-- )
		{
			Stack_As_Is curr = stacks.get(i);
			Node temp = curr.top;
			while(temp!=null)
			{
				System.out.println(temp.d);
				temp = temp.next;
				
			}
		}
	}
	void m_pop()
	{
		Stack_As_Is curr = last_stack();
		curr.pop();
		if(curr.cap==0)
			stacks.remove(curr);
		
	}
	void m_push(int n)
	{
		Stack_As_Is curr = last_stack();
		if(curr != null && curr.cap < capacity)
		{
			curr.push(n);
		}
		else
		{
			Stack_As_Is new_obj = new Stack_As_Is ();
			new_obj.push(n);
			stacks.add(new_obj);
		}
		
	}
	Stack_As_Is last_stack()
	{
		if(stacks.size()==0)
		{
			return null;
		}
		else
		return stacks.get(stacks.size()-1);
	}
} 