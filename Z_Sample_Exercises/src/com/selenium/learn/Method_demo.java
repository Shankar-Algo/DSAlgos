package com.selenium.learn;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.IAttributes;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class Method_demo 
{

/*	@Test(dataProvider="DP1")
	
	public void test1()
	{
		
	}
	@DataProvider(name="DP1")
	public  Object[][] data_Get(Method m)
	{
		
		return new Object[5][5];
	}
	*/
	
/*	@BeforeTest
	public void test_2(ITestContext testcon)
	{
		
		String envid="stage";
		ISuite is=testcon.getSuite();
		is.setAttribute("TEST", envid);
		System.out.println(is.getAttribute("TEST"));
		//String obj = (String)is.getAttribute("test");
		
		//System.out.println(obj.toString());
		
	}*/
	
	// Portal configs file in selenium base project
	/*public void JAXB_DEMO() throws JAXBException
	{
	
		JAXBContext context = JAXBContext.newInstance(PortalConfigType.class);
		String path = "D:/GIT_REPOS/Sw_Portal_Auto_RFE_OCT_2013/Z_Sample_Exercises/src/com/journaldev/annotations/PortalConfigurations.xml";
		PortalConfigType config = (PortalConfigType)context.createUnmarshaller().unmarshal(new File(path));
		
		EnvironmentsType e = config.getEnvironments();
		List ls = e.getEnvironment();
		Iterator<EnvironmentType> it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}*/
	
	//for my understading
	public void JAXB_DEMO() throws JAXBException
	{
		JAXBContext context = JAXBContext.newInstance(SampleType.class);
		String path = "D:/GIT_REPOS/Sw_Portal_Auto_RFE_OCT_2013/Z_Sample_Exercises/src/com/selenium/learn/Sample.xml";
		SampleType sample_type = (SampleType)context.createUnmarshaller().unmarshal(new File(path));
		System.out.println(sample_type.getTest());
		
		
		
	}
	
	public void test()
	{
		List<?> lis = new ArrayList<SampleType>();
	}
	public static void main(String... args) throws JAXBException
	{
		Method_demo md = new Method_demo();
		//md.JAXB_DEMO();
	}
	
}
