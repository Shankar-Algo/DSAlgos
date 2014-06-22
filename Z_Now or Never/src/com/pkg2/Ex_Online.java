package com.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_Online 
{

	public static void main(String[] args) 
	{
		Ex_Online obj = new Ex_Online();
		obj.init();

	}

	void init()
	{
		Scanner sys = new Scanner(System.in);
		
		int actual = sys.nextInt();
		
		
		this.print_split(actual);
	}

	void print_split(int actual)
	{
		/*int no = this.get10value(actual);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(actual > 10)
		{
			int tmp = actual / no;
			list.add(tmp*no);
			actual = actual % no;
			no = no / 10 ;
			
		}
		
		for(int t :list)
		{
			System.out.print(t+"+");
		}
		System.out.println(actual);*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int no1 = 0;
		int prev = 0;
		int cntr = 1;
		while(no1 != actual)
		{
			no1 = actual % ((int)Math.pow(10, cntr));
			list.add(no1-prev);
			prev=no1;
			cntr++;
		}
		
		for(int i = list.size()-1 ; i >= 0 ; i--)
			System.out.print(list.get(i)+"+");
		
	}
	int get10value(int  n)
	{
		int init = 10;
		
		
		while(n > 10)
		{
			init = init *10;
			n = n % 10;
		}
		
		return init;
		
	}
	
}


