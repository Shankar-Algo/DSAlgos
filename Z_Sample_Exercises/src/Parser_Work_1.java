import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Parser_Work_1 
{

	WebDriver driver;
	WebElement e1 , e2;
	Actions builder ;  
	public void test_1() throws InterruptedException
	{
		 driver = new FirefoxDriver();
		 builder = new Actions(driver);
		driver.get("http://brm-ud-wasapp-4.brocade.com:9081/swpwebserviceclientweb/showOperations.do");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		e1=driver.findElement(By.linkText("QA1"));
		
		//System.out.println(e1.getText());
		//e1.click();
		
		System.out.println("QA1 located");
		//builder.moveToElement(e1).build().perform();
		builder = new Actions(driver);
		builder.moveToElement(e1).build().perform();
		Thread.sleep(5000);
		System.out.println("Builder done");
		e2=driver.findElement(By.linkText("FOS"));
		e2.click();
		Thread.sleep(5000);
		e2=driver.findElement(By.id("3|FOSLicenseService|queryLicenseByTkey"));
		e2.click();
		Thread.sleep(5000);
		e2=driver.findElement(By.id("transactionKey#transactionKey#0"));
		e2.sendKeys("CBD27E604E01DCC74F06D0");
		e2=driver.findElement(By.id("partnerAccountId#partnerAccountId#0"));
		e2.sendKeys("4741");
		e2=driver.findElement(By.id("inputSubmit"));
		e2.click();
		Thread.sleep(5000);
		e2=driver.findElement(By.id("responseTextArea"));
	String temp = e2.getText();
	StringBuffer sb = new StringBuffer(temp);
	
	for(int i=0;i< sb.length();i++)
	{
		if(sb.charAt(i)=='>')
		{
			
			sb.insert(i+1,"\n");
		}
		
	}
	System.out.println(sb);
		
		
		//driver.close();
		
	}
	public void test_2() throws InterruptedException
	{
		 driver = new FirefoxDriver();
		 builder = new Actions(driver);
		driver.get("http://sw7qa.brocade.com");
		driver.manage().window().maximize();
		e1=driver.findElement(By.id("userid"));
		e1.sendKeys("slkcsupport");
		e1=driver.findElement(By.id("password"));
		e1.sendKeys("qaswportal123");
		e1=driver.findElement(By.id("btnLogin"));
		e1.click();
		Thread.sleep(5000);
		e2=driver.findElement(By.linkText("License Management"));
		builder = new Actions(driver);
		builder.moveToElement(e2).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, XMLStreamException 
	{
		Parser_Work_1 pw_1 = new Parser_Work_1();
		//pw_1.test_1();
	//	pw_1.test_2();
		
		/*String temp ="<config><item><i1>i1</i1><i2>i2</i2><item><item><i1>i11</i1><i2>i22</i2><item></config>";
		String temp_1[]=temp.split("<item>");
		StringBuffer sb = new StringBuffer("<config><item><i1>i1</i1><i2>i2</i2><item><item><i1>i11</i1><i2>i22</i2><item></config>");
		sb.
		for(int i=0; i<temp_1.length;i++)
			System.out.println(temp_1[i]);*/
		
		String temp ="<parent><config><item><i1>i1</i1><i2>i2</i2></item><item><i1>i11</i1><i2>i22</i2></item></config></parent>";
		String temp_1[]=temp.split("a");
		StringBuffer sb = new StringBuffer(temp);
		
		for(int i=0;i< sb.length();i++)
		{
			if(sb.charAt(i)=='>')
			{
				
				sb.insert(i+1,"\n");
				
			}
			/*else if( ((sb.charAt(i-1)=='<')))
			{
				sb.insert(i+1,"\n");
			}*/
			
		}
		
		System.out.println(sb);
		File f = new File("response.xml");
		//FileOutputStream fos = new FileOutputStream(f);
		FileWriter fw = new FileWriter(f);
		System.out.println(sb.toString());
		fw.write(sb.toString());
		fw.flush();
		XMLInputFactory xif = XMLInputFactory.newInstance();
		FileInputStream fis = new FileInputStream(f);
		XMLEventReader xer = xif.createXMLEventReader(fis);
		int i=0;
		while(xer.hasNext() )
		{
			/*System.out.println(xer.getElementText());
			System.out.println(xer.nextEvent());
			System.out.println(xer.nextTag());*/
			
			++i;
			XMLEvent xe = xer.nextEvent();
		
			/*System.out.println(xe.isStartDocument());
			System.out.println(xe.isEndElement());
			if(!(xe.isStartElement() && xe.isEndElement()))
			{
				System.out.println(xe.asCharacters());
			}*/
			
		/*	System.out.println(++i + "   " + xe.getEventType());
			if(i==4)
				System.out.println(xer.getElementText());
			if(!xe.isEndDocument())
			System.out.println(xer.nextTag());
			System.out.println(xe.getLocation());
			System.out.println(xe.getSchemaType());
			if(xe.isCharacters())
			System.out.println("IScHARACTERS");
			System.out.println(xe.isEndElement());
			
			
			System.out.println("final " +xe.END_DOCUMENT);
			
			//System.out.println(xe.);
*/			
		
			
			
		}
		System.out.println("hello");
		System.out.println(i);
	
	}

}
