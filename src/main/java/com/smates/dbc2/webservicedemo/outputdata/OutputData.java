
package com.smates.dbc2.webservicedemo.outputdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>outputData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡwatershedCode���Ե�ֵ��
     * 
     */
    public long getWatershedCode() {
        return watershedCode;
    }

    /**
     * ����watershedCode���Ե�ֵ��
     * 
     */
    public void setWatershedCode(long value) {
        this.watershedCode = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     */
    public long getTime() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     */
    public void setTime(long value) {
        this.time = value;
    }

}
