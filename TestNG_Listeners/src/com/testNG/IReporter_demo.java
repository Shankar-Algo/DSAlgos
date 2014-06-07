package com.testNG;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class IReporter_demo implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		System.out.println("Output directory : "+arg2);
		
	}

}
