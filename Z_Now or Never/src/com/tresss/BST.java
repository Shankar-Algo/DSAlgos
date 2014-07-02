package com.tresss;

public class BST
{

	Tress_Node root;
	
	BST()
	{
		//this.root = new Tress_Node(data);
	}
	
	BST(int data)
	{
		this.root = new Tress_Node(data);
	}

	void insert(int data)
	{
		Tress_Node temp=root;
		Tress_Node t = new Tress_Node(data);
		Tress_Node l_temp =temp;;
		while(temp!=null)
		{
			 l_temp=temp;
			if(temp.data > data)
			{
				temp = temp.left;
			}
			else 
			{
				temp = temp.right;
			}
		
		
		}
		/*Tress_Node t = new Tress_Node(data);
		if(l_temp.data > data)
		*/
		if(l_temp.data > data)
			l_temp.left = t;
		else
			l_temp.right = t;
		
		
	}
	
	void display_in_order(Tress_Node root)
	{
		/*System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.left.right.data);
		System.out.println(root.left.left.data);
		System.out.println(root.right.data);
	//	System.out.println(root.right.data);
	 * 
	 * 
*/	
	
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
	if(root!=null)
	{
		System.out.println(root.data);
		display_pre_order(root.left);
		
		display_pre_order( root.right );
		//System.out.println(root.data);
		
	}
	}
	
	boolean Tree_bal_check()
	{
		return ((findMax(root) - findMin(root)) <= 1 );
	}
	int findMax(Tress_Node root)
	{
		if(root==null)
			return 0;
		return 1+Math.max(findMax(root.left),findMax(root.right));
	}

	int findMin(Tress_Node root)
	{
		if(root==null)
			return 0;
		return 1+Math.min(findMin(root.left),findMin(root.right));
	}
	
	void contruct_min_hht_Tree(int arr[] , int min , int max)
	{
		int pos = (min + max) / 2; 
		
		
				
		if(min <= max)
		{
			if(root==null)
				root = new Tress_Node(arr[pos]);
			else
			this.insert(arr[pos]);
			//System.out.println(arr[pos]);
			
			contruct_min_hht_Tree(arr,min,pos-1);
			 contruct_min_hht_Tree(arr,pos+1,max);
		}
	/*	return contruct_min_hht_Tree(arr,min,pos);
		return contruct_min_hht_Tree(arr,pos,max);*/
	}
	
	
	void find_ancest(Tress_Node a , Tress_Node b)
	{
		Tress_Node temp = root;
		Tress_Node temp1 = temp;
		while(temp !=null)
		{
			if(a.data > temp.data && b.data < temp.data)
			{
				System.out.println("Ancestor is :"+temp.data);
				break;
			}
			
			if(a.data < temp.data && b.data > temp.data)
			{
				System.out.println("Ancestor is :"+temp.data);
				break;
			}
			
			if(temp.data==a.data || temp.data == b.data)
			{
				System.out.println("Ancestor is :"+temp1.data);
				break;
			}
			
			
			temp1 = temp;
			
			if(a.data > temp.data && b.data > temp.data )
				temp = temp.right;
			else
				temp = temp.left;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
