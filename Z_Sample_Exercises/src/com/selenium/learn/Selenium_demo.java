package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_demo implements Sample_int , Sample_int2
{

	public static void main(String... args) throws InterruptedException
	{
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://swportal7stg.brocade.com");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.id("userid"));
		we.sendKeys("slkopsadm");
		we=driver.findElement(By.id("password"));
		we.sendKeys("swportalstg123");
		we=driver.findElement(By.id("btnLogin"));
		we.click();
		Actions builder = new Actions(driver);  
		we=driver.findElement(By.partialLinkText("Administration"));
		builder.moveToElement(we).perform();
		we=driver.findElement(By.partialLinkText("Configure Non ERP Unit License Generation"));
		we.click();
		//String select ="dijit.byId('dijit_MenuItem_8').set('value', 'IP')";
		Thread.sleep(5000);
		String select ="dijit.byId('selectedProduct').set('value','NOS')";
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(select);
		
		Sample_int t =new Sample_int() {
	            public Boolean sayhello() {
	                return true;
	            }
	        };
	        Sample_int t1 =new Sample_int() {
	            public Boolean sayhello() {
	                return false;
	            }
	        };
	        
	        
	        
	        System.out.println(t1.sayhello());*/
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://sw7qa.brocade.com");
		
		WebElement we=driver.findElement(By.cssSelector("html body div#ms-container div#mysupport-container form#Login div.login div.login-content label input#userid.input-text"));
		we.sendKeys("slkcsupport");
		Thread.sleep(10000);
		
	}

	
	@DataProvider(name="test")
	public Object[][] data_method()
	{
		 Object[][] obj = new Object[][]{{"hello"}};
		
		return obj;
	}
	@Test(dataProvider="test")
	public void test1(String temp)
	{
		System.out.println(temp);
	}
	
	@Override
	public Boolean sayhello() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
