package com.selenium.learn;

import org.testng.IAttributes;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlTest;




public class Xml_Read extends Method_demo
{
	
	@Test
	public void test_1(ITestContext testcon)
	{
		
		XmlTest xml_obj=  testcon.getCurrentXmlTest();
		System.out.println(xml_obj.getParameter("username"));
		/*System.out.println(xml_obj.getParameter("envid"));
		String envId = (String)testcon.getSuite().getAttribute("envid");	
		System.out.println(envId);*/
	}
	@Test
	public void test_3()
	{
	System.out.println("in test 3");
	}
	
	
	
}
