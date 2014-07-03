package com.tresss;

import java.util.ArrayList;

public class BST_OPS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		BST_OPS obj = new BST_OPS();
		//obj.init();
		obj.dft();
	}

	void init()
	{
		BST bst = new BST(10);
		bst.insert(5);
		bst.insert(7);
		bst.insert(2);
		bst.insert(8);
		bst.insert(15);
		bst.display_in_order(bst.root);
		System.out.println();
		bst.display_pre_order(bst.root);
		System.out.println();
		bst.display_post_order(bst.root);
		
		bst.find_ancest(bst.root.left.right.right, bst.root.left.right);
		//System.out.println(bst.Tree_bal_check());
		
		/*BST bst1 = new BST();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		bst1.contruct_min_hht_Tree(arr, 0, 8);*/
		
	}
	void dft()
	{
		BT bst = new BT(7);
		bst.insert(4);
		bst.insert(6);
		bst.insert(3);
		bst.insert(1);
		bst.insert(1);
	/*	bst.insert(3);
		bst.insert(5);
		bst.insert(4);
		bst.insert(1);
		bst.insert(2);*/
		
		
		/*bst.insert(6);
		bst.insert(4);
		bst.insert(5);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(9);
		bst.insert(8);
		bst.insert(10);*/
		//bst.depth_first_traversal(bst.root);
		//bst.breadth_first_traversal(0);
		
		ArrayList<Integer> c1 = new ArrayList<Integer>(); 
	//	this.fact_check(c1);
		this.findSum(bst.root, bst.root.data, c1, 0);
		//System.out.println("Cnt : "+cnt);
	}
	

	
	
	
	static int cnt = 0;
	void findSum(Tress_Node head, int sum, ArrayList<Integer> buffer,    int level) 
	{ 
		cnt++;
		if (head == null) return; 
		int tmp = sum; 
		buffer.add(head.data); 
		for (int i = level;i >- 1; i--)
		{ 
			tmp -= buffer.get(i); 
			if (tmp == 0) 
				print(buffer, i, level); 
		} 
		ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone(); 
		ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone(); 
		
	
		
		
		
		
		findSum(head.left, sum, c1, level + 1); 
		
		System.out.println("head "+head.data);
		System.out.println("Displaying c1 : ");
		for(int a :c1)
			System.out.print(a +"  ");
		System.out.println();
		System.out.println("Displaying c2 : ");  
		for(int a :c2)
			System.out.print(a +"  ");
		System.out.println();
		
		findSum(head.right, sum, c2, level + 1); 
		
		
		
	
	} 
	void print(ArrayList<Integer> buffer, int level, int i2) 
	{ 
		for (int i = level; i <= i2; i++) 
		{ 
			System.out.print(buffer.get(i) + " ");   
		} 
		System.out.println(); 
		
	}

}
