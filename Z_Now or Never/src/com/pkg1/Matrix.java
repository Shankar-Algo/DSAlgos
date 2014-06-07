package com.pkg1;

public class Matrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Matrix obj = new Matrix();
		obj.init();
	}

	public void init()
	{
		this.rotate_90();
	}
	
	
	//Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	//write a method to rotate the image by 90 degrees  Can you do this in place? 

	public void rotate_90()
	{
		int a[][] = new int [][]{{0,1,2},{3,4,5},{6,7,8}};
		int n = a.length;
		int layer = n/ 2;
		
		System.out.println("layer : "+layer);
		//System.out.println("layer : "+layer);
		for(int i =0 ; i < layer ; i++)
		{
			int first = i ;
			int last = n - 1 -i;
			for(int j=first; j < last ; j++)
			{
				int top = a[first][j];
				
				a[first][j] = a[last-j][first];
				
				a[last-j][first] = a[last][last-j];
				
				a[last][last-j] = a[j][last];
				
				a[j][last] = top;
				for(int k = 0 ; k < n ; k++)
				{
					for(int l =0; l < n;l++)
					{
						System.out.println(a[k][l]);
					}
				}
				System.out.println("----");
				
			}
			
		
		}
		
	}
	
	public void print_arr_circ()
	{
		int a[][] = new int [][]{{0,1,2},{3,4,5},{6,7,8},{9,10,11}};
		int n = a.length;
		int layer = n/ 2;
		if(n%2!=0)
			layer++;
		System.out.println("layer : "+layer);
		//System.out.println("layer : "+layer);
		for(int i =0 ; i < layer ; i++)
		{
			int first = i;
			int last = n-1-i;
			int y_first = i;
			int y_last = a[i].length - 1- i;
			System.out.println("layer : "+i);
			for(int k = y_first ; k <=y_last ; k++)
				System.out.println(a[first][k]);
			first++;
			System.out.println();
			for(int k = first ; k <= last ; k++)
				System.out.println(a[k][y_last]);
			/*int diff = (y_last-y_first);
			-- y_last;
			y_last = y_last - diff;*/
			--y_last;
			System.out.println();
			for(int k = y_last ; k >= (y_first+i) ; k--)
				System.out.println(a[last][k]);
			last--;
			System.out.println();
			for(int k = last ; k >= (first+i) ; k--)
				System.out.println(a[k][y_first]);
		}
		
	}

}
