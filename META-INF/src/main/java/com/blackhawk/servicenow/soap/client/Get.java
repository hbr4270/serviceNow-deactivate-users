
package com.blackhawk.servicenow.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sys_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="__use_view" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sysId",
    "useView"
})
@XmlRootElement(name = "get")
public class Get {

    @XmlElement(name = "sys_id", required = true)
    protected String sysId;
    @XmlElement(name = "__use_view")
    protected String useView;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the useView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseView() {
        return useView;
    }

    /**
     * Sets the value of the useView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseView(String value) {
        this.useView = value;
    }

}