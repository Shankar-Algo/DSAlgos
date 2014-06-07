package com.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Finds all patterns to a no say if the no is 5 it finds 1,1,1,1,1 ; 1,2,2 ; 1,1,3 ; 1,1,1,2 ; etc ....

public class Ex2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Ex2 obj = new Ex2();
		obj.pattern_add(5);
		obj.print_patt();
	}

	List<String> s = new ArrayList<String>();
	
	void pattern_add(int no)
	{
		for(int i =1 ; i<=no ; i++)
		{
			for(int j =1 ; j<=no ;j++)
			{
				int result = i;
				String print_patt = ""+i;
				while(result < no)
				{
					result = result +j;
					print_patt = print_patt+","+j;
				}
				if(result ==no && !s.contains(print_patt))
				{
					s.add(print_patt);
					print_patt=null;
				}
			}
		}
	}
	void print_patt()
	{
		for(String patt : s)
		{
			System.out.println(patt);
		}
	}
	
}
