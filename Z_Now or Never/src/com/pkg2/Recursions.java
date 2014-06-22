package com.pkg2;

import java.util.ArrayList;

public class Recursions
{

	public static void main(String[] args) 
	{
	
		Recursions obj = new Recursions();
		obj.init();
	}

	void init()
	{
		/*ArrayList<Integer> n1 = new ArrayList<Integer>();
		n1.add(1);
		n1.add(2);
		n1.add(3);//
		n1.add(4);
		n1.add(5);
		this.subset(n1, 0,0);
		for(String s : list1)
		{
			System.out.println(s);
		}*/
		this.getPaths(0,0,"");
		for(String s : this.current_path)
		{
			System.out.println();
			System.out.println(s);
		}
		ArrayList<String> list1 = new ArrayList<String>();
		
	}
	
	
	int temp = 0;
	String str="";
	ArrayList<String> list1 = new ArrayList<String>();
	int i = 0;
	void subset(ArrayList<Integer> n1 , int k , int off )
	{
		
		if(temp==0)
		{
			list1.add("[]");
			
			list1.add(n1+"");
			
			for(int n : n1 )
			{
				list1.add("["+n+"]");
			}
			
			temp =1;
			this.i++;
			subset(n1,i++,1);
		}
		else if(temp !=0 && off < n1.size()-1)
		//else if(this.i<n1.size() || off < n1.size()-1)
		{
			
			int prev_off = off;
				
			//str="["+i+",";
			for(int l = k ; l <=n1.size();l++ )
			{
				str="["+l+"";
			for(int j = l+1 ; j <= n1.size()  ; j++)
			{
				
				int temp_j = j;
				
				while(off>0 && j<=n1.size())
				{
					str = str + ","+j+"";
					j=j+1;
					off--;
					
				}
				str = str + "]";
				//System.out.println(str);
				if(off==0)
				list1.add(str);
				off = prev_off;
				str="["+l+"";
				j = temp_j;
			}
			//}
			//off--;
			
			}
					subset(n1,1,++prev_off);
			
		}
	}
	
	//ArrayList<ArrayList<String>> current_path = new ArrayList<ArrayList<String>>(); 
	ArrayList<String> current_path = new ArrayList<String>();
	int max_limit = 10;
	String strr="";
	public  boolean getPaths(int x, int y , String tem) 
	 { 
		 //Point p = new Point(x, y); 
	//	strr=x+" --> "+y;
		 tem = tem + " "+x+" --> "+y +",";
		// System.out.println(tem);
		 if (2 == x && 2 == y) 
		 {
			 max_limit--;
			 
			 if(!current_path.contains(tem))
				 current_path.add(tem); 
			 return true; 
		 }
		 
		 if(max_limit==0)
			 return true;
		 // current_path 6  
		 boolean success = false; 
		 if ( y < 2 && check(x,y,tem) )
		 {
			 
			 success = getPaths(x, y + 1,tem); // Free!  Go down 
			 
		 }
		 
		 if ((x < 2 ) && check(x,y,tem)) 
		 {
		 
			
			    success = getPaths(x+1, y,tem); // Free!  Go right 
			   
		 } 
	
		   
		 if(max_limit==0)
			 return true;
		
		 return success; 
		
	 }
		 
	 
	
	public boolean check(int x , int y ,String temp)
	{
		if(((x+1) <= 2 || (y+1) <=2) && (!temp.contains(x+1+" --> "+y) || !!temp.contains(x+1+" --> "+y)))
			return true;
		else
			return false;
	}
}
	/* public  boolean getPaths(int x, int y) 
	 { 
		 //Point p = new Point(x, y); 
		 String str = " "+x+" --> "+y;
		 current_path.add(str); 
		 if (0 == x && 0 == y) 
			 return true; 
		 // current_path 6  
		 boolean success = false; 
		 if (x >= 1 )//&& is_free(x - 1, y)) 
		 {
			 // Try right 
			    success = getPaths(x - 1, y); // Free!  Go right 
		    } 
		 if (!success && y >= 1 )//&& is_free(x, y - 1)) 
		 { // Try down 11  
			 success = getPaths(x, y - 1); // Free!  Go down 
			  }   
		 if (!success) 
		 {   
			 current_path.remove(str); // Wrong way! 15  
			 } 
		 return success; 
		 }
		 
	 }*/
	
