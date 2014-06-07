package com.basics.scjp.learn;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;



public class Annot_Test_class 
{

	List<String> arguments,arguments1;
	@Test(dataProvider = "test1")
	@Annot_Exam(values={ "hello","welcome" })
	public void verifyData1(String n1, String n2) 
	{
	 System.out.println(n1 + " " + n2);
	
	
	}

	
	
	
	@DataProvider(name = "test1")
	public Object[][] createData1(Method testMethod) 
	{
		
		getTestSheetName(testMethod);
		Iterator<String> it = arguments.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*String sheetName = getTestSheetName(testMethod);
		String tableName = getTestTableName(testMethod);*/
		
		return new Object[][] {
				   { "hello1", "hello1" }};

	}




/*	private String getTestTableName(Method testMethod) {
		// TODO Auto-generated method stub
		DataProviderArgs args = testMethod.getAnnotation(DataProviderArgs.class);

		if (args != null) {
			if (args.value() != null || args.value().length > 0) {

				arguments = new ArrayList<String>();
				String curValue = null;

				for (int i = 0; i < args.value().length; i++) {
					curValue = args.value()[i];
					arguments.add(curValue);
				}
			}
		return null;
	}
*/



	private void getTestSheetName(Method testMethod) {
		// TODO Auto-generated method stub
		Annot_Exam args = testMethod.getAnnotation(Annot_Exam.class);

		if (args != null) 
		{
			if (args.values() != null || args.values().length > 0) 
			{

				arguments = new ArrayList<String>();
				String curValue = null;

				for (int i = 0; i < args.values().length; i++) 
				{
					curValue = args.values()[i];
					arguments.add(curValue);
				}
			}
		}

	
}
	}
