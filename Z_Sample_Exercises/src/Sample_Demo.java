import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample_Demo 
{

	
	public static void main(String args[])
	{
		Sample_Demo obj = new Sample_Demo();
		obj.sample();
	}
	public void sample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("www.ndtv.com");
	}
}
