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
		BT bt = new BT(5);
		
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(6);
		
		bt.display_pre_order(bt.root);
		System.out.println();
		bt.display_in_order(bt.root);
		
	}
}
