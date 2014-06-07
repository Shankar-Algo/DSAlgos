package com.pkg1;

public class LinkedList_Ex {

	public static void main(String[] args) 
	{
	
		LinkedList_Ex obj = new LinkedList_Ex();
		obj.init();
	}

	public void init()
	{
		this.LL_ops_insert();
		//this.LL_ops_display();
		this.LL_ops_search(2);
	}
	Node head;
	public void LL_ops_insert()
	{
		 head = new Node(1);
		head.Node_Insert(5);
		head.Node_Insert(3);
		head.Node_Insert(9);
		head.Node_Insert(2);
		
		
	}
	public void LL_ops_display()
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.println(curr.d);
			curr = curr.next;
		}
	}
	
	public void LL_ops_search(int d)
	{
		Node curr = head;
		int pos=0;
		boolean flag =  false;
		while(curr!=null)
		{
			if(curr.d==d)
			{	
				flag = true;
				break;
			}
			
			pos++;
			curr = curr.next;
		}
		if(flag)
		System.out.println("Element found at : "+pos);
		else
			System.out.println("Element not found");
	}
	
}
