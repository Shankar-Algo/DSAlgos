package com.pkg2;

import java.util.*;

public class Rank_Display
{

public static void main(String args[])
{
Rank_Display obj = new Rank_Display();
obj.init();


}
int a[] = new int [5];
public void init()
{
Scanner inp = new Scanner(System.in);
for(int i =0 ; i < a.length ; i++)
{
a[i] =  inp.nextInt();
}
this.cal_rank(5);
}
int b[] =new int [a.length];
public void cal_rank(int n)
{
for(int i = 0 ; i < b.length ; i++)
{
b[i] = a[i] % 5;
}
this.do_op();
}
void do_op()
{
int temp=0;
for(int i = 0 ; i < b.length ; i++)
{
for(int j = i+1 ;j < b.length ; j++ )
{
if(b[i] >= b[j])
{
	if(b[i] == b[j])
	{
		if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
	}
	else
	{
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
	}
}

}
}

for(int i = 0 ; i < a.length ; i++)
{
System.out.println(a[i]);
}


}


}