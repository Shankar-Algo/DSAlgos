package com.pkg1;

//Function which takes Array of nos and a  no we have to find the closest match between an element in a no which is prime and the  no in the second arg 

public class Ex1 {

	public static void main(String[] args)
	{
		int a[] = new int[]{12,13,11,17};

		int no = 14;
		
		Ex1 obj = new Ex1();
		
		obj.close_match(a, no);
		
		
	}
	
	void close_match(int a[] , int no)
	{
		//int diff[] = new int [a.length];
		 int diff =  0;
		 int old_diff = 0;
		 int index =-1;
		 boolean flag = false;
		 for(int i=0;i<a.length;i++)
		 {
			 flag = this.is_prime(a[i]);
			 if(flag)
			 {
				 if(index!=-1)
				 {
					 diff = this.diff(a[i], no);
					 if(old_diff > diff)
					 {	 
						 old_diff =diff;
						 index = i;
					 }
				 }
				 else
				 {
					old_diff = this.diff(a[i], no);
					//diff = old_diff;
					index=i;
				 }
					
			 }
		 }
		
		 if(index!=-1)
			 System.out.println("Closest match is : "+a[index] + " & with difference as : " +old_diff);
		 
	}

	int diff (int a , int b)
	{
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	
	boolean is_prime(int no)
	{
		for(int i=2 ; i<no/2 ; i++ )
		{
			if(no%i==0)
				return false;
		}
		
		return true;
	}
	
}
