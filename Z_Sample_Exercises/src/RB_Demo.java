import java.util.ResourceBundle;


public class RB_Demo
{

	public static void main(String args[])
	{
		RB_Demo obj = new RB_Demo();
		obj.sample();
	}
	
	void sample()
	{
		ResourceBundle rb = ResourceBundle.getBundle("Demo");
		System.out.println(rb.getString("s4"));
		
	}
	
}
