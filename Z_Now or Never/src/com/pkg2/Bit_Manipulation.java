package com.pkg2;

import java.util.ArrayList;

public class Bit_Manipulation {

	public static void main(String[] args) 
	{
		
		Bit_Manipulation obj= new Bit_Manipulation();
		obj.init();
	}

	void init()
	{
		this.con_string_binary("12.45");
		//System.out.println(this.swapOddEvenBits(9));
		ArrayList<String> str = new ArrayList<String>();
		str.add("0000");
		str.add("0001");
		str.add("0010");
		//str.add("0011");
		str.add("0100");
		str.add("0101");
		//System.out.println(findMissing(str));
	}
	
	public void con_string_binary(String n)
	{
		int intPart = Integer.parseInt(n.substring(0, n.indexOf('.'))); 
		  double decPart = Double.parseDouble( n.substring(n.indexOf('.'), n.length()));
		  
		  System.out.println(intPart);
		  System.out.println(decPart);
		  
		  String int_part="";
		  
		  while(intPart > 0)
		  {
			  int r = intPart % 2;
			  intPart >>= 1;
			  int_part = r + int_part;
		  }
		  
		  System.out.println("integer part : "+int_part);
		  String decpart="";
		  while(decPart > 0)
		  {
			  
			  	if (decPart == 1) 
		 		{ 
					 decpart = decpart + "1";     
				   System.out.println("inside");
					 break; 
				   
				  } 
			  double r = 2 * decPart;
			  if(r >=1)
			  {
				  decpart = decpart + "1";
				  decPart = r - 1;
				 // System.out.println("inside if");
			  }
			  else
			  {
				  decpart = decpart + "0";
				  decPart =  r;
				 // System.out.println("inside else");
			  }
			  
			 // System.out.println(decpart);
		  }
		  System.out.println("decimal part : "+decpart);
		  System.out.println("Converted number is : "+int_part+"."+decpart);
	}
	
	public static int swapOddEvenBits(int x)
	{ 
		System.out.println(0xaaaaaaaa);
	Integer obj = new Integer("45");
	System.out.println(obj.toBinaryString(4));
	
		System.out.println(23);
		System.out.println(0x55555555);
		return ( ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1) ); 
		//BitInteger a = 1100;
	
	
	} 
	
	
	int findMissing(ArrayList<String> array)
	{ 
		return findMissing(array, 3); 
		}        
	int findMissing(ArrayList<String> input, int column) 
	{ 
		System.out.println("Column : "+column);
		if (column < 0) 
		{ 
			// Base case and error condition 7     
			return 0; 
	     } 
		ArrayList<String> oddIndices = new ArrayList<String>(); 
		  ArrayList<String> evenIndices = new ArrayList<String>();  
		  for (String t : input) 
		  {  
			  if (t.charAt(column) == '0')
			  { 
			  evenIndices.add(t);   
		  	  } 
			  else 
			  {
				  	oddIndices.add(t);  
			  }   
		  } 
		  System.out.println("Odd indices size : "+oddIndices.size());
		  System.out.println("Even indices size : "+evenIndices.size());
		  if (oddIndices.size() >= evenIndices.size()) 
		  { 
			  System.out.println("Inside even indices list");
			  for(String t :evenIndices )
				  System.out.println(t);
			  
			  return (findMissing(evenIndices, column - 1)) << 1 | 0; 
		  } 
		  else 
		  {    
			  System.out.println("Inside odd indices list");
			  for(String t :oddIndices )
				  System.out.println(t);
			  
			  return (findMissing(oddIndices, column - 1)) << 1 | 1; 
		    }
		/*  if (oddIndices.size() < evenIndices.size()) 
		  { 
			  System.out.println("Inside even indices list");
			  for(String t :evenIndices )
				  System.out.println(t);
			  
			  return (findMissing(evenIndices, column - 1)) << 1 | 0; 
		  } 
		  else if(oddIndices.size() == evenIndices.size()) 
		  {    
			  System.out.println("Inside odd indices list");
			  for(String t :oddIndices )
				  System.out.println(t);
			  
			  return (findMissing(oddIndices, column - 1)) << 1 | 1; 
		    }
		  else
		  {
			  System.out.println("Inside odd indices list");
			  for(String t :oddIndices )
				  System.out.println(t);
			  
			  return (findMissing(oddIndices, column - 1)) << 1 | 1; 
		  }*/
	} 

	
}
