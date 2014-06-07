package com.generalApps;

import java.util.ArrayList;

public class Stack_demo
{
	ArrayList<Node> list  = new ArrayList<Node>();
	public static void main(String... args)
	{
		Stack_demo s = new Stack_demo();
		/* s.stack_push("hello");
		 s.stack_push(25);
		 s.stack_push('g');
		 s.stack_pop();
		 s.stack_iterate();*/
		int k =s.find(32242);
	}
	
	int find(int j)
	{
	if(j>0)
	{
		/*System.out.println(j%10);
		System.out.println(j/10);*/
	j=(j%10)+find(j/10);
	System.out.println(j);
	}
	return j;
	}
	public void stack_push(Object obj)
	{
		list.add(new Node(obj));
	}
	public void stack_pop()
	{
		list.remove(Node.top);
		Node.top--;
		
	}
	public void stack_iterate()
	{
		for(Node st : list)
		{
			System.out.println(st.toString());
		}
		System.out.println(Node.top);
	}
}
