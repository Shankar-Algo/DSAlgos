package com.tests;

import org.testng.annotations.Test;

public abstract class Sample_Base 
{

	@Test
	public  void base_test()
	{
		System.out.println("Base Base test");
	}
	
	
	@Test
	public abstract void act_base_Test();
	/*{
		System.out.println("act_base_Test");
	}*/
}
