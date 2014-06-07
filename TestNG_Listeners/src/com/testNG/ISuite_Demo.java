package com.testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ITestNGMethod;
import org.testng.Reporter;
import org.testng.xml.XmlTest;

public class ISuite_Demo 
{

	ISuite arg0;
	//ITestNG_Demo_Listener idl;
	XmlTest obj1 ;
	public ISuite_Demo(ISuite arg0)
	{
		this.arg0=arg0;
		
		// idl = new ITestNG_Demo_Listener();
	}
	
	public void ISD_getAllInvokedMethods()
	{
		
		List<IInvokedMethod> all_inv_m = arg0.getAllInvokedMethods();
		System.out.println("Size of invoked methods :"+all_inv_m.size());
		
		
		
		for(IInvokedMethod m : all_inv_m)
		{
			
			ITestNGMethod ng_m= m.getTestMethod();
			
			obj1=ng_m.getXmlTest();
			Map<String,String> m_obj = ng_m.findMethodParameters(obj1);
			if(ng_m.getMethodName().equalsIgnoreCase("TestNG_ISuite_M6"))
			{
				System.out.println("Map size :"+m_obj.size());
				for(String s : m_obj.keySet())
					System.out.println("Entry set :"+s);
			}
			System.out.println(ng_m.getMethodName());
		}
		
	}
	public void ISD_getfailInvo()
	{
		
		List<ITestNGMethod> all_inv_m = arg0.getAllMethods();
		System.out.println("Size of invoked methods :"+all_inv_m.size());
		for(ITestNGMethod m : all_inv_m)
		{
			
			if(m.getMethodName().equalsIgnoreCase("TestNG_ISuite_M4"))
				System.out.println("failed data provider args : "+m.getFailedInvocationNumbers().size());
			
			System.out.println(m.getMethodName());
		}
		
	}
	
/*	public void ISD_addListener()
	{
		arg0.addListener(idl);
	}*/
	
	
	
	
	public void ISD_getAllMethods()
	{
		
		
		List<ITestNGMethod> all_inv_m = arg0.getAllMethods();
		System.out.println("Size of test methods :"+all_inv_m.size());
		for(ITestNGMethod m : all_inv_m)
		{
			
			
			if(m.getMethodName().equalsIgnoreCase("TestNG_ISuite_M2"))
			{
				m.addMethodDependedUpon("TestNG_ISuite_M111");
				
			}
			
			if(m.getMethodName().equalsIgnoreCase("act_base_Test"))
			{
				System.out.println("Inside  base test ");
				System.out.println(m.getRealClass());
				//System.out.println(m.getMethod().getDeclaringClass());
				System.out.println(m.getConstructorOrMethod().getDeclaringClass());
			}
			List<Integer> list_obj = new ArrayList();
			list_obj.add(0);
			list_obj.add(1);
			list_obj.add(2);
			
			if(m.getMethodName().equalsIgnoreCase("TestNG_ISuite_M4"))
			{
				
				
				//m.setInvocationNumbers(list_obj);
				m.addFailedInvocationNumber(2);
				System.out.println("invocation numbs :"+m.getInvocationNumbers());
				System.out.println("failed invocation numbs :"+m.getFailedInvocationNumbers());
				
				
				
			}
			
			/*String[] args=m.getMethodsDependedUpon();
			for(String s : args)
			{
				System.out.println(m.getMethodName());
				System.out.println(s);
				System.out.println("flag :"+m.ignoreMissingDependencies());
			}*/
			System.out.println(m.getMethodName());
			Reporter.log(m.getMethodName());
			System.out.println(m.ignoreMissingDependencies()+"");
			m.setIgnoreMissingDependencies(true);
			System.out.println(m.ignoreMissingDependencies()+"");
			
			System.out.println("Method instance : "+m.getMethodName()+"   "+m.getInstance());
			
		}
		
	}
}
