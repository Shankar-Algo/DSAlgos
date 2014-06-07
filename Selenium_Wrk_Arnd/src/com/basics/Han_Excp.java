package com.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;*/

public class Han_Excp {

	int val_d;
	protected int val_p;
	public int val_pu;
	private int val_pr;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
	/*	WebDriver driverr=null;
		try
		{
			 driverr = new InternetExplorerDriver();
			driverr.get("file:///F:/Selenium_Workspace_April_7/Selenium_Wrk_Arnd/src/com/practise/waits/xpath_loc.html");
			driverr.findElement(By.id("sadasd"));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Catch");
			driverr.close();
		}*/

		List<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj);
		Enumeration<Integer> em = Collections.enumeration(obj);
		while(em.hasMoreElements())
		{
			int j = em.nextElement();
			System.out.println(j);
			//if(j==2)
				
		}
		
			System.out.println(obj);
			ListIterator<Integer> it = obj.listIterator();
		//Iterator<Integer> it = obj.iterator();
			while(it.hasNext())
			{
				int i= it.next();
				if(i==2)
				it.add(4);;
				
				System.out.println(i);
				
			}
			System.out.println(obj);
		
	}

}
