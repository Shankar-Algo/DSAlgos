package com.pkg2;

//Max Heap


public class Heap_SORT 
{
	int a[]= new int []{20,10,50,90,30,70,80,110};
	
	public static void main(String args[])
	{
		Heap_SORT obj = new Heap_SORT();
		obj.heapify();
		
	}
	void heapify()
	{
	//	b[0]=a[0];a.length-1
		for(int i=0;i<a.length;i++)
		{
		//	b[i]=a[i];
			this.adjust(i);
		}
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]);
	}
	void adjust(int i )
	{
		//int level = this.find_level(i);
		int rootpos = this.find_root_pos(i);
		
		while(rootpos>=0 )
		{
		//	int rootpos = this.find_root_pos(i);
		//	System.out.println(rootpos);
			
			if(a[i]>a[rootpos])
			{
				int temp = a[i];
				a[i]=a[rootpos];
				a[rootpos]=temp;
				i=rootpos;
				rootpos = find_root_pos(i);
				
			}
			else
				break;
			
			
		}
	}
	int find_root_pos(int i)
	{
		return (i-1)/2;
	}
	
	/*int find_level(int i)
	{
		int range=0;
		int j;
		for(j=1;j<10;j++)
		{
			range = range + (int)Math.pow(2, j);
			if(range>=i)
				break;
		}
		return j;
	
	}*/
}
