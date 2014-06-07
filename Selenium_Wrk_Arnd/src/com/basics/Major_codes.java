package com.basics;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

public class Major_codes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("D:/GIT_REPOS/Sw_Portal_Auto_RFE_OCT_22/Z_Sample_Exercises/src/com/selenium/learn/sample.html");
		Select select = new Select(driver.findElement(By.tagName("input")));
		select.selectByVisibleText("Edam");
		
		
		//WebElement we=driver.findElement(By.cssSelector("html body div#ms-container div#mysupport-container form#Login div.login div.login-content label input#userid.input-text"));
		
		List<WebElement> we=driver.findElements(By.xpath("//input"));
		System.out.println(we.size());
		driver.switchTo().frame("frameName");
		driver.switchTo().window("windowName");
		Alert alert = driver.switchTo().alert();
		
		
		
		WebElement element = driver.findElement(By.name("source"));
		WebElement target = driver.findElement(By.name("target"));
		Actions obj= new Actions(driver);
		obj.dragAndDrop(element, target).perform();
		
		
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("WebDriver");
		profile.setPreference("foo.bar", 23);
		WebDriver driverr = new FirefoxDriver(profile);
	
	
		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	        File screenshot = ((TakesScreenshot)augmentedDriver).
	                            getScreenshotAs(OutputType.FILE);

	}

}
