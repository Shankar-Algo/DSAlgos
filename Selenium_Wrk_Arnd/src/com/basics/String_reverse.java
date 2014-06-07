package com.basics;

public class String_reverse {

	public static void main(String[] args) 
	{
		String_reverse obj =new String_reverse();
		//obj.reverse("Hi i am shankar");
		obj.bst(45);
		
//System.out.println(Math.exp(2));
//System.out.println(Math.pow(2, 3));
	}

	void bst(int element)
	{
		int arr[] ={30,15,43,10,20,35,48,5,12,18,22,32,38,45,49};
		
		int len = arr.length;
		int level = (int)(Math.log(len) / Math.log(2)) ;
		//System.out.println(level);
		//level++;
		int i=0;
		int startpos=0;
		int l_temp=0;int r_temp=0;
		while(i<level)
		{
			int root = arr[startpos];
			
			System.out.println("current start pos :"+startpos);
			if(element==root)
				break;
			else if(element > root)
			{
				
				if(l_temp>=1)
					startpos = startpos + (int)Math.pow(2, i+1) - 1;
				else
				startpos = startpos + (int)Math.pow(2, i+1) ;
				
				
				r_temp++;
				
				
				
			}
			else if(element < root)
			{
				if(r_temp>=1)
					startpos = startpos + (int)Math.pow(2, i) + 1;
				else
				startpos = startpos + (int)Math.pow(2, i)  ;
				
				l_temp++;
			}
		
			i++;
		}
		System.out.println("element found at :"+(startpos));
		
	}
	
	void reverse(String text)
	{
		char c[] = text.toCharArray();
		System.out.println(c);
		int index[] = new int[c.length];
		int cnt=0;
		for(int i =0 ; i< c.length;i++)
		{
			if(c[i]==' ')
			{
				index[i]=1;
				cnt++;
			}
		}
		int previous_index=c.length-1;
		while(cnt!=-1)
		{
			int index_str =max_index (index,cnt);
			for(int i =index_str ; i<= previous_index ;i++)
				System.out.print(c[i]);
			System.out.print(" ");
			previous_index=index_str;
			cnt--;
		}
		
	}
	int max_index(int index[],int cnt)
	{
		
		int index_no=0;
		for(int i = 0 ; i< index.length ;i++)
		{
			if(index[i]==1)
			{	
				cnt--;
				index_no=i;
			}
			if(cnt==0)
				break;
		}
		
		return index_no;
	}
}
