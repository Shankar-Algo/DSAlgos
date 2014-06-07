package com.basics.scjp.learn;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FileReading
{
	String[] temp;
	List<String> s_tag = new ArrayList<String>();
	List<String> e_tag = new ArrayList<String>();
	
	public void read() 
	{
		
		try 
		{
			File f = new File("samplexml");
			FileReader fr = new FileReader(f);
			//FileReader frr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			BufferedReader brr = new BufferedReader(fr);
			String tag="";
			int i=0;
/*			int p=0;
	while(brr.readLine()!=null)
	{
		p++;
	}
	brr.close();
	System.out.println(p);*/
		temp=new String[6];	
			while(i<6)
			{
				
				tag=br.readLine();
				
				System.out.println(tag);
				if(tag.contains("/"))
					e_tag.add(tag);
				else
				{
					temp[i]=tag;
					s_tag.add(tag);
				}

				
				i++;
			}
			
			System.out.println(i);
			
			/*for(int j=0;j<=i;j++)
			{
				tag=brr.readLine();
				if(tag.contains("/"))
					e_tag.add(tag);
				else
					s_tag.add(tag);
				
				
			}*/
			System.out.println(e_tag.size() +"   "+s_tag.size());
			if(e_tag.size()!=s_tag.size())
			{
				System.out.println("Xml not preoperly nested");
			}
			
			else
			{
				int l=s_tag.size();
				System.out.println("Xml seems to be valid by 50%");
				ListIterator<String> it = e_tag.listIterator();
				while(it.hasNext())
				{
					String end_t_Temp=it.next();
					StringBuffer sb  = new StringBuffer(end_t_Temp);
					for(i=0;i<sb.length()-1;i++)
					{
						if(sb.charAt(i)=='/')
							sb.deleteCharAt(i);
					}
					end_t_Temp=sb.toString();
					temp[l]=end_t_Temp;
					l=l+1;
					it.set(end_t_Temp);
				}
				
			}
			for(int t=0;t<temp.length;t++)
			{
				System.out.println(temp[t]);
			}
			int k=temp.length-1;
			System.out.println(k);
			for(i=0;i<temp.length;i++)
			{
			
				if(!temp[i].equalsIgnoreCase(temp[k]))
				{
					System.out.println(i);
					System.out.println("Improper xml");
					break;
				}
				k--;
			}
			System.out.println("Successfully parsed");
			/*
			int i=0;
			br.mark(20);
			while(br.readLine()!=null)
			{
				
					
				i++;
			}
			temp = new String[i];
			br.reset();
			System.out.println(i);
			int j=0;
			while(j<=i)
			{
				temp[j]=br.readLine();
			}
			int arr_len=temp.length;
			for(int k=0; k<arr_len;k++)
			{
				System.out.println(temp[k]);
				String comp = temp[k];
				if(comp.contains("/"))
				{
					
				}
				
			}*/
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void write()
	{
		
	}
	public static void main(String... args)
	{
		FileReading f = new FileReading();
		f.read();
		FileReading farr[] = new FileReading[4];
	}
	
}
