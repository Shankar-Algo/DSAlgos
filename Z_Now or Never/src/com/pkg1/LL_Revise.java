package com.pkg1;

public class LL_Revise 
{

	Node head;
	
	LL_Revise(int data)
	{
		this.head = new Node(data);
	}
	
	void push(int data)
	{
		
		Node temp =head;
		while(temp.next!=null)
			temp = temp.next;
		temp.next = new Node(data);
		
		
	}
	
	void delete_dups()
	{
		Node prev = head;
		Node curr = prev.next;
		boolean flag= false;
		while(curr!=null)
		{
			Node runner = head;
			while(runner!=curr)
			{
				if(runner.d==curr.d)
				{
					prev.next=curr.next;
					flag = true;
					break;
					
				}
				runner = runner.next;
			}
			if(!flag)
			{
			prev = curr;
			curr = curr.next;
			}
			else
			{
				
				curr= prev.next;
			}
		}
	}
	
	void delete(int data)
	{
		Node prev = head;
		Node curr = prev.next;
		while(curr!=null)
		{
			if(curr.d==data)
			{
				prev.next = curr.next;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
	}
	
	void display()
	{
		Node temp = head;
		System.out.println();
		while(temp!=null)
		{
			System.out.println(temp.d);
			temp = temp.next;
		}
	}
	
	void n_2_last(int n)
	{
		Node first = head ;Node second = head;
		int i = 0 ;
		while(i<=n)
		{
			second = second.next;
			i++;
		}
		while(second.next!=null)
		{
			first =  first.next;
			second = second.next;
		}
		if(first!=head)
			System.out.println(first.d);
		else
			System.out.println("Invalid n value");
			
		
	}
	
	Node list_Add(Node n1 , Node n2 ,int carry)
	{
		int sum = 0;
		if(n1==null && n2==null)
			return null;
		sum +=n1.d;
		sum +=n2.d;
		sum +=carry;
		Node t = new Node(sum%10 , sum/10);
		Node ret= list_Add(n1.next,n2.next,sum/10 );
		t.next=ret;
		return t;
		
	}
}
