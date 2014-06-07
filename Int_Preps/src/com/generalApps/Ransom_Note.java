package com.generalApps;

import java.util.HashMap;

public class Ransom_Note 
{

	public static void main(String[] args) 
	{
		/*HashMap<String,Integer> hp = new HashMap<String,Integer>();

		StringBuilder ss = new StringBuilder("hello");
		StringBuilder tt = new StringBuilder("hello");
		System.out.println(ss.hashCode());
		System.out.println(tt.hashCode());
		System.out.println(tt.equals(ss));
		
		ss=ss.append("world");
		
		System.out.println(ss.hashCode());
		
		String t ="world";
		String s="world";
		
		System.out.println(t.hashCode());
		System.out.println(s.hashCode());
		
		
		System.out.println(t.equals(s));
		
		int i=0;
		for(i=0;i<5;i++)
		{
			if(i==2)
			{
				i=3;
			}
			System.out.println(i);
		}
		*/
		
		String s ="TeJt";
		
		System.out.println((float)s.charAt(3));
		
		Ransom_Note c= new Ransom_Note();
		c.String_repl_emp();
		//c.cir_arr();
		//c.my_own();
		//c.isUniqueChars2("hello");
	}

	void rotate_arr_90()
	{
		int arr[][] = new int[3][3];
		int cntr=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<3;j++)
			{
				arr[i][j]=cntr;
			}
		}
		cntr=0;
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
		
			
		}
	
	String temp="hello";
	char val = temp.charAt(6);
	int val1 = temp.codePointAt(2);
	
	}
	
	public static boolean isUniqueChars2(String str) 
	{
		System.out.println("New");
		boolean[] char_set = new boolean[256]; 
		
		for (int i = 0; i < str.length(); i++) 
		{ 
			int val = str.charAt(i); 
			System.out.println(val);
			if (char_set[val]) return false; 
			char_set[val] = true;
			  } 
		  return true; 
		   } 
	
	public static boolean isUniqueChars(String str) 
	{  int checker = 0; 
	  for (int i = 0; i < str.length(); ++i)
	 { 
	   int val = str.charAt(i) - 'a'; 
	   if ((checker & (1 << val)) > 0) return false;
	   checker |= (1 << val);
	   } 
	  return true;
	}
	public void my_own()
	{
		//char *c=null;
		String s="ertyucp";
		int cntr=0;
		int t_cntr=0;
		boolean temp=true;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					temp = false;
				cntr++;
				t_cntr++;
			}
			System.out.println(t_cntr);
			t_cntr=0;
		}
		System.out.println(temp);
		System.out.println(cntr);
		
	}
	public static void removeDuplicates() 
	{ 
		char[] str=new char[]{'a','a','a'};
		if (str == null) return; 
	int len = str.length; 
	if (len < 2) return; 

	int tail = 1; 

	for (int i = 1; i < len; ++i) 
	{ 
	int j; 
	for (j = 0; j < tail; ++j) 
	{ 
	if (str[i] == str[j]) break; 

	} 
	if (j == tail) { 
	str[tail] = str[i]; 
	++tail;    } 
	} 
	str[tail] = 0; 
	System.out.println(str);
	}
	public static void rotate() 
	{ 
	
		int[][] matrix = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		int n=4;	
		System.out.println("first:"+ n / 2);   
	for (int layer = 0; layer < n / 2; ++layer) 
	{ 
	int first = layer; 
	
	int last = n - 1 - layer; 
	   for(int i = first; i < last; ++i) { 
	    int offset = i - first; 
	    int top = matrix[first][i]; 
	    // save top    
	    // left -> top  
	  matrix[first][i] = matrix[last-offset][first];   
	    // bottom -> left 
	    matrix[last-offset][first] = matrix[last][last - offset]; 
	   // right -> bottom 
	    matrix[last][last - offset] = matrix[i][last]; 
	    // top -> right 
	    matrix[i][last] = top; // right <- saved top 
	   } 
	  }  
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix.length;j++)
		{
			System.out.println(matrix[i][j]);
		}
		
	}
	
	}
	
	public void cir_arr()
	{
		//int[][] matrix = new int [][]{{1,2,3},{4,5,6},{7,8,9}}; 
		int[][] matrix = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		//int[][] matrix = new int [][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}; 
	int in_x , in_y , fn_x , fn_y ;
	int len = matrix.length-1;
	//int offset=0;	
	for(int offset = 0;offset<(matrix.length/2);offset++)
	{
		in_x=offset;
		in_y=offset;
		fn_x=len-offset;
		fn_y=len-offset;
		
		
	for(int i=in_x;i<=fn_y;i++)
		System.out.println(matrix[in_x][i]);
	in_x++;
	
	for(int i=in_x;i<=fn_x;i++)
		System.out.println(matrix[i][fn_x]);	
	fn_y--;
	for(int i=fn_y;i>=in_y;i--)
		System.out.println(matrix[fn_x][i]);	
	fn_x--;
	
	for(int i=fn_x;i>=in_x;i--)
		System.out.println(matrix[i][in_y]);	
	
	in_y++;
	
	if((in_x==fn_x) && (in_y==fn_y) && (matrix.length%2!=0))
	{
		System.out.println(matrix[in_x][in_y]);
	}
	
	}
	
	/*for(int i=in_y;i<=fn_y;i++)
		System.out.println(matrix[in_x][i]);
	*/
	/*in_x++;
	//System.out.println(fn_y);
	for(int i=fn_y;i>=in_y;i--)
		System.out.println(matrix[in_x][i]);*/
	
		
		
	}
	void String_repl_emp()
	{
		String s="hello";
		char[] c =s.toCharArray();
		System.out.println(c.length);
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				for(int j=i+1;j<c.length;j++)
				{
					//sb.charAt(j-1)=sb.charAt(j);
					
					/*char temp = c[j-1];
					 c[j-1]= c[j];
					 c[j]=temp;*/
					 
					 c[j-1] = (char) (c[j] + c[j-1]);
					 c[j] = (char) ( c[j-1] - c[j]);
					 c[j-1] = (char) ( c[j-1] - c[j]);
				}
				//c[c.length-1]='l';
			}
		
		}
		System.out.println(c.length);
		System.out.println(c);
		
	}
}
