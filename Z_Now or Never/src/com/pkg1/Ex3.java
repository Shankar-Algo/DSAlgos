package com.pkg1;

// Given a 2D array which as "W","D", null values write an algo to insert shortest distance from the cell which has null value to the cell which as "D" value. 
// Note once W is reached we cannot move further in that direction 


// Not a correct solution let me try with ex4
public class Ex3 {

	public static void main(String[] args) 
	{
		Ex3 obj = new Ex3();
		//String a[][] =new String[][]{{null,"D",null},{"W",null,"W"},{null,"D",null}}; 
		
		String a[][] =new String[][]{{null,"W",null},{null,"D",null},{null,"W",null}};
		String [] m = obj.d_1_row_maj_con(a);
		for(String s : m)
			System.out.println(s);
		String[] fin_arr = obj.compute_short(m);
		for(String s : fin_arr)
			System.out.println(s);
		
	}

	String[] d_1_row_maj_con(String a[][])
	{
		
		int size=a.length*a[0].length;
	
		String a_1_d[] = new String [size];
		
		size=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a_1_d[size]=a[i][j];
				size++;
			}
		}
		
		
		return a_1_d;
	}
	
	String[] compute_short(String [] m)
	{
		
		
		int cntr=0;
		for(int i=0;i<m.length;i++)
		{
			int k=0,j=0;
			int val=0;
			boolean flag_D_k = false;
			boolean flag_D_j = false;
			boolean flag_w_k=false;
			boolean flag_w_j=false;
			
			if(m[i]==null)
			{
				k=j=i;
				System.out.println("I value :"+i);
				int off =0;
				while(k>=0 && j <=m.length-1)
				{
						
					int k_prev=0;
					if(m[k]=="W")
					{
						flag_w_k=true;
						k_prev=k;
						
						
					}
					
					
					if(i==0 || i>=m.length-2)
					{
						if(i==0)
						{
							k=0;
							j=j+1;
							
						}
						if(i==m.length-1)
						{
							j=i;
							k=k-1;
							
						}
						if(i==m.length-2)
						{
							j=i+1;
							k=k-1;
							
						}
					}
					else 
					{
						k=k-1;
						j=j+1;
						
						 
					}
				
					if(flag_w_k)
					{
						k=k_prev;
					}
				
					System.out.println("k value : "+k);
					System.out.println("J value : "+j);
					
					if(m[k]=="D")
					{
						flag_D_k=true;
						val = i-k;
						break;
					}
					else if(m[j]=="D")
					{
						flag_D_j=true;
						val = j-i-off;
						break;
					}
					
					
					
					
					 if(m[j]=="W")
					{	
						System.out.println("Invoking at :"+i);
						 flag_w_j=true;
						
						off = (j)%3;
						j = j+off;
					
					}
					 else if(m[k]=="W")
					 {
						 flag_w_k=true;
						 //off = 
					 }
					//System.out.println("Off : "+off);
					/*if((!flag_D_k || !flag_D_j) && flag_w_k && flag_w_j )
					{
						System.out.println("Incorrect declaration");
						break;
					}*/
					
				}
				
				
				
			}
			if(flag_D_k || flag_D_j)
				m[i]=""+val;
		
		}
		
		return m;
	}
	
	
	
}
