package com.pkg1;


//complete array solutions one by one

/*Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer 
NOTE: One or two additional variables are fine   An extra copy of the array is not  */

public class Ex8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ex8 obj = new Ex8();
		/*int check = 1;
		System.out.println(1 << 2);
		if((check & (1 << 2)) > 0)
			System.out.println("print");*/
		
		obj.init();
	}

	void init()
	{
		//this.dup_charcs("malbyblam");
		//System.out.println(this.isUniqueChars("bch"));
	//	System.out.println(this.Repl_Repeat_char("malayalam"));
		//System.out.println((char)33);
	
	//System.out.println(this.check_anag("accb", "bcca"));
	
	//this.repl_empty_char(" a s d f ");
		this.check_rot_substring("test","test");
	
	}
	
	//reverse a string and find it is palindrome or not
	void dup_charcs(String word)
	{
		char[] check = word.toCharArray();
		
		for(int i = 0 ; i<= check.length/2 ; i++)
		{
			char temp = check[i];
			check[i]= check[check.length - 1 - i];
			check[check.length - 1 - i] = temp;
			
		}
		boolean flag = false;
		for(int i = 0 ; i< check.length ; i++)
		{
			flag = false;
			if(check[i]!=word.charAt(i))
				break;
			flag = true;
			
		}
		if(flag)
			System.out.println("Palindrome string");
	}
	
	//Implement an algorithm to determine if a string has all unique characters  What if you can not use additional data structures
	 public static boolean isUniqueChars(String str) 
	 {   
		 int checker = 0; 
		 System.out.println();
	   for (int i = 0; i < str.length(); ++i) 
	 { 
		   int val = str.charAt(i) - 'a'; 
		   System.out.println("val : "+ (1 << val));
		   System.out.println("Checker : "+checker);
		

		   /* if ((checker & ( val)) > 0)
			 return false; 
		    checker |= ( val);*/
		   
		   
	    if ((checker & (1 << val)) > 0)
		return false; 
	    checker |= (1 << val); 
	   } 
	   return true; 
	  } 
	 public static char[] Repl_Repeat_char(String str) 
	 {   
		 int checker = 0; 
		 int repeat_index='a';
		 char check[] = str.toCharArray();
	   for (int i = 0; i < check.length; ++i) 
	 { 
		   int val = check[i] ; 
		  /* System.out.println("val : "+ (1 << val));
		   System.out.println("Checker : "+checker);
*/		

		   /* if ((checker & ( val)) > 0)
			 return false; 
		    checker |= ( val);*/
		   
		   
	    if ((checker & (1 << val)) > 0)
	    {
	    	check[i]=(char)repeat_index;
	    	repeat_index++;
	    	i=i-1;
	    	
	    }
	    checker |= (1 << val); 
	   } 
	   
	   return check; 
	  } 
	 
	 // check anagrams90
	 public boolean check_anag(String s1 , String s2)
	 {
		 if(s1.length() != s2.length())
			 return false;
		 int buff[] = new int[256];
		 for(int i =0 ; i < s1.length() ; i++)
		 {
			++buff[s1.charAt(i)];
		 }
		 for(int i = 0 ; i < s2.length();i++)
		 {
			 if(buff[s2.charAt(i)]==0)
				 return false;
			 --buff[s2.charAt(i)];
		 }
		 return true;
	 }
	 //Write a method to replace all spaces in a string with ‘%20’ 
	 public void repl_empty_char(String s1)
	 {
		 int emp_cnt=0;
		 for(int i =0 ; i < s1.length();i++)
		 {
			 if(s1.charAt(i)==' ')
				 emp_cnt++;
		 }
		 int len = s1.length() + (emp_cnt*2);
		 char c[] = new char[len];
		 for(int i = 0; i < s1.length();i++)
			 c[i] = s1.charAt(i);
		 for(char t : c)
			 System.out.print(t);
		 for(int i = 0 ; i < c.length ; i++)
		 {
			
			 if(c[i]==' ')
			 {
				 for(int j = c.length-1 ; j > i ; j--)
				 {
					 c[j] = c[j-1];
				 }
				 for(int j = c.length-1 ; j > i ; j--)
				 {
					 c[j] = c[j-1];
				 }
				 c[i]='%';
				 c[i+1]='2';
				 c[i+2]='0';
			 }
			
		 }
		 for(char t : c)
			 System.out.print(t);
	 
	 }
	 //Assume you have a method isSubstring which checks if one word is a substring of another  
	 //Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only 
	 //one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”) 
	 
	 public void check_rot_substring(String s1, String s2)
	 {
		 char c[] = s1.toCharArray();
		 
		
		 for(int i = 0 ; i < s1.length() ; i++)
		 {
			 char d = c[0];
		//	System.out.println(s1);
			 if(s1.equalsIgnoreCase(s2))
			 {
				 System.out.println("String rotated for : "+i+"  times");
				 break;
			 }
			 
			 for(int j = 0 ; j < c.length-1 ; j++ )
				 c[j]=c[j+1];
			 c[c.length-1]=d;
			 s1="";
			 for(char t:c)
				s1=s1+t;
			 
		 }
	 }
	 
}
