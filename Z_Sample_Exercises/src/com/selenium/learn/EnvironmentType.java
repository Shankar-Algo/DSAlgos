//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.02 at 01:48:05 PM PST 
//


package com.selenium.learn;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for environment_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="environment_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendMailAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="distList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="waitTimeInSecs" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environment_type", propOrder = {
    "url",
    "sendMailAlerts",
    "distList",
    "waitTimeInSecs"
})
public class EnvironmentType {

    @XmlElement(required = true)
    protected String url;
    protected boolean sendMailAlerts;
    @XmlElement(required = true)
    protected String distList;
    @XmlElement(required = true)
    protected BigInteger waitTimeInSecs;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the sendMailAlerts property.
     * 
     */
    public boolean isSendMailAlerts() {
        return sendMailAlerts;
    }

    /**
     * Sets the value of the sendMailAlerts property.
     * 
     */
    public void setSendMailAlerts(boolean value) {
        this.sendMailAlerts = value;
    }

    /**
     * Gets the value of the distList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistList() {
        return distList;
    }

    /**
     * Sets the value of the distList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistList(String value) {
        this.distList = value;
    }

    /**
     * Gets the value of the waitTimeInSecs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitTimeInSecs() {
        return waitTimeInSecs;
    }

    /**
     * Sets the value of the waitTimeInSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitTimeInSecs(BigInteger value) {
        this.waitTimeInSecs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }
    public String toString()
    {
    	return this.getId();
    }
}