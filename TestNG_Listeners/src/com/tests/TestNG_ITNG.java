package com.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ITNG 
{

	
	@Test(groups={"G1","G2"})
	public void TestNG_ITNG_M1()
	{
		Reporter.log("TestNG_ITNG_M1");
		System.out.println("TestNG_ITNG_M1");
	}
	@Test(groups={"G1"} , dependsOnMethods={"TestNG_ITNG_M1"})
	public void TestNG_ITNG_M2()
	{
		Reporter.log("TestNG_ITNG_M2");
		System.out.println("TestNG_ITNG_M2");
	}
	@Test(groups={"G2"} , description="decription attribtue for TestNG_ITNG_M3")
	public void TestNG_ITNG_M3()
	{
		Reporter.log("TestNG_ITNG_M3");
		System.out.println("TestNG_ITNG_M3");
	}
	@Test(dependsOnGroups={"G2"})
	public void TestNG_ITNG_M4()
	{
		Reporter.log("TestNG_ITNG_M4");
		System.out.println("TestNG_ITNG_M4");
	}
	/*@AfterGroups(value="G1")
	public void TestNG_ITNG_M5()
	{
		Reporter.log("TestNG_ITNG_M5");
		System.out.println("TestNG_ITNG_M5");
	}
	@BeforeGroups(value={"G1","G2"})
	public void TestNG_ITNG_M6()
	{
		Reporter.log("TestNG_ITNG_M6");
		System.out.println("TestNG_ITNG_M6");
	}
	@BeforeMethod
	public void TestNG_ITNG_M7()
	{
		Reporter.log("TestNG_ITNG_M7");
		System.out.println("TestNG_ITNG_M7");
	}*/
	/*@Parameters(value={"par_1"})
	@BeforeTest(enabled=true)
	public void TestNG_ITNG_M7(String arg1)
	{
		Reporter.log("TestNG_ITNG_M8 parmeter method value :"+arg1);
		System.out.println("TestNG_ITNG_M8 parmeter method value :"+arg1);
	}*/
/*	@Test
	public void TestNG_ITNG_M8()
	{
		Reporter.log("TestNG_ITNG_M8" );
		System.out.println("TestNG_ITNG_M8 ");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"TestNG_ITNG_M8"},alwaysRun=true)
	public void TestNG_ITNG_M9()
	{
		Reporter.log("TestNG_ITNG_M9" );
		System.out.println("TestNG_ITNG_M9 ");
		
	}*/
	//@Parameters(value={"par_1","par_2"})
	@Test(dataProvider="DP1")
	public void TestNG_ITNG_M7(String arg1 , String arg2)
	{
		Reporter.log("TestNG_ITNG_M7 parmeter method value :"+arg1 +"   "+arg2);
		System.out.println("TestNG_ITNG_M7 parmeter method value :"+arg1 +"   "+arg2);
	}
	
	
	@DataProvider(name="DP1")
	public Object[][] data_method()
	{
	
		return new Object[][]{{"hello","world"},{"data ","method"}};
	}
}
