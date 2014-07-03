package com.recursions;

import java.util.ArrayList;

public class Revise_WorkArnds
{

	public static void main(String[] args) 
	{
		Revise_WorkArnds rw = new Revise_WorkArnds();
		rw.init();

	}

	
	void init()
	{
		this.path_traverse(" ",0,0);
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		ArrayList<ArrayList<String>> allsubsets = subset_cal(list,0);
		System.out.println(allsubsets.size());
		for(ArrayList<String> a :allsubsets )
		{
			for(String t : a)
			{
				System.out.print("   "+t);
			}
			
			System.out.println();
			System.out.println();
		}*/
		braces_check(0,0,new char[6],0);
		
	}
	
	void path_traverse(String path , int x , int y)
	{
		path = path + " "+ x +"  --->  "+y;
		
		if(x==2 && y ==2)
		{
			System.out.println(path);
			return;
		}
		
		if(y < 2)
		{
			path_traverse(path , x , y+1 );
		}
		if(x < 2)
		{
			path_traverse(path , x+1 , y);
		}
	}
	
	
	ArrayList<ArrayList<String>> subset_cal(ArrayList<String> items , int level)
	{
		ArrayList<ArrayList<String>> allsubsets;
		
		if(level == items.size())
		{
			allsubsets = new ArrayList<ArrayList<String>>();
			ArrayList<String> list = new ArrayList<String>();
			list.add("");
			allsubsets.add(list);
			
			
			return allsubsets;
		}
		else
		{
			allsubsets = subset_cal(items , level+1);
			String item = items.get(level);
			ArrayList<String> list;
			ArrayList<ArrayList<String>> allsubsets_temp = new ArrayList<ArrayList<String>>();
			for(ArrayList<String> a :allsubsets )
			{
				list = new ArrayList<String>();
				list.addAll(a);
				list.add(item);
				allsubsets_temp.add(list);
			}
			allsubsets.addAll(allsubsets_temp);
		return allsubsets;
		}
	}
	
	
	void braces_check(int x , int y ,char c[] , int index)
	{
		if(x==3 && y ==3)
		{
			System.out.println();		
			for (char d : c)
			System.out.print(d + "  ");
			System.out.println();
			return;
		}
		if(index>6)
			return;
		if(x < 3)
		{
			c[index] = '(';
			braces_check(x+1,y,c,index+1);
			
		}
		if(y < x)
		{
			c[index] = ')';
			braces_check(x,y+1,c,index+1);
		}
		return;
	}
}
