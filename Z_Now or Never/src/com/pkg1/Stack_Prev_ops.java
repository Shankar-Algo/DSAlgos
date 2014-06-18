package com.pkg1;

public class Stack_Prev_ops 
{

	public static void main(String[] args) 
	{
		Stack_Prev_ops obj = new Stack_Prev_ops();
		obj.init();

	}
	void init()
	{
		Stack_Prev s1 = new Stack_Prev();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.pop_bottom();
		
		Node top = s1.bottom;
		while(top!=null)
		{
			System.out.println(top.d);
			top = top.previous;
		}
		
	}
	
}
