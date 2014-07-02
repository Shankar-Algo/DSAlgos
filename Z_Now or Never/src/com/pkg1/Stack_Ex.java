package com.pkg1;

public class Stack_Ex
{

	int stackSize = 300; 
	int[] buffer = new int [stackSize * 3 ]; 
	int[] stackPointer = {0, 0, 299}; 
	// stack pointers to track top elem 
	void push(int stackNum, int value) 
	{ 
		/* Find the index of the top element in the array + 1, and 7    * increment the stack pointer */ 
		int index = stackNum * stackSize + stackPointer[stackNum] + 1; 
		stackPointer[stackNum]++; 
		buffer[index] = value; 
	}
	
	public static void main(String[] args) 
	{
		
		Stack_Ex obj = new Stack_Ex();
		obj.init();
	}
	
	void init()
	{
		this.push(0,1);
		this.push(1,1);
		this.push(2, 1);

		System.out.println(buffer[1]);
		System.out.println(buffer[301]);
		System.out.println(buffer[899]);
		System.out.println();
		for(int a :stackPointer )
			System.out.println(a);
		
	}
}

