package com.basics.scjp.learn;

public class Array_Spiral {

	public static void main(String[] args) 
	{
	
		int r_size=3;
		int c_size=3;
		int arr[][]=new int[r_size][c_size];
		int k=0;
		for(int i=0;i<r_size;i++)
		{
			for(int j=0;j<c_size;j++)
				arr[i][j]=++k;
		}
	/*	for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.println(arr[i][j]);
		}
		for(int i=2;i>=0;i--)
		{
			for(int j=2;j>=0;j--)
				System.out.println(arr[i][j]);
		}*/
		for(int i=0;i<r_size;i++)
		{
			for(int j=0;j<c_size;j++)
				System.out.println(arr[i][j]);
		}
		int xsize=r_size-1;
		int ysize=c_size-1;
		int temp_r=0;int temp_c=0;int count=0;
		while(k>0)
		{
			for(int i=0;i<=ysize;i++)
			{
				System.out.print(arr[temp_r][i]);
				k--;
			}
			temp_r++;
			
			for(int i=temp_r;i<=xsize;i++)
			{
				System.out.print(arr[i][ysize]);
				k--;
			}
			ysize--;
			for(int i=ysize;i>=temp_c;i--)
			{
				System.out.print(arr[xsize][i]);
				k--;
			}
			xsize--;
		
			for(int i=xsize;i>=temp_r;i--)
			{
				System.out.print(arr[i][temp_c]);
				k--;
			}
			temp_c++;
			for(int i=temp_c;i<ysize;i++)
			{
				System.out.print(arr[i][temp_c]);
				k--;
			}
		}
		
		
		
		
		
		/*while(count>xsize)
		{
			for(int i=0;i<=ysize;i++)
			{
				System.out.print(arr[temp_r][i]);
				k--;
			}
			temp_r++;
			count++;
			for(int i=temp_r;i<=xsize;i++)
			{
				System.out.print(arr[i][ysize]);
				k--;
			}
			ysize--;
			for(int i=ysize;i>=temp_c;i--)
			{
				System.out.print(arr[xsize][i]);
				k--;
			}
			xsize--;
			count++;
			for(int i=xsize;i>=temp_r;i--)
			{
				System.out.print(arr[i][temp_c]);
				k--;
			}
			temp_c++;
			for(int i=temp_c;i<ysize;i++)
			{
				System.out.print(arr[i][temp_c]);
				k--;
			}
			xsize--;
		
			
		
		}*/
		
		
		

	}

}
