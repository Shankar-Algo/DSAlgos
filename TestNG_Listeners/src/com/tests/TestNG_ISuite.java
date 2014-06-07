package com.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ITestNGMethod;
import org.testng.Reporter;
import org.testng.SuiteRunner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testNG.ISuite_Demo;
import com.testNG.ISuite_Listener_demo;

public class TestNG_ISuite extends Sample_Base//extends ISuite_Listener_demo
{

	@Test
	public void TestNG_ISuite_M1()
	{
		Assert.assertTrue(true, "FAILED in TestNG_ISuite_M1");
	}
	@Test//(dependsOnMethods={"M1"})
	public void TestNG_ISuite_M2()
	{
		Reporter.log("Wrong invocation in TestNG_ISuite_M2");
		
	}
	@Test
	public void TestNG_ISuite_M3()
	{
		Reporter.log("Completed TestNG_ISuite_M3 : SUCCESS");
		
	}
	@Test(dataProvider="DP1")
	public void TestNG_ISuite_M4(String argss,String key)
	{
		Reporter.log("Completed TestNG_ISuite_M4 : SUCCESS");
		System.out.println("data test :"+argss);
		Reporter.log("data test :"+argss);
	}
	
	/*@Test
	public  void base_test()
	{
		System.out.println("Base test");
	}*/
	
	@DataProvider(name="DP1")
	public Object[][] data_provider()
	{
		System.out.println("IN Data provider");
		return new Object[][]{{"test","hello"},{"test2","hello2"},{"test3","hello3","hjhvj"}};
	}
	@Test
	@Parameters({"username","password"})
	public void TestNG_ISuite_M6(@Optional("mysql") String argss,@Optional("mysql") String key)
	{
		Reporter.log("Completed TestNG_ISuite_M6 : SUCCESS");
		System.out.println("data test :"+argss);
		Reporter.log("data test :"+argss);
	}
	
	@Override
	public void act_base_Test() {
		System.out.println("act_base_Test test");
		
	}
		
	
}
