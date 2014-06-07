package com.practise.waits;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function ;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException
	{
String s="helloS";
System.out.println(s.toLowerCase());
Method[] methods = Explicit_Wait.class.getMethods();

for(Method method : methods){
    System.out.println("method = " + method.getName());
}
		System.out.println("Hello world");
	WebDriver driverr = new InternetExplorerDriver();
	
	driverr.get("https://www.myhcl.com/Login/home.aspx");
	
	driverr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement element = driverr.findElement(By.id("txtUserID"));
	
	
	element.sendKeys("hello");
	
	Thread.sleep(10);
	Select select = new Select (element);
	
	System.out.println(select.isMultiple());
	
	
	
	List<WebElement> list1 = select.getOptions();
	
	
	for(WebElement e : list1)
		System.out.println(e.getText() + e.getAttribute("value"));
	
	
	
	
		/*WebDriver driverr = new InternetExplorerDriver();
		driverr.get("file:///F:/Selenium_Workspace_April_7/Selenium_Wrk_Arnd/src/com/practise/waits/xpath_loc.html");
	//driverr.get("www.ndtv.com");
		 WebDriver augmentedDriver = new Augmenter().augment(driverr);
	        File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		File file = new File("sample.png");
	        screenshot.renameTo(file);
	        System.out.println(screenshot.getAbsolutePath());*/
	        
		WebDriver driverrrr = new InternetExplorerDriver();
		
	        System.out.println(driverrrr.manage());
	System.out.println(driverrrr.navigate());
	WebDriverWait wait = new WebDriverWait(driverrrr, 10);
	
	List<WebElement> myDynamicElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("myDynamicElement")));
	/* WebElement sample = wait.until(new Until_Int<WebDriver , WebElement>()
	 {

		@Override
		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.id("test"));
		}
	
		 
		 
	 });*/
	
	//myDynamicElement.click();

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

	obj.dragAndDrop(element, target);//.perform();
	
	
	
	
	ProfilesIni allProfiles = new ProfilesIni();
	FirefoxProfile profile = allProfiles.getProfile("WebDriver");
	profile.setPreference("foo.bar", 23);
	WebDriver driverrr = new FirefoxDriver(profile);


	 WebDriver augmentedDriver = new Augmenter().augment(driverrr);
        File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	
        System.out.println(screenshot.getAbsolutePath());
        WebDriver drivers = new FirefoxDriver();
        driver.get("http://somedomain/url_that_delays_loading");
        WebElement myDynamicElements = (new WebDriverWait(driver, 10))
          .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
        
    
        FluentWait<FirefoxDriver> obj_wait = new FluentWait(driver);
       
        obj_wait.pollingEvery(5, TimeUnit.MILLISECONDS);
        obj_wait.withTimeout(15, TimeUnit.SECONDS);
        List list = new ArrayList();
        list.add(NoSuchMethodException.class);
        list.add(NoSuchElementException.class);
        
        obj_wait.ignoreAll(list);
        WebElement element_wait = obj_wait.until(new Function <WebDriver,WebElement>() 
        {
        		public WebElement apply(WebDriver drivernew)
        {
        
        return drivernew.findElement(By.id("helloworld"));
        
        }

				public WebElement apply(FirefoxDriver arg0) {
					// TODO Auto-generated method stub
					return null;
				}	
        });
        
        FluentWait<WebDriver> obj_wait1 = new FluentWait(driver);
        
        obj_wait.pollingEvery(5, TimeUnit.MILLISECONDS);
        obj_wait.withTimeout(15, TimeUnit.SECONDS);
        List list1 = new ArrayList();
        list1.add(NoSuchMethodException.class);
        list1.add(NoSuchElementException.class);
        
        obj_wait.ignoreAll(list1);
        
       
        
       
        
        obj_wait1.until(new Predicate<WebDriver> ()
        		{
        	public boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
        		
        		 return arg0.getTitle().equalsIgnoreCase("hello");
			}	
        		});
        
	
	}

}
