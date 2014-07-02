package com.tresss;

import java.util.ArrayList;

public class BST_OPS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		BST_OPS obj = new BST_OPS();
		obj.init();
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
}
