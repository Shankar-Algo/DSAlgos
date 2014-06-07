package com.testNG;

import java.util.Map;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class ISuite_Listener_demo implements ISuiteListener
{

	ISuite_Demo isd_obj;
	@Override
	public void onFinish(ISuite arg0) 
	{
	Reporter.log("Inside ISuite_Listener_demo onFinish");
	System.out.println("Invoking finish");
	if(isd_obj==null)
	 isd_obj = new ISuite_Demo(arg0);
	
	isd_obj.ISD_getAllInvokedMethods();
	
	
	Map<String,ISuiteResult> mp = arg0.getResults();
	
	for(Map.Entry<String, ISuiteResult> temp : mp.entrySet())
	{
		String key = temp.getKey();
		ISuiteResult isr_obj = temp.getValue();
		System.out.println(isr_obj.getPropertyFileName());
	}
	
	System.out.println("hostname :"+ arg0.getHost());
	System.out.println("hostname :"+ arg0.getOutputDirectory());
	for(ITestNGMethod m : arg0.getAllMethods())
	{
		System.out.println(m.getFailedInvocationNumbers());
	}
	isd_obj.ISD_getfailInvo();
	
	}

	@Override
	//@BeforeSuite
	public void onStart(ISuite arg0) 
	{
		Reporter.log("Inside ISuite_Listener_demo onStart ");
		isd_obj = new ISuite_Demo(arg0);
		System.out.println("Invoking start");
		//isd_obj.ISD_addListener();
		isd_obj.ISD_getAllMethods();
	}

	
}
