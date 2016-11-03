
package com.smates.dbc2.webservicedemo.outputdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>outputData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="outputData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="watershedCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputData", propOrder = {
    "watershedCode",
    "time"
})
public class OutputData {

    protected long watershedCode;
    protected long time;

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
     * 获取time属性的值。
     * 
     */
    public long getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     */
    public void setTime(long value) {
        this.time = value;
    }

}
