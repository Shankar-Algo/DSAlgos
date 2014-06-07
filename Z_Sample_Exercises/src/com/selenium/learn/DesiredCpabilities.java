package com.selenium.learn;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCpabilities 
{

	void c_firefoxprofile()
	{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		
		
		System.out.println(dc.isJavascriptEnabled());
		
		dc.setCapability("javascriptEnabled", false);
		
		System.out.println(dc.isJavascriptEnabled());
		
		dc.setCapability("takesScreenshot", true);
		
		//System.out.println(dc.);
		
		
	}
	
	public static void main(String... args)
	{
		DesiredCpabilities obj1 = new DesiredCpabilities();
		obj1.c_firefoxprofile();
		
	}
	
	
}
