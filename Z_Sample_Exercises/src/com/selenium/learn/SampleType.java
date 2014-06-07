package com.selenium.learn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "test")
/*@XmlType(name="sample_type" , propOrder = {
		   "test"
		})*/
public class SampleType
{
	//@XmlElement(required = true)
	@XmlElement(name="test")
	    protected String test;

	
	 
	public String getTest() {
		return test;
	}

	public void setTest(String value) {
		System.out.println(value);
		this.test = value;
	}
	 
/*	@XmlElement(required = true)
    protected String test1;

 
 
public String getTest1() {
	return test1;
}

public void setTest1(String value) {
	this.test1 = value;
}*/
	
}
