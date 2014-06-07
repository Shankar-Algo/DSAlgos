package com.pkg1;


//Max Heap sort


public class Ex5 
{

	int a[]= new int []{20,10,50,90,30,70,80,110};
	int b[] = new int [a.length];
	public static void main(String args[])
	{
		Ex5 obj = new Ex5();
		obj.heapify();
		
	}
	void heapify()
	{
		b[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			b[i]=a[i];
			this.adjust(i);
		}
		for(int i =0;i<b.length;i++)
			System.out.println(b[i]);
	}
	void adjust(int i )
	{
		int level = this.find_level(i);
		
		while(level>0)
		{
			int rootpos = this.find_root_pos(i);
		//	System.out.println(rootpos);
			
			if(b[i]>b[rootpos])
			{
				int temp = b[i];
				b[i]=b[rootpos];
				b[rootpos]=temp;
				i=rootpos;
				level--;
			}
			else
				break;
		}
	}
	int find_root_pos(int i)
	{
		if(i%2==0)
			return (i-2)/2;
		else
			return (i-1)/2;
	}
	
	int find_level(int i)
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
	
	}

}
