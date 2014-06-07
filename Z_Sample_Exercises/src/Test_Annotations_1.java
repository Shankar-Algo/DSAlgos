import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_Annotations_1
{
	@BeforeClass
	public void run1_m1_a1()
	{
		System.out.println("Run1_M1_A1");
	}
	@Test
	public void run1_m2_a1()
	{
		System.out.println("Run1_M2_A1");
	}
}
