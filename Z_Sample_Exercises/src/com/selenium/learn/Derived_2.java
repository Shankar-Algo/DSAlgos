package com.selenium.learn;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Derived_2 extends Derived_1
{

/*	@Test
	public void d2_m1()
	{
		System.out.println("Derived_2_m1");
	}*/
	
	void to_check_until()
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait obj1 = new WebDriverWait(driver,30);
		WebElement element = obj1.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id("hello"));
			}
		});
		
		/*WebElement element = obj1.until(new Function<WebDriver,WebElement>){
			public boolean apply(WebDriver driver)
			{
				
			}
		}*/
	}
	public static void main(String args[])
	{
		Map mp = new LinkedHashMap();
		mp.put("test1", "value1");
		mp.put("U1_UniqueId", "value2");
		
		Object[][] testData = new Object[1][1];
		testData[0][0]="U1_UniqueId";
		
		System.out.println(testData[0][0].toString().trim().split("_")[0]);
		
	
	}
}
