package com.selenium.learn;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;



public class Derived_1 extends Base_1
{

	@Test
	public void d1_m1(ITestContext context)
	{
		System.out.println("Derived_1 & m_1");
		context.setAttribute("browser","firefox");
		
		String attr = (String) context.getAttribute("browser");
		System.out.println(attr);
		
		XmlTest obj1 = context.getCurrentXmlTest();
		System.out.println(obj1.getParameter("envid"));
		
	}
	
	
}
