package com.pkg2;



public class Merge_Sort
{
	//int a[] = new int [] {35,25,4,65,34,64};
	int a[] = new int [] {35,25,10,11,15,14,22,62,17};
	
	//int temp[] = new int[a.length];
	public static void main(String[] args) 
	{
		
		Merge_Sort ms = new Merge_Sort();
	//	ms.init();
		ms.start();
		ms.display();
		
		
		
	}
	
	/*public void init()
	{
		for(int i =0 ;i < a.length;i++)
		{
			temp[i]=a[i];
		}
	}*/
	
	void start()
	{
		/*int k = 1;
		a[k--] = 99;
		System.out.println(a[0]);
		System.out.println(a[1]);*/
		//this.sort_parse(a, 0, a.length-1);
	}
	
	public void sort_parse(int arr[] , int min , int max)
	{
		int med;
		
		if(max>min)
		{
			
			
			
			med = (min + max)/2;
			//System.out.println("parse : "+min+","+med+","+max);
			sort_parse(arr,min,med);
			sort_parse(arr,med+1,max);
			merge(arr,min,med,max);
			
		}
	}
	
	public void merge(int a[],int min,int med,int max)
	{
		
		int i , j , k;
		j=min;
		k=med+1;
		
		//System.out.println("merge : "+min+","+med+","+max);
		
			
		for(i=min ; j<=med & k<=max ; i++)
		{
			
			
			if(a[i]>a[k])
			{
				
				
				int temp = a[i];
				a[i] = a[k];
				a[k] =temp;
				j++;
				
				for(int c = k+1 ; c <= max ; c++)
				{
					if(a[c-1]>a[c])
					{
						 	temp = a[c-1];
							a[c-1] = a[c];
							a[c] =temp;
					}
					else
						break;
				}
				
				
				
			}
			else
			{
			
				if(j>0)
				k = k - (j-i);
						
			}
				
			
			/*System.out.println("j value : "+j);
			System.out.println("med value : "+med);
			System.out.println("max  value : "+max);*/
			
		}
		display();
		/*if(j>med)
		{
			for(k=k;k<=max;k++)
			{
				a[i]=a[k];
				i++;
			}
		}
		else
		{
			for(j=j;j<=med;j++)
			{
				
				a[i]=a[j];
				i++;
			}
		}*/
		
		/*for(int cnt=0;cnt<a.length;cnt++)
			a[cnt]=temp[cnt];*/
		
		
		/*for(int print : temp)
			System.out.println(print);*/
		
	}
	void display()
	{
		for(int print : a)
		System.out.print(print + "  ");
		System.out.println();
		
	}
	

}
