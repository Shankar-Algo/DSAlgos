package com.pkg1;

import java.util.ArrayList;


//Given a 2D array which as "W","D", null values write an algo to insert shortest distance from the cell which has null value to the cell which as "D" value. 
//Note once W is reached we cannot move further in that direction 

public class Ex4 
{

	int x_init=3;
	int y_init=3;
	String net_layout [][]= new String [][]{{null,null,"D"},{null,null,null},{null,null,null}};
	boolean [][] w_flag=new boolean[][]{{false,true,false},{false,false,false},{false,false,false}};
	public static void main(String[] args) 
	{
	
		Ex4 obj = new Ex4();
		obj.short_path_calc();
		obj.print();
		//String[] check=new String[]{"0:0","1:1","2:1"};
		//String[] nex_pos = obj.next_pos(check);
		//String s ="0:0";
		//String[] temp = s.split(":");
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");*/
		
		
		//for(String ss : nex_pos)
		//	System.out.println(ss);

	}

	public void print()
	{
		for(int i =0 ;i<x_init ;i++)
		{
			
			for(int j=0;j<y_init;j++)
			{
				System.out.println(net_layout[i][j]);
			}
		}
	}
	
	public void short_path_calc()
	{
		
		for(int i =0 ;i<x_init ;i++)
		{
			
			for(int j=0;j<y_init;j++)
			{
				boolean flag =false;
				if(net_layout[i][j]==null)
				{
					String[] pos = new String[]{i+":"+j};
					 int act_len=9;
					 int curr_len=0;
					while(!flag)
					{
					
						
							
						 pos = this.next_pos(pos);
						 boolean temp_flag=false;
						 int k=0;
						
						 curr_len++;
						for(String ind_pos : pos)
						{
							
							k++;
							int[] int_pos = this.ret_int_pos(ind_pos);
							
							
							if(net_layout[int_pos[0]][int_pos[1]]=="D")
							{
									if(curr_len<act_len )
										act_len=curr_len;
									flag=true;
								
							}
							
							
							/*if(i==0 && j==1)
							{
								System.out.println(ind_pos +"  :"+curr_len);
							}*/
						
						}
						
					}
					
					net_layout[i][j]=""+act_len;
				}
				
				
			}
		}
	}
	
	
	public String[] next_pos(String []a)
	{
		ArrayList<String> list = new ArrayList<String>();
		//String[] poss_pos = new String[x_init*y_init];
		//int k =0;
		for(String s : a)
		{
			String[] temp = s.split(":");
			 int i = Integer.parseInt(temp[0]);
			 int j = Integer.parseInt(temp[1]);
			 //poss_pos[i]=j+"+"+k;
			 if(i+1<x_init)
			 {
				 String pos = (i+1)+":"+j;
				if(!list.contains(pos) && !w_flag[i+1][j])
					list.add(pos);
				// poss_pos[k]=pos;
				// k++; 
			 }
			if(j+1<y_init)
			{
				//poss_pos[k]=i+""+(j+1);
				//k++;
				String pos = i+":"+(j+1);
				if(!list.contains(pos) && !w_flag[i][j+1])
					list.add(pos);
			}
			if(i-1>=0)
			{
				String pos = (i-1)+":"+j;
				if(!list.contains(pos) && !w_flag[i-1][j])
					list.add(pos);
			}
			if(j-1>=0)
			{
				String pos = i+":"+(j-1);
				if(!list.contains(pos) && !w_flag[i][j-1])
					list.add(pos);
			}
			
		}
		
		String[] poss_pos = new String[list.size()];
		int k =-1;
		for(String add : list)
			poss_pos[++k]=add;
		
		
		
		return poss_pos;
		
	}
	public int[] ret_int_pos(String s)
	{
		int a[] = new int[2];
		String[] temp = s.split(":");
		 a[0] = Integer.parseInt(temp[0]);
		 a[1] = Integer.parseInt(temp[1]);
		return a;
		
	}
	
}
