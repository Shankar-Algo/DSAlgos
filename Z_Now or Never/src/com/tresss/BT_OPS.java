package com.tresss;

public class BT_OPS 
{

	public static void main(String[] args) 
	{
		
		BT_OPS obj = new BT_OPS();
		obj.init();
	}

	void init()
	{
		//BT bt = new BT(1);
		BT_New bt = new BT_New(1);
	
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(10);
		bt.insert(11);
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);
		bt.insert(15);
		
		bt.delete_leaf(8);
		
		bt.insert(16);
		
		bt.breadth_first_traversal(0);
		
		//bt.display_pre_order(bt.root);
		//System.out.println();
		//bt.display_in_order(bt.root);
		
	}
}
