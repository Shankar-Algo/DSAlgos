package com.pkg2;

public class Revise_sort 
{

	public static void main(String[] args) 
	{
		Revise_sort obj = new Revise_sort();
		obj.init();

	}
	
	int a[] = {6,5,3,1,8,7,2,4};
	//int a[] = {7,6,3,2,3};
	void init()
	{
		/*this.merge_Sort_no_buffer(0,a.length-1);
		this.display();*/
		display();
		this.bubble_Sort(a);
	}
	 void merge_Sort_no_buffer( int min, int max) 
	 {
		if(min < max)
		{
			int med = (min + max) / 2;
			merge_Sort_no_buffer(min,med);
			merge_Sort_no_buffer(med+1,max);
			merge_no_buffer(min,med,max);
		}
		
	}
	 void display()
	 {
		System.out.println();
		 for(int c : a)
			 System.out.print(c+"  ");
	 System.out.println();
	 }
	 void merge_no_buffer( int min , int med , int max)
	 {
		 int i ;
		 int j = min ;
		 int k = med+1;
		System.out.print ("Min : "+ min + "  Med "+med + "  Max  "+max +"   ");
		 for(i = min ; j <= med && k <= max ; i++)
		 {
			 if(a[j] > a[k])
			 {
				 int temp = a[k];
				 for(int m = k ; m > j ; m--)
				 {
					 a[m] = a[m-1];
				 }
				 a[j]=temp;
				 k++;
			 }
			 else
			 {
				 j++;
			 }
		 }
		 for(int c : a)
			 System.out.print(c+"  ");
		 System.out.println();
	 }
	 

	 void bubble_Sort(int a[])
	 {
		 boolean flag = false;
		 for(int i = 0 ; i < a.length-1 ; i ++)
		 {
			 if(a[i] > a[i+1])
			 {
				 int temp = a[i];
				 a[i] = a[i+1];
				 a[i+1] = temp;
				 flag = true;
			 }
		 }
		 for(int c : a)
			 System.out.print(c+"  ");
		 System.out.println();
		 if(flag)
			 bubble_Sort(a);
		 else
		 {
			 for(int c : a)
				 System.out.print("  "); 
		 }
	 }
}
