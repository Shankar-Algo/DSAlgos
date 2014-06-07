package com.selenium.learn;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;





@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="portalConfig")
@XmlType(name = "portalConfig_type", propOrder = {
    "environments"
    
})


public class PortalConfigType
{
	
	 @XmlElement(required = true)
	    protected EnvironmentsType environments;

	public EnvironmentsType getEnvironments() {
		return environments;
	}

	public void setEnvironments(EnvironmentsType environments) {
		this.environments = environments;
	}

	
	
	
}