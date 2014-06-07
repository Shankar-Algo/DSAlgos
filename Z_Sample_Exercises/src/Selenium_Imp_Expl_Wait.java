

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Imp_Expl_Wait {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		/*WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until
				(ExpectedConditions.presenceOfElementLocated(By.id("ks7525s0om_1")));*/

		//ks7525s0om_1
	
	}

	public void expl_wait()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("www.ndtv.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.ignoring(NoSuchElementException.class);
		
		//WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ks7525s0om_1")));
		
	//	WebElement eleme=wait.until(ExpectedConditions.elementToBeSelected(By.id("ks7525s0om_1")));
		
		
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
		
		// ExpectedCondition<WebElement> expc= ExpectedConditions.visibilityOfElementLocated(By.id("ks7525s0om_1")) ;
		 
		  
		WebElement myDynamicElement = wait.until(ExpectedConditions.elementToBeSelected(By.id("ks7525s0om_1"))) ;
	}
	
}
