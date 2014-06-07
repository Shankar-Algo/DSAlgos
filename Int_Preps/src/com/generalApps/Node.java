package com.generalApps;

public class Node 
{

	Object item;
	static int top = -1;
	
	Node(Object item)
	{
		this.item=item;
		top++;
	}
	
	public String toString()
	{
		return item.toString();
	}
}
