package com.selenium.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Learn_Array_of_Objects 
{
	String [] s  ;
	List<String[]> as;
	String temp;
	int [] a;
	void single_Array_int()
	{
		
		try
		{
			File f = new File("src/com/selenium/learn/details.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			if(f.length()==0)
				System.out.println("File Empty");
			else
			{
				int i=0;
			while(( temp= br.readLine())!=null)
			{
				
				a[i]=Integer.parseInt(temp);				
				
			}	
			
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	
	}
	
	void single_Array_String()
	{
		int [] a1  ={1,2,3,4,5};
		Integer [] a2 = {};
		as = new ArrayList<String[]>();
		;
		try
		{
			File f = new File("src/com/selenium/learn/details.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			if(f.length()==0)
				System.out.println("File Empty");
			else
			{
				int i=0;
			while(( temp= br.readLine())!=null)
			{
				s=new String[]{temp};
				as.add(s);
			}	
			
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
	
		Iterator<String[]> it = as.iterator();
		while(it.hasNext())
		{
			for(String disp : it.next())
			{
				System.out.println(disp);
			}
		}
		
		
	}
	
	Integer[][] init;
	List<Integer[][]> as1;
	void double_array_int()
	{
		as1 = new ArrayList<Integer [][]>();
		
		int i=0;
		while(i<3)
		{
			init = new Integer[][]{{i , i+1},{i+2,i+3}};
			i++;
			
			as1.add(init);
		}
		Iterator itt = as1.iterator();
		while(itt.hasNext())
		{
		
			Integer in[][] = (Integer[][]) itt.next();
		//	System.out.println(in.length);
			for(int k=0;k<in.length;k++)
			{
				for(int j=0;j<in.length;j++)
				{
					System.out.println(in[k][j]);
				}
			}
				
	
		}
	}
	public static void main(String[] args) 
	{
		Learn_Array_of_Objects obj1 =new Learn_Array_of_Objects();
		//obj1.single_Array_String();
		//obj1.double_array_int();
		//obj1.test();
		//obj1.twod_add();
		obj1.twod_mul();
	}
	int [][] inp1 ,inp2 , op ;
	
	public void twod_add()
	{
		inp1=new int[][]{{1,1},{1,1}};
		inp2=new int[][]{{2,2},{2,2}};
		if(inp1.length != inp2.length)
			System.out.println("Invalid matrix dimesnions");
		else
		{
			op = new int[inp1.length][inp1.length];
			for(int i=0;i<inp1.length;i++)
			{
				for(int j=0;j<inp1.length;j++)
				{
					op[i][j]= inp1[i][j]+inp2[i][j];
					System.out.println(op[i][j]);
				}
			}
		}
	}
	
	public boolean cal_mat_col_dim(int [][] inp  )
	{
		boolean b=false;
		for(int i=1;i<inp.length;i++)
		{
			if(inp[i-1].length==inp[i].length)
				b=true;
			else
				b=false;
		}
		return b;
	}
	int op_r , op_c;
	int mul_r , mul_c;
	public boolean cal_mat_mul_dim(int [][] inp1 , int [][] inp2  )
	{
		boolean b=false;
		mul_c=inp1[0].length ;
		mul_r=inp2.length;
		if(mul_c==mul_r)
			b=true;
		return b;
	}
	public void twod_mul()
	{
		inp1=new int[][]{{1,2,3},{2,3,4},{3,4,5}};
		inp2=new int[][]{{2,3,4},{3,4,5},{4,5,6}};
		
		boolean b =this.cal_mat_col_dim(inp1);
		System.out.println("1" + b);
		b=this.cal_mat_col_dim(inp2);
		System.out.println("2" + b);
		b=this.cal_mat_mul_dim(inp1, inp2);
		System.out.println("3" + b);
		if(b)
		{
			op_r=inp1.length;
			op_c=inp2[0].length;
			
			op=new int[op_r][op_c];
			for(int i=0; i < op_r ; i++)
			{
				for(int j=0; j<op_c; j++)
				{
					//op[i][j]=0;
					for(int k=0;k<mul_c;k++)
					{
						op[i][j]=op[i][j] + inp1[i][k] * inp2[k][j];
					}
				}
			}
			for(int i=0;i<op_r;i++)
			{
				for(int j=0;j<op_c;j++)
				{
				
					System.out.println(op[i][j]);
				}
			}
		
		}
		else
		{
			System.out.println("matrices cannot be multilied in the given dimesions");
		}
		//this.cal_mat_dim(inp1);
		/*if(inp1.length != inp2.length)
			System.out.println("Invalid matrix dimesnions");
		else
		{
			op = new int[inp1.length][inp1.length];
			for(int i=0;i<inp1.length;i++)
			{
				for(int j=0;j<inp1.length;j++)
				{
					op[i][j]= inp1[i][j]+inp2[i][j];
					System.out.println(op[i][j]);
				}
			}
		}*/
	}
	public void test()

	{
		List<der[][]> as2 = new ArrayList<der[][]>();
		
		der[][] d = new der[][]{{},{}};
		
		as2.add(d );
		
		int [][] temp = new int[][]
		{
				{1,2},{3,4}		
				
				
		};
		System.out.println(temp.length);
		//System.out.println(temp[1][1]);
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp.length;j++)
			{
				System.out.println(temp[i][j]);
			}
		}
	}
}
class Base
{
	
}
class der extends Base
{
	der()
	{
		
	}
}
class der2 extends der
{

	der2(int n) {
		
		// TODO Auto-generated constructor stub
	}
	
}



