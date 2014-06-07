package com.testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.ISuite;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlTest;

public class IDemo_TestNG_List_Class 
{

	ISuite arg ;
	IDemo_TestNG_List_Class(ISuite arg)
	{
		this.arg=arg;
	}
	
	void missing_Gr()
	{
		List<ITestNGMethod> m_list =arg.getAllMethods(); 
		
		for(ITestNGMethod m : m_list)
		{
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M4"))
			{
				m.setMissingGroup("G1");
				
				
			}
			
			System.out.println("Missing Group :"+m.getMissingGroup());
			System.out.println("Grps  :"+m.getGroups().length);
			System.out.println("Grps depends on  : "+m.getGroupsDependedUpon().length);
		}
	}
	
	void depends_method()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
		
		for(ITestNGMethod m : m_list)
		{
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M2"))
			{
				m.addMethodDependedUpon("com.tests.TestNG_ITNG.TestNG_ITNG_M3");
			}
			System.out.println(m.getMethodName());
			for(String s :m.getMethodsDependedUpon())
				System.out.println("Method depends on :"+s);
			
			
		}
	}
	void parameter_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			Map<String,String> m_params=null;
		for(ITestNGMethod m : m_list)
		{
			XmlTest xml = m.getXmlTest();
			 m_params=m.findMethodParameters(xml);
			
			
			
		}
		
		for(Map.Entry<String, String> entry : m_params.entrySet())
			System.out.println("Parameter value :"+entry.getKey()+"   Value :"+entry.getValue());
		
	}
	void desc_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			System.out.println(m.getDescription());
		}
		
			
	}
	void get_curr_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			System.out.println("Method name : & curr invo cnt"+m.getMethodName()+"    "+m.getCurrentInvocationCount());
		}
		
			
	}
	void inc_curr_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M2"))
				m.incrementCurrentInvocationCount();
		}
		
			
	}
	void get_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			System.out.println("Method name & invo count : "+m.getMethodName()+"    "+m.getInvocationCount());
		}
		
			
	}
	void inc_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M7"))
				m.setInvocationCount(2);
		}
		
			
	}
	void get_par_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			System.out.println("Method name & parm count: "+m.getMethodName()+"    "+m.getParameterInvocationCount());
		}
		
			
	}
	void inc_par_inv_cnt_m()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
			
		for(ITestNGMethod m : m_list)
		{
					
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M7"))
				m.setParameterInvocationCount(3);
		}
		
			
	}
	void set_setInvocationNumbers()
	{
			List<ITestNGMethod> m_list =arg.getAllMethods(); 
		
			List<Integer> list = new ArrayList<Integer>();
			list.add(0);
		for(ITestNGMethod m : m_list)
		{
					
			if(m.getMethodName().equalsIgnoreCase("TestNG_ITNG_M7"))
				m.setInvocationNumbers(list);
		}
		
			
	}
	
}
