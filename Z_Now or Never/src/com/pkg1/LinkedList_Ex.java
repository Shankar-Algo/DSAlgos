package com.pkg1;

public class LinkedList_Ex {

	public static void main(String[] args) 
	{
	
		LinkedList_Ex obj = new LinkedList_Ex();
		obj.init();
	}

	public void init()
	{
		//this.ll_ops_init();
		Node n = new Node(10);
		n.Node_Insert(20);
		n.Node_Insert(30);
		this.reverse_LL(null, n);
		
		//this.LL_ops_insert();
		//this.LL_ops_display();
		//this.LL_ops_search(2);
	}
	
	//create ll for solving digit based addition
	public void ll_ops_init()
	{
		Node head1 = new Node(3);
		head1.Node_Insert(1);
		head1.Node_Insert(5);
		
		Node head2 = new Node(5);
		head2.Node_Insert(9);
		head2.Node_Insert(2);
		
		Node head = this.ll_ops(head1, head2, 0);
		this.LL_ops_display(head);
		
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
	public void LL_ops_display(Node head)
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
	//You have two numbers represented by a linked list, where each node contains a sin- gle digit   
	//The digits are stored in reverse order, such that the 1’s digit is at the head of the list  
	//Write a function that adds the two numbers and returns 
	//the sum as a linked list EXAMPLE 
	//Input: (3 -> 1 -> 5), (5 -> 9 -> 2) Output: 8 -> 0 -> 8 
	public Node ll_ops(Node n, Node m , int carry)
	{
		Node result;
		
		int value = carry;
		
		if(n==null && m==null)
			return null;
		
		if(n!=null)
			value += n.d;
		
		if(m!=null)
			value += m.d;
		
		result = new Node(value%10);
		
		Node temp = this.ll_ops(n.next, m.next, (value > 10 ? 1 :  0));
		
		result.next=temp;
		
		return result;
	}
	
	public void reverse_LL( Node prev , Node curr)
	{
		
	
		while(curr.next!=null)
		{
			reverse_LL(curr , curr.next);
			break;
		}
		curr.next=prev;
		System.out.println(curr.d);
		int i =0;
		for(i = 0 ; i < 1 ; i++)
			System.out.println();
		System.out.println(i);
	}
		
		
		/*
		Node head = n;
		Node curr = n;
		Node prev = null;
		Node next ;
		while(curr.next!=null)
		{
			
			next= curr.next;
			
			prev = curr;
			curr = next;
		}
		
		while(prev.next!=null)
		{
			curr.next = prev;
			curr = prev;
			
		}*/
		
	}

