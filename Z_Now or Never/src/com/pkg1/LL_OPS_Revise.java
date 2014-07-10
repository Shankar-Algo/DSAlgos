package com.pkg1;

public class LL_OPS_Revise {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LL_OPS_Revise obj = new LL_OPS_Revise();
		obj.init();
	}

	void init()
	{
		/*LL_Revise l = new LL_Revise(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		
	//	l.display();
		l.delete(3);
	//	l.display();
		
		l.push(4);
		l.push(4);
		l.push(4);
		l.push(2);
		l.push(2);
		
		//l.display();
		l.n_2_last(5);
		
		//l.delete_dups();
		
		l.display();*/
		
		LL_Revise l = new LL_Revise(3);
		l.push(1);
		l.push(5);
		LL_Revise ll = new LL_Revise(5);
		
		ll.push(9);
		ll.push(2);
		
		Node head = list_Add(l.head,ll.head,0);
		while(head!=null)
		{
			System.out.println("value : "+head.d);
			System.out.println("carry : "+head.carry);
			head = head.next;
		}
		
		
	}
	
	Node list_Add(Node n1 , Node n2 ,int carry)
	{
		int sum = 0;
		if(n1==null && n2==null)
			return null;
		sum +=n1.d;
		sum +=n2.d;
		sum +=carry;
		Node t = new Node(sum%10 , carry);
		Node ret= list_Add(n1.next,n2.next,sum/10 > 0 ? 1:0);
		t.next=ret;
		return t;
		
	}
}
