
package com.smates.dbc2.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getDataYearly complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡyear���Ե�ֵ��
     * 
     */
    public long getYear() {
        return year;
    }

    /**
     * ����year���Ե�ֵ��
     * 
     */
    public void setYear(long value) {
        this.year = value;
    }

}
