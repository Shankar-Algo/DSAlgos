package com.tresss;

import java.util.ArrayList;
import java.util.LinkedList;

public class BT_New
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	BT_New(int data)
	{
		Tress_Node t = new Tress_Node(data);
		this.root = t;
		cnt++;
		
		
			LinkedList<Tress_Node> LL = new LinkedList<Tress_Node>();
			LL.add(root);
			list.add(LL);
		
	}
	
	Tress_Node root;
	int cnt = 0 ;
	
	/*void insert(int data)
	{
		Tress_Node temp = root;
		Tress_Node curr =temp, prev = null;
		while(temp!=null)
		{
			if(temp.left==null)
			{
				Tress_Node t = new Tress_Node(data);
				temp.left = t;
				break;
			}
			else if(temp.right==null)
			{
				Tress_Node t = new Tress_Node(data);
				temp.right = t;
				break;
			}
			
			if(prev!=null && prev==curr)
			{
				curr = temp;
				temp = prev.right;
			}
			else
			{
				prev = curr;
				
				temp = curr.left;
				
				//curr = prev;
				
				
			}
		}
		
	}*/
	
	ArrayList<LinkedList<Tress_Node>> list = new ArrayList();
	int compute_level(int cnt)
	{
		int val = 0 ;
		for(int i = 1 ; i < 100 ; i++)
		{
			 val = val + (int)Math.pow(2, i);
			if(cnt <= val)
			{
			
				return i;
			
			}
		}
		
		return - 1;
	}
	
	void insert(int data)
	{
		
		int level = compute_level(cnt);
		//System.out.println("Level : "+level);
		
		boolean flag = false ;
		if(level>=0)
		flag = insert(data,level);
		
		if(flag)
		{
			cnt++;
			System.out.println("insert done");
		}
		else
			System.out.println("Insert failed");
	}
	
	boolean insert(int data , int level)
	{
		/*LinkedList<Tress_Node> t;
		if(list.size()==0)
		{
			 t = new LinkedList<Tress_Node>();
			t.add(root);
			list.add(t);
		}*/
		//System.out.println(level);
		LinkedList<Tress_Node> t = list.get(level-1);
		Tress_Node n = new Tress_Node(data);
		LinkedList<Tress_Node> temp_LL;
		if(list.size() > level)
		temp_LL = list.get(level);
		else
		{
			temp_LL = new LinkedList<Tress_Node>();
			list.add(temp_LL);
		}
		
		for(Tress_Node temp : t)
		{
			if(temp.left==null)
			{
				temp.left = n ;
				temp_LL.add(n);
				return true;
			}
			else if(temp.right==null)
			{
				temp.right = n ;
				temp_LL.add(n);
				return true;
			}
		}
		return false;	
		
	}
	
	void delete(int data)
	{
		Tress_Node temp = null ;
		int index=0;
		for (LinkedList<Tress_Node> t  : list)
		{
			index++;
			for(Tress_Node tem : t )
			{
				
				if(tem.left!=null )
				{
					if(tem.left.data == data )
					{
						temp = tem;
						break;
					}
				}
				else if(tem.right!=null )
				{
					if(tem.right.data ==data)
					{
						temp = tem;
						break;
					}
				}
			}
		
		if(temp!=null)
			break;
		
		
		}
		
		if(temp==null)
			return;
		
		LinkedList<Tress_Node> t = list.get(index);
		
		
		if(temp.left.data == data )
		{
			Tress_Node in_temp=temp;
			Tress_Node in_t = in_temp.left;
			while(in_t.left!=null)
			{
				in_temp.left.data = in_t.left.data;
				in_temp = in_temp.left;
				in_t = in_t.left;
			}
			in_temp.left=null;
			System.out.println(in_temp.right.data+"  as");
			if(in_temp.right!=null)
			{
				in_temp.left = in_temp.right;
				in_temp.right = null;
			}
			System.out.println(in_temp.left.data+"  as");
			System.out.println(in_temp.data+"  as");
			t.remove(in_temp.left);
			
			
			
			
		}
		else if(temp.right.data == data )
		{
			
			
			
			Tress_Node in_t = temp.right;
			while(in_t.left!=null)
			{
				in_t = in_t.left;
			}
			if(in_t.right!=null)
			{
				in_t.left = in_t.right;
				in_t.right = null;
			}
			
			t.remove(temp.right);
		}
		
	}
	
	void display_pre_order(Tress_Node temp)
	{
		
		if(temp==null)
		{
			//System.out.println("List size : "+list.size());
			return ;
		}
		System.out.println(temp.data);
		display_pre_order(temp.left);
		display_pre_order(temp.right);
		
	}
	
	
	
	void delete_leaf(int data)
	{
	int flag = check_leaf(data);
		if(flag!=-1)
		{
			LinkedList<Tress_Node> par = list.get(list.size()-2);
			LinkedList<Tress_Node> leaf = list.get(list.size()-1);
			Tress_Node delete = par.get(flag/2);
			
			if(delete.left.data==data)
				delete.left=null;
			else
				delete.right=null;
			
			leaf.remove(flag);
			
			int size = leaf.size()-1;
			int cnt=0;
			for(Tress_Node t : par)
			{
				if(cnt <=size)
				t.left=leaf.get(cnt);
				if(cnt+1 <=size)
				t.right=leaf.get(cnt+1);
				
				cnt +=2;
			}
			
			par.get(par.size()-1).right=null;
			this.cnt--;
		}
		else
		{
			System.out.println("Deletion not possible");
		}
	}

	 int check_leaf(int data) 
	 {
		// TODO Auto-generated method stub
		 if(list.size()==1)
			 return -1;
		 int index=0;
		 for(Tress_Node t : list.get(list.size()-1))
		 {
			
			 if(t.data==data)
			 {
				
				 return index;
			 }
				 
		 index++;
		 }
		 
		return -1;
	}
	 ArrayList<LinkedList<Tress_Node>> obj = new ArrayList<LinkedList<Tress_Node>>();
	 void breadth_first_traversal(int level)
		{
			
			LinkedList<Tress_Node> list = new LinkedList<Tress_Node>();
			if(root==null)
				return;
			
			if(level==0)
			{
				//System.out.println(root.data);
				list.add(root);
				//obj.add(list);
				
			}
			else
			{
				System.out.println("Level : "+level);
				for(Tress_Node t : obj.get(level-1))
				{
					System.out.println(t.data);
					/*if(t.left!=null)
					{
						//System.out.println(t);
						list.add(t.left);
						
					}
					if(t.right!=null)
					{
						//System.out.println(t);
						
						list.add(t.right);
					}*/
					if(t.right!=null)
					{
						//System.out.println(t);
						list.add(t.right);
						
					}
					if(t.left!=null)
					{
						//System.out.println(t);
						
						list.add(t.left);
					}
				}
				
			
				
			}
			if(list.size()>0)
			{
				obj.add(list);
				breadth_first_traversal(level+1);
			}
			else
				return;
			
		}
}