package com.selenium.learn;


import org.testng.annotations.*;
@Test(groups={"g1"})
public class InheritGroups_Demo
{
	
	@Test(groups={"g1"})
	public void test_1 ()
	{
		System.out.println("IN_M1");
	}
	

	@Test(groups={"g1"})
	public void test_2 ()
	{
		System.out.println("IN_M2");
	}
	@Test(groups={"g2"})
	public void test_3()
	{
		System.out.println("IN_M3");
	}
}
