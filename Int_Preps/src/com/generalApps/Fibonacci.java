package com.generalApps;

public class Fibonacci 
{
	int prev=0; int curr=1; int next=1;
	public static void main(String[] args) 
	{
		Fibonacci obj = new  Fibonacci();
		char c='!';
		System.out.println((int)c);
		
		//obj.merge_two_Arr(0,0,false,null);
		//obj.display();
		//obj.palind("ttut");
		//obj.fib();
//int prev, next, sum, n;
//prev=next=1;
/*for( n=1;n<=10;n++)
{
	System.out.println(prev);
	sum=prev+next;
	prev=next;
	next=sum;
}*/
	}

	void fib()
{
	
		System.out.println(prev);
	next=prev+curr;
	
	prev=curr;
	curr=next;
	
	while(next<25)
	{
		
		fib();
	}
	
	
	
}
	void palind(String s)
	{
		char c[]=s.toCharArray();
		int i = 0 ;
		int j = c.length-1;
		
		int cntr=0;
		//while((i!=j)  & (((i-j) != 1) || (i-j) != 0) )
		
		while((i-j !=0) & (i-j !=1))
		{
			/*System.out.println(i-j);
			System.out.println(((i-j) != 1));
			System.out.println((i!=j));*/
			
			
			
			
			if(c[i] != c[j])
				break;
			cntr++;
			i++;
			j--;
		}
			
		if(cntr==c.length/2)
			System.out.println("Planidrome");
		else
		{
			System.out.println("not  a Planidrome");
			System.out.println(cntr);
			System.out.println(c.length/2);
		}	
	}
	
	// QA Process, Testing methodologies, Test Strategy, Test Plan and hiring manager.
	int a[] = new int[]{4,7,8};
	int b[] = new int []{2,3,5};
	
	int cntr=0;
	int c[] = new int [a.length+b.length];
	enum temp {a,b};
	void merge_two_Arr(int i , int j , boolean flag , temp val )
	{
		
		if(flag)
		{
			System.out.println("inside flag");
			System.out.println(i + "  " + j);
			System.out.println(cntr);
			switch(val)
			{
			
				case b: for(int k=i ; k < a.length ;++k)
						{ 
					System.out.println("inside a length " + a.length);	
					System.out.println("inside a " + k + "  " + cntr);		
					c[cntr]=a[k];
							System.out.println("shankar a:"+c[cntr]);
							cntr++;
							System.out.println(cntr);
							
						System.out.println("inside a");
						};
						break;
				
				case a: for(int k=j ;k<b.length;k++)
						{ 
					System.out.println("inside aaaa");
							c[cntr]=b[k];
							System.out.println("shankar b:"+c[cntr]);
							cntr++;
							System.out.println(cntr);
							
							System.out.println("inside b");
						
						}	;
						break;
			}
		}
		System.out.println("last");
		if(a[i] > b[j]  && cntr <c.length )
		{
			c[cntr]=b[j];
			System.out.println("shankar :"+c[cntr]);
			j++;
			
			cntr++;
			System.out.println(cntr);
			
		/*	System.out.println(j);
			System.out.println(cntr);*/
		}
		else if (cntr < c.length )
		{
			c[cntr]=a[i];
			System.out.println("shankar :"+c[cntr]);
			
			i++;
			cntr++;
			
			System.out.println(cntr);
		/*	System.out.println(i);
			System.out.println(cntr);*/
		}
		
		
		if(cntr<c.length  )
		{
		
			if(i>a.length-1  )
			{
				flag=true;
				val=temp.a;
				i=a.length-1;
				
			}
			if(j>b.length-1)
			{
				
				flag=true;
				val=temp.b;
				j=b.length-1;
			}
			merge_two_Arr( i ,  j , flag , val);
		}
	}
	void display()
	{
		for(int i=0;i<c.length;i++)
			System.out.print(c[i] + "  ");
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

