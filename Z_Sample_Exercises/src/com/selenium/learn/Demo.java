package com.selenium.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Demo //implements Wait_Test
{

	public static void main(String args[])
	{
		Map<String,String> pline_pn = new HashMap<String,String>();
		pline_pn.put("S"+1,"hello");
		pline_pn.put("S"+2, "hi");
		System.out.println(pline_pn.get("S"+2));
		WebDriver driver = new FirefoxDriver();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(35, TimeUnit.SECONDS)
			     .pollingEvery(1, TimeUnit.SECONDS)
			     .ignoring(NoSuchElementException.class);;
		
			     
			     WebElement element = fluentWait.until(new com.google.common.base.Function<WebDriver, WebElement>() 
				{
            public WebElement apply(WebDriver d) 
            {

                return d.findElement(By.xpath("test"));
	}
            }
		);
	
			     Wait_Test test = new Wait_Test(){ public boolean sample()
			     {return true;}
			     
			     public Integer add_sum()
			     {
					return 5;
			    	 
			     }
			     };
			     
}
	}
