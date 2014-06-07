package com.basics;

public class Inh_check {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Han_Excp obj = new Han_Excp();
		obj.val_pu=7;
		obj.val_p=9;
		obj.val_d=8;
	
		String s ="abc";
		String d ="cba";
		
		char c[]=s.toCharArray();
		char b[]=d.toCharArray();
		
		int decode=0;
		
		for(int i=0;i<c.length;i++)
			decode=decode+c[i];
		
		for(int i=0;i<b.length;i++)
			decode=decode-b[i];
		
	
	if(decode==0)
		System.out.println("Anagrams");
	else
		System.out.println("Not Anagrams");
	
	
	
	}

}
