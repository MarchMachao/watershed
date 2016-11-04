
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
 * &lt;complexType name="getDataYearly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="watershedCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    protected long watershedCode;
    protected long year;

    /**
     * 获取watershedCode属性的值。
     * 
     */
    public long getWatershedCode() {
        return watershedCode;
    }

    /**
     * 设置watershedCode属性的值。
     * 
     */
    public void setWatershedCode(long value) {
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
