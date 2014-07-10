package com.tresss;

public class BT 
{
	
	Tress_Node root;
	BT()
	{
		
	}
	BT(int data)
	{
		root = new Tress_Node(data);
	}
	
	void insert(int data)
	{
		Tress_Node temp=root;
		Tress_Node prev=null;
		Tress_Node t =new Tress_Node (data);
		int level = 0 ;
		while(temp!=null)
		{
			if(temp.left==null)
			{
				temp.left = t;
				break;
			}
			else if(temp.right==null)
			{
				temp.right=t;
				break;
			}
			
			if(prev!=null)
			{
				temp = prev.right;
				if(temp.left==null)
				{
					temp.left = t;
					break;
				}
				else if(temp.right==null)
				{
					temp.right=t;
					break;
				}
			}
			
			prev = temp;
			
			temp = temp.left;
		}
	}
	
	
	
	/*
	for(int i = 0 ; i < Math.pow(2, level) ; i++)
	{
		if(temp.left==null)
			temp.left = t;
		else if(temp.right==null)
			temp.right=t;
	}
	
	if(temp.left==null)
		temp.left = t;
	else if(temp.right==null)
		temp.right=t;
	
	temp = temp.left;
	level ++;*/
	
	
	
	
	void display_in_order(Tress_Node root)
	{
			
	if(root!=null)
	{
		display_in_order(root.left);
		System.out.println(root.data);
		display_in_order(root.right);
		//System.out.println(root.data);
		
	}
		
	
	
	
	}
	void display_post_order(Tress_Node root)
	{
	if(root!=null)
	{
		display_post_order(root.left);
		
		display_post_order( root.right);
		System.out.println(root.data);
		
	}
	}
	void display_pre_order(Tress_Node root)
	{
	if(root==null)
	return;
		
	System.out.println(root.data);
		display_pre_order(root.left);
		
		display_pre_order( root.right );
		//System.out.println(root.data);
		
	
	}
}
