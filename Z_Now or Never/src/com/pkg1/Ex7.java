package com.pkg1;

//Merge sort


public class Ex7 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[]{25,45,10,55,6};
		 int i,size;
		 size=arr.length;
		 
		 Ex7 obj = new Ex7();
		 obj.part(arr,0,size-1);
		
		 
		 for(i=0; i<size; i++)
			 System.out.println(arr[i]);
		
		 System.out.println("cntr : "+cnt);
		 
		}


		void part(int arr[],int min,int max)
		{
		 int mid;
		 if(min<max)
		 {
		   mid=(min+max)/2;
		   
		   part(arr,min,mid);
		   part(arr,mid+1,max);
		   System.out.println("Min : "+min);
		   System.out.println("max : "+max);
		   System.out.println("mid : "+mid);
		   merge(arr,min,mid,max);
		 }
		}

		static int cnt=0;

		void merge(int arr[],int min,int mid,int max)
		{
			cnt++;
		  int tmp[] =new int[arr.length];
		  int i,j,k,m; 
		  j=min;
		  m=mid+1;
		  for(i=min; j<=mid && m<=max ; i++)
		  {
		     if(arr[j]<=arr[m])
		     {
		         tmp[i]=arr[j];
		         j++;
		     }
		     else
		     {
		         tmp[i]=arr[m];
		         m++;
		     }
		  }
		  if(j>mid)
		  {
		     for(k=m; k<=max; k++)
		     {
		         tmp[i]=arr[k];
		         i++;
		     }
		  }
		  else
		  {
		     for(k=j; k<=mid; k++)
		     {
		        tmp[i]=arr[k];
		        i++;
		     }
		  }
		  for(k=min; k<=max; k++)
		     arr[k]=tmp[k];
		}

	}


