package com.selenium.learn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class InheritGroups_Demo_1
{

	String uname;
	
	
	@Parameters(value = "")
	@Test

public void test_1(@Optional("Default") String uname)
{
	System.out.println("IN_1_M1" + "   " + uname);
}
	
	@Test(dataProvider ="DP_1")
	public void test_dp(String uname)
	{
		System.out.println("DP:   "+ uname);
	}
	
	@DataProvider(name = "DP_1")
	public Object[][] data()
	{
		return new Object[][]{new Object[] {new String("slkopsadm")}};
	}
	
}
