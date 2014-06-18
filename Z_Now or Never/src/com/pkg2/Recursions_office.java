package com.pkg2;




import java.awt.Point;
import java.util.ArrayList;

public class Recursions_office {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Recursions_office obj = new Recursions_office();
		/*StringBuffer s = new StringBuffer("{1,2,3}");
		s.replace(2, 3, ";");
		System.out.println(s);*/
		
		
		obj.init();
	}
	
	public void init()
	{
		/*String s = "{1,2,3}";
	StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.deleteCharAt(s.indexOf(",")));
		System.out.println(s);*/
		//this.fibonacci(12);
		//System.out.println(this.fib_rec(6));
		//this.fib_mat();
		//this.recr_path(0, 0 ,"" );
		//this.init_subset("{1,2,3,4}");
		/*StringBuffer sb = new StringBuffer("{1,2,3}");
		System.out.println(sb.indexOf(","));*/
		/*ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		ArrayList<ArrayList<Integer>> obj1 = this.getSubsets(obj, 0);
		
		for(ArrayList list : obj1)
		{
			for(Object a : list)
			{
				System.out.println((Integer)a);
			}
		}*/
		/*this.getPaths(1,2);
		this.getPaths_y(1, 2);
		this.displayed_paths();*/
		System.out.println(this.makeChange(100, 25));
		
	}
	

	void fibonacci (int n)
	{
		int prev = 0 ; int curr = 1;
		int cntr = 0;
		while(cntr<=n)
		{
			
			System.out.println(curr);
			
			curr = curr + prev;
			prev = curr - prev;
			
			cntr++;
		}
	}
	
	int fib_rec(int n)
	{
		if(n==0)
			return 0 ;
		if(n==1)
			return 1;
		if(n>0)
			return fib_rec(n-2) + fib_rec(n-1);
		
		else
			return -1;
	}
	
	void fib_mat()
	{
		int a[][] = new int[][]{{1,1},{1,0}};
		int b[] = new int []{3,2};
		int c[] = new int [2];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < b.length  ; j++)
			{
				c[i]=c[i]+(a[i][j]*b[j]);
			}
		}
		System.out.println(c[0]);
		
	}
	
	// Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can only move in two directions: right and down. 
	// How many possible paths are there for the robot?
	boolean d_flag=true;
	boolean r_flag=true;
	boolean flag = true;
	int max_x = 1 ; int max_y = 2;
	//String temp =0+","+0+"  --> ";
	String buffer="";
	ArrayList<String> list1 = new ArrayList<String>();
	String temp="0,0  -->";
	void recr_path(int x , int y ,String buffer )
	{
		
		
			
			
			//System.out.print("  "+x+","+y+"  --> ");
			if(y < max_y && d_flag)
			{
				y++;
				temp =  temp+"  "+x+","+y+"  --> ";
				buffer = "  "+x+","+y+"  --> ";
				recr_path(x,y , buffer);
				d_flag=false;
				temp = temp.replaceAll(buffer, "") ; 
				//System.out.println("After temp0 : "+temp);
				
			}
			
			if(!d_flag)
			{	
				y--;
				d_flag=true;
			
			}
			/*if(!d_flag)
				y--;*/
			if(x < max_x && d_flag)
			{
				x++;
				temp = temp+"  "+x+","+y+"  --> ";	
				buffer = "  "+x+","+y+"  --> ";
				d_flag=true;
				recr_path(x,y,buffer);
				d_flag = false;
				
				temp = temp.replaceAll(buffer, "") ; 
				//System.out.println("After temp1 : "+temp);
				//r_flag= false;
			}
			
			if(x==max_x && y == max_y  && d_flag)
			{
				System.out.println(temp + " End ");
				buffer = "  "+x+","+y+"  --> ";
				temp = temp.replaceAll(buffer, "") ; 
				//System.out.println("After temp2 : "+temp);
				
			}
		}
	StringBuffer sb , ss;
	int s_size=0;
	void init_subset(String s)
	{
		 sb = new StringBuffer(s); 
		 ss = new StringBuffer(sb);
		
		 s_size = this.set_size(ss)+1;
		 System.out.println("Size : "+s_size);
		 this.sub_recur(0,0);
	}
	
	// Subsets using recursions
	int m_index=0;
	int off = 0; 
	int s_cntr=0;
	public void sub_recur(int m_index,int off)
	{
		
		//System.out.println("M - Index : "+m_index);
		
		/*if(s_cntr < sb.length() )
		{	
			String temp ="{";
			//System.out.println("inside if : "+sb);
			temp = temp + ret_values(sb,m_index,off) + "} , ";
			
			m_index=index;
			s_cntr = s_cntr + m_index;
			System.out.println(temp);
			sub_recur(m_index , off);
		}
		s_cntr=0;
		m_index=0;
		off++;
		if(off<=s_size)
			sub_recur(m_index,off);*/
		/*while(m_index < 3)
		{
		System.out.println("test : " + ret_values(sb,2,0) + "}");
		System.out.println(index);
		sb = new StringBuffer("{1,2,3}");
		m_index = index + m_index;;
		System.out.println(m_index);
		}*/
		//System.out.println(sb);
		System.out.println("test : {" + ret_values(sb,5,3) + "}");
	}
	
	String ret_values(StringBuffer s , int start , int off)
	{
		s = new StringBuffer("{1,2,3,4}");
		String value;
		//System.out.println("inside ret values : "+s);
		
		value = s.substring(start, start+src_end(off,s)-1);
		
		//System.out.println("returning value");
		//sb = new StringBuffer("{1,2,3}");
		//System.out.println(sb);
		return value;
		
	}
	
	int index=0;
	int src_end(int off , StringBuffer s)
	{
		s = new StringBuffer("{1,2,3,4}");
		while(off > 0)
		{
			//System.out.println("insde off : "+s);
			index =  s.indexOf(",");
			//System.out.println("index "+index);
			s = s.replace(index, index+1, ";");
			
		//System.out.println(s);
			//s_cntr++;
		--off;
			src_end(off , s );
			//System.out.println(s);
		}
		//System.out.println(sb);
		//System.out.println(index);
		return index;
	}
		
	int size; int pos =0;
	int set_size(StringBuffer s)
	{
		if(s.indexOf(",")!=-1)
		{	
			size++;
			s.deleteCharAt(s.indexOf(","));
			set_size( s);
		}
		
			return size;
	}
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index) 
	{
			 ArrayList<ArrayList<Integer>> allsubsets;
			 if (set.size() == index)
			 {
			 allsubsets = new ArrayList<ArrayList<Integer>>();
			 allsubsets.add(new ArrayList<Integer>()); // Empty set
			 } 
			 else 
			 {
			 allsubsets = getSubsets(set, index + 1);
			 int item = set.get(index);
			 ArrayList<ArrayList<Integer>> moresubsets =
			 new ArrayList<ArrayList<Integer>>();
			 for (ArrayList<Integer> subset : allsubsets) 
			 {
			 ArrayList<Integer> newsubset = new ArrayList<Integer>();
			 newsubset.addAll(subset); //
			 newsubset.add(item);
			 moresubsets.add(newsubset);
			 }
			 allsubsets.addAll(moresubsets);
			 }
			 return allsubsets;
	}
	
	ArrayList<Point> current_path = new ArrayList<Point>();
	ArrayList<Point> current_path1 = new ArrayList<Point>();
	 public  boolean getPaths(int x, int y ) 
	 {  Point p = new Point(x, y);
	  current_path.add(p); 
	  if (0 == x && 0 == y) return true; 
	  // current_path 6  
	  boolean success = false; 
	  if (x >= 1) 
	  { // Try right 8  
		  success = getPaths(x - 1, y); // Free!  Go right 9 
		System.out.println(success);
	  } 
	  if (!success && y >= 1) 
		  { // Try down 11 
		  success = getPaths(x, y - 1); // Free!  Go down 12  
		  } 
	    if (!success) 
	    { 
	    	current_path.remove(p); // Wrong way! 15  
	    	} 
	    
	   
	    return success; 
	    }
	  public boolean getPaths_y(int x1 , int y1)
	  {
		  Point p1 = new Point(x1, y1);
		    current_path1.add(p1); 
			  if (0 == x1 && 0 == y1) return true; 
			  // current_path 6  
			  boolean success1 = false; 
			 
			  if (  y1 >= 1) 
			  { // Try down 11 
				  success1 = getPaths_y(x1, y1 - 1);
				   // Free!  Go down 12  
			  System.out.println(success1);
			  } 
			  if ( !success1 && x1 >= 1) 
			  { // Try right 8  
				  success1 = getPaths_y(x1-1,y1);
				  // Free!  Go right 9 
				
			  } 
			 
			    if (!success1) 
			    { 
			    	current_path1.remove(p1); // Wrong way! 15  
			    	} 
			    
			    return success1;
		    
	  }
	 void displayed_paths()
	 {
		 for(Point p : current_path)
			 System.out.println(p.x+"  "+p.y);
		 System.out.println("--------------------------------------");
		 for(Point p : current_path1)
			 System.out.println(p.x+"  "+p.y);
	 }
	 
	 public static int makeChange(int n, int denom) 
	 {
		 int next_denom = 0; 
		 switch (denom) 
		 { 
		 case 25: 
			 next_denom = 10; 
			 break; 
			 case 10: 
				 next_denom = 5; 
				 break; 
				 case 5: 
				 next_denom = 1; 
				 break; 
				 case 1: 
					 return 1; 
		} 
					 
					 int ways = 0; 
					 for (int i = 0; i * denom <= n; i++)
					 {  
						 ways += makeChange(n - i * denom, next_denom); 
					 }
					 System.out.println(ways);
					   return ways; 
	} 
}