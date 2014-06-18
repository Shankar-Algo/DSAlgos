package com.pkg1;

public class Stack_New {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack_New obj = new Stack_New();
		obj.init();
	}
	
	void init()
	{
		this.push(0, 0);
		this.push(0, 1);
		//System.out.println(this.pop(0));
		System.out.println(buffer[0]);
		System.out.println(buffer[1]);
		System.out.println(buffer[2]);
	}
	int stackSize = 300; 
	 int[] buffer = new int [stackSize * 3]; 
	 int[] stackPointer = {-1, -1, -1}; 
	 // stack pointers to track top elem 4 5 
	 void push(int stackNum, int value) 
	 { 
		 /* Find the index of the top element in the array + 1, and 7    * increment the stack pointer */ 
		 int index = stackNum * stackSize + stackPointer[stackNum] + 1; 
		 stackPointer[stackNum]++; 
		 buffer[index] = value; 
		 } 
	 int pop(int stackNum) 
		 {   int index = stackNum * stackSize + stackPointer[stackNum]; 
		// System.out.println(index);
		 stackPointer[stackNum]--; 
		 int value = buffer[index]; 
		 buffer[index]=0; 
		 return value; 
		 }
}
