package com.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercises 
{
	int cntr=0;
	static int flm_cnt=0;
	public static void main(String[] args) 
	{
		Exercises obj = new Exercises();
		//flm_cnt = obj.flames_disnt_cnt("ajithkumar", "shalini");
		flm_cnt = obj.flames_disnt_cnt("xxx", "yyy");
		System.out.println(flm_cnt);
		
		char[] flm={'F','L','A','M','E','S'};
		obj.flames_relation(flm, flm_cnt, 0, flm.length-1);
		
		//obj.flames("ajithkumar", "shalini");
		
		//obj.reverse_string("This is Shankar");
		//int[] arr = {45,67,89,22,43,89,45,21,22,69,43};
		//obj.k_max_in_n(arr, 4 , false , arr.length);
		
		//obj.stars_pyramid(1, 3);
		//Scanner st = new Scanner(System.in);
		//int n = st.nextInt();
		
	}


	public void stars_pyramid(int n , int level)
	{
		System.out.println();
		for(int i=1;i<=level;i++)
		{
			System.out.print("\t");
			
		}
		System.out.print("*");
		if(n>1)
		{
			for(int i=1;i<n;i++)
			{
				System.out.print("\t");
				System.out.print("*");
				
			}
		}
		
		--level;
		
		if(level==0)
		{
			System.out.println();
			System.out.println("Operation done");
		}
		else
			stars_pyramid(n+2,level);
		
		
	}
	
	//boolean flag = false;
	public void k_max_in_n(int[] arr , int k , boolean flag , int len)
	{
		int temp=0;
		
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] < arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted array is ");
		for(int a : arr)
			System.out.print("\t"+a);
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
					flag=true;
					temp=arr[len-1];
					arr[len-1]=arr[j];
					arr[j]=temp;
				}
				else
					flag=false;
				if(flag)
					break;
			}
			if(flag)
				break;
		}
		if(!flag)
		System.out.println("\n"+k+" th Max value is " + arr[k-1]);
		else 
			k_max_in_n(arr ,  k , flag , --len);
			
	}
	public void palindrome(String text)
	{
		char c [] = text.toCharArray();
		int init_point=0 , end_point=c.length-1;
		
		while(init_point<=end_point)
		{
			if(c[init_point]!=c[end_point])
				break;
			init_point++;
			end_point--;
		}
		if(init_point>=end_point)
			System.out.println("It's a Palindrome");
		else
			System.out.println("Not a palindrome");
	
	}
	public void reverse_string(String text)
	{
		char c [] = text.toCharArray();
		int init_point=0 , end_point=c.length-1;
		
		while(init_point<=end_point)
		{
			char temp=c[init_point];
			c[init_point]=c[end_point];
			c[end_point]=temp;
			init_point++;
			end_point--;
		}
		for(char s : c)
			System.out.print(s);
	}
	
	public int flames_disnt_cnt(String name1 , String name2)
	{
		System.out.println(name1);
		char n1 [] = name1.toLowerCase().toCharArray();
		char n2 [] = name2.toLowerCase().toCharArray();
		boolean flag =false;
		int rep_c_cnt=0;
		for(int i =0 ; i<n1.length;i++)
		{
			
			for(int j=0 ; j<n2.length;j++)
			{
				if(n1[i]==n2[j])
				{	
					rep_c_cnt++;
					break;
				
				}
				
			}
		
		}
		flm_cnt=n1.length + n2.length - 2 - rep_c_cnt;
		return flm_cnt;
	}
	public char[] flames_arr_reorder(char c[],int index , int len)
	{
		int i = index;
		for(int j=i+1;j<=len;j++)
		{
			char temp=c[j];
			c[j] = c[j-1];
			c[j-1]=temp;
		}
			
		for(char d: c)
			System.out.print(d);
		return c;
	}
	
	public void flames_relation(char c[],int count , int index , int len)
	{
		int cntr = 0;
		int temp=0;
		while(cntr < count)
		{
			if(index >= len)
				index = -1;
			
			index++;
			cntr++;
			if(cntr==10)
				temp=index;
		}
		System.out.println();
		System.out.println("index value :"+index);
		System.out.println("count value :"+count);
		System.out.println("temp  value :"+temp);
		c=flames_arr_reorder(c,temp,len);
		System.out.println();
		len--;
		if(len==0)
			System.out.println("done");
		else
			flames_relation( c, count ,  index ,  len);
	}
	public void flames(String name1 , String name2 )
	{
		char n1 [] = name1.toLowerCase().toCharArray();
		char n2 [] = name2.toLowerCase().toCharArray();
		boolean flag =false;
		int rep_c_cnt=0;
		for(int i =0 ; i<n1.length;i++)
		{
			
			for(int j=0 ; j<n2.length;j++)
			{
				if(n1[i]==n2[j])
				{	
					rep_c_cnt++;
					break;
				
				}
				
			}
		
		}
		int flm_cnt=n1.length + n2.length - 2 - rep_c_cnt;
		System.out.println("flames counter "+flm_cnt);
		HashMap<Character,String> flames = new HashMap<Character,String>();
		flames.put('F', "FRIEND");
		flames.put('L', "LOVE");
		flames.put('A', "AFFECTION");
		flames.put('M', "MARRIAGE");
		flames.put('E', "ENEMY");
		flames.put('S', "SISTER");
		
		char[] flm={'F','L','A','M','E','S'};
		System.out.println(flm.length);
		int index =0;
		int prev_index=0;
		for(int i=0 ; i< flm.length-1;i++)
		{
			int cntr = 0;
			
		int pos=0;	
			//int index =0;
		while(cntr<flm_cnt)
		{
			
			if(index==prev_index && cntr!=0)
			{	
				index=index+i;
				//cntr--;
			}
			
			
			
			index ++;
			
			if(index>flm.length)
				index=0;
			
			
			
			cntr++;
			
			
		}
		prev_index=index;
		if(index==0)
			pos=flm.length-1;
		else
			pos=index-1;
		
		 System.out.println("Index :"+ (index));
			System.out.println("previous Index :"+ (prev_index));
		if(flames.size()!=1)
		flames.remove(flm[pos]);
		System.out.println("flames size: "+flames.size());
		}
		System.out.println(flames.size());
		if(flames.size()==1)
		{
		for(Map.Entry<Character, String> m : flames.entrySet())
		{
			System.out.println("Relationship between "+name1+"  and "+name2+" is "+m.getValue());
		}
		}
		else
			System.out.println("Flames not executed properly");
	}
}