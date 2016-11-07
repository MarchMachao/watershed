
package com.smates.dbc2.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getDataYearly complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getDataYearly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="watershedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataYearly", propOrder = {
    "watershedCode",
    "year"
})
public class GetDataYearly {

    protected String watershedCode;
    protected long year;

    /**
     * 获取watershedCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatershedCode() {
        return watershedCode;
    }

    /**
     * 设置watershedCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatershedCode(String value) {
        this.watershedCode = value;
    }

    /**
     * 获取year属性的值。
     * 
     */
    public long getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     */
    public void setYear(long value) {
        this.year = value;
    }

}
