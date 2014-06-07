package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class Page_Source {

	public static void main(String[] args)
	{
		WebDriver driverr = new InternetExplorerDriver();
		driverr.get("file:///F:/Selenium_Workspace_April_7/Selenium_Wrk_Arnd/src/com/practise/waits/xpath_loc.html");
		System.out.println(driverr.getPageSource());
		driverr.quit();
		
		Wait<WebDriver> obj =new FluentWait<WebDriver>(driverr);
		WebElement ele = obj.until(new Function<WebDriver,WebElement> () 
				{
			public WebElement apply (WebDriver driver)
			{
				return driver.findElement(By.id("shankar"));
			}
				});
		
		WebDriverWait objnew =new WebDriverWait(driverr,10);
	
		
		 objnew.until(new Predicate<WebDriver> () 
				{
			public boolean apply (WebDriver driver)
			{
				return driver.findElement(By.id("shankar")).isEnabled();
			}
				});

	}

}
