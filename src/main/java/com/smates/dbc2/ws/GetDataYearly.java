
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
 * &lt;complexType name="getDataYearly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="watershedCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
