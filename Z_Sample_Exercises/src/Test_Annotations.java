import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_Annotations
{
	@Test
	public void run1_m1()
	{
		System.out.println("Run1_M1");
	}
	
	@BeforeMethod
	public void run1_m2()
	{
		System.out.println("Run1_M2");
	}
	@Test
	public void run1_m3()
	{
		System.out.println("Run1_M3");
	}
	
	public static void main(String... args )
	{
		
		for(int i=0;i<3;i++)
		{
		if(i==i)
		{		
			
		
		}	
		System.out.println(i);
		if(2==2)
		{
			
		}
		System.out.println(i);
		}
		
		
	}
	
}
