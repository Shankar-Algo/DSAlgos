package com.selenium.learn;

import java.lang.annotation.Annotation;

import org.testng.DependencyMap;
import org.testng.annotations.Test;

public class Deped_demo /*implements Test_User_Annot*/
{
@Test(groups={"d1"})
public void test1()
{
	System.out.println("m1");
}
@Test(groups={"d2"})
public void test2()
{
	System.out.println("m2");
}

public void test3()
{
	
}
public void test4()
{
	
}
public void test5()
{
	
}

@Test_User_Annot(details = {"hello","welcome"} )
public void sample()
{
	
System.out.println("in sample");
}
public static void main(String args[])
{
	Deped_demo dd = new Deped_demo();
	dd.sample();
	
}
/*@Override
public Class<? extends Annotation> annotationType() 
{
	// TODO Auto-generated method stub
	return
}
@Override
public String[] details() {
	// TODO Auto-generated method stub
	return null;
}*/
	
	
	
}
