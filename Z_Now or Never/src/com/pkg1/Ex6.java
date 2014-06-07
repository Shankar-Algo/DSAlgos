package com.pkg1;

import java.util.HashMap;
import java.util.Map.Entry;

// Given an array with repetition values and if a value is repeated it is assumed it is repeated for only odd no of times. 
//Find the value which is repeated and how many times

public class Ex6 
{

	int a[] = new int[]{1,2,3,3,3,4,6,6,6,6,6};
	HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
	public static void main(String[] args) 
	{
		Ex6 obj = new Ex6();
		obj.calc_repeat();
		obj.displ_hash();

	}

	
	
	public void calc_repeat()
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				if(hp.containsKey(a[i]))
				{
					int incr=hp.get(a[i])+2;
					hp.put(a[i], incr);
					
				}
				else
				{
					hp.put(a[i], 3);
					
				}
				i++;
			}
		}
	}
	public void displ_hash()
	{
		for(Entry<Integer,Integer> en : hp.entrySet())
		{
			System.out.println("value : "+en.getKey()+"   "+" Repeatation : "+en.getValue());
		}
	}
}
