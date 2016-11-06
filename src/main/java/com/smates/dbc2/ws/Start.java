
package com.smates.dbc2.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>start complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="start"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="watershedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countyCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countyNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStep" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prec" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="precR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tempAvg" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tempMax" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tempMin" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputInd" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputAgr" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputSer" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputTour" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputTourR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="techProgRR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaAgri" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaAgriR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropWheat" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropCorn" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropOilseed" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropOrchard" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropCotton" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropGreenstuff" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropWheatR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropCornR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropOilseedR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropOrchardR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropCottonR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaCropGreenstuffR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaForest" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaGrass" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaWater" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gdp" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gdpPer" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gdpR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gdpPerR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelMain" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelBran" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelDou" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelNong" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelMao" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelMainWUE" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelBranWUE" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelDouWUE" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelNongWUE" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelMaoWUE" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaDripIrri" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowanceInd" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowanceAgr" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowanceSer" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waterAlloMid" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waterAlloDown" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waterRight" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waterSavingTechR" type="{http://jaxb.dev.java.net/array}doubleArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "start", propOrder = {
    "watershedCode",
    "countyCodes",
    "countyNames",
    "timeStart",
    "timeEnd",
    "timeStep",
    "prec",
    "precR",
    "tempAvg",
    "tempMax",
    "tempMin",
    "outputInd",
    "outputAgr",
    "outputSer",
    "outputTour",
    "outputTourR",
    "techProgRR",
    "areaAgri",
    "areaAgriR",
    "areaCropWheat",
    "areaCropCorn",
    "areaCropOilseed",
    "areaCropOrchard",
    "areaCropCotton",
    "areaCropGreenstuff",
    "areaCropWheatR",
    "areaCropCornR",
    "areaCropOilseedR",
    "areaCropOrchardR",
    "areaCropCottonR",
    "areaCropGreenstuffR",
    "areaForest",
    "areaGrass",
    "areaWater",
    "gdp",
    "gdpPer",
    "gdpR",
    "gdpPerR",
    "channelMain",
    "channelBran",
    "channelDou",
    "channelNong",
    "channelMao",
    "channelMainWUE",
    "channelBranWUE",
    "channelDouWUE",
    "channelNongWUE",
    "channelMaoWUE",
    "areaDripIrri",
    "allowanceInd",
    "allowanceAgr",
    "allowanceSer",
    "waterAlloMid",
    "waterAlloDown",
    "waterRight",
    "waterSavingTechR"
})
public class Start {

    protected String watershedCode;
    protected List<String> countyCodes;
    protected List<String> countyNames;
    protected String timeStart;
    protected String timeEnd;
    protected int timeStep;
    protected List<DoubleArray> prec;
    protected List<DoubleArray> precR;
    protected List<DoubleArray> tempAvg;
    protected List<DoubleArray> tempMax;
    protected List<DoubleArray> tempMin;
    protected List<DoubleArray> outputInd;
    protected List<DoubleArray> outputAgr;
    protected List<DoubleArray> outputSer;
    protected List<DoubleArray> outputTour;
    protected List<DoubleArray> outputTourR;
    protected List<DoubleArray> techProgRR;
    protected List<DoubleArray> areaAgri;
    protected List<DoubleArray> areaAgriR;
    protected List<DoubleArray> areaCropWheat;
    protected List<DoubleArray> areaCropCorn;
    protected List<DoubleArray> areaCropOilseed;
    protected List<DoubleArray> areaCropOrchard;
    protected List<DoubleArray> areaCropCotton;
    protected List<DoubleArray> areaCropGreenstuff;
    protected List<DoubleArray> areaCropWheatR;
    protected List<DoubleArray> areaCropCornR;
    protected List<DoubleArray> areaCropOilseedR;
    protected List<DoubleArray> areaCropOrchardR;
    protected List<DoubleArray> areaCropCottonR;
    protected List<DoubleArray> areaCropGreenstuffR;
    protected List<DoubleArray> areaForest;
    protected List<DoubleArray> areaGrass;
    protected List<DoubleArray> areaWater;
    protected List<DoubleArray> gdp;
    protected List<DoubleArray> gdpPer;
    protected List<DoubleArray> gdpR;
    protected List<DoubleArray> gdpPerR;
    protected List<DoubleArray> channelMain;
    protected List<DoubleArray> channelBran;
    protected List<DoubleArray> channelDou;
    protected List<DoubleArray> channelNong;
    protected List<DoubleArray> channelMao;
    protected List<DoubleArray> channelMainWUE;
    protected List<DoubleArray> channelBranWUE;
    protected List<DoubleArray> channelDouWUE;
    protected List<DoubleArray> channelNongWUE;
    protected List<DoubleArray> channelMaoWUE;
    protected List<DoubleArray> areaDripIrri;
    protected List<DoubleArray> allowanceInd;
    protected List<DoubleArray> allowanceAgr;
    protected List<DoubleArray> allowanceSer;
    protected List<DoubleArray> waterAlloMid;
    protected List<DoubleArray> waterAlloDown;
    protected List<DoubleArray> waterRight;
    protected List<DoubleArray> waterSavingTechR;

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
     * Gets the value of the countyCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountyCodes() {
        if (countyCodes == null) {
            countyCodes = new ArrayList<String>();
        }
        return this.countyCodes;
    }

    /**
     * Gets the value of the countyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountyNames() {
        if (countyNames == null) {
            countyNames = new ArrayList<String>();
        }
        return this.countyNames;
    }

    /**
     * 获取timeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStart() {
        return timeStart;
    }

    /**
     * 设置timeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStart(String value) {
        this.timeStart = value;
    }

    /**
     * 获取timeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEnd() {
        return timeEnd;
    }

    /**
     * 设置timeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEnd(String value) {
        this.timeEnd = value;
    }

    /**
     * 获取timeStep属性的值。
     * 
     */
    public int getTimeStep() {
        return timeStep;
    }

    /**
     * 设置timeStep属性的值。
     * 
     */
    public void setTimeStep(int value) {
        this.timeStep = value;
    }

    /**
     * Gets the value of the prec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getPrec() {
        if (prec == null) {
            prec = new ArrayList<DoubleArray>();
        }
        return this.prec;
    }

    /**
     * Gets the value of the precR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getPrecR() {
        if (precR == null) {
            precR = new ArrayList<DoubleArray>();
        }
        return this.precR;
    }

    /**
     * Gets the value of the tempAvg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempAvg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempAvg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getTempAvg() {
        if (tempAvg == null) {
            tempAvg = new ArrayList<DoubleArray>();
        }
        return this.tempAvg;
    }

    /**
     * Gets the value of the tempMax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempMax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempMax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getTempMax() {
        if (tempMax == null) {
            tempMax = new ArrayList<DoubleArray>();
        }
        return this.tempMax;
    }

    /**
     * Gets the value of the tempMin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tempMin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTempMin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getTempMin() {
        if (tempMin == null) {
            tempMin = new ArrayList<DoubleArray>();
        }
        return this.tempMin;
    }

    /**
     * Gets the value of the outputInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getOutputInd() {
        if (outputInd == null) {
            outputInd = new ArrayList<DoubleArray>();
        }
        return this.outputInd;
    }

    /**
     * Gets the value of the outputAgr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAgr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAgr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getOutputAgr() {
        if (outputAgr == null) {
            outputAgr = new ArrayList<DoubleArray>();
        }
        return this.outputAgr;
    }

    /**
     * Gets the value of the outputSer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getOutputSer() {
        if (outputSer == null) {
            outputSer = new ArrayList<DoubleArray>();
        }
        return this.outputSer;
    }

    /**
     * Gets the value of the outputTour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputTour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputTour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getOutputTour() {
        if (outputTour == null) {
            outputTour = new ArrayList<DoubleArray>();
        }
        return this.outputTour;
    }

    /**
     * Gets the value of the outputTourR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputTourR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputTourR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getOutputTourR() {
        if (outputTourR == null) {
            outputTourR = new ArrayList<DoubleArray>();
        }
        return this.outputTourR;
    }

    /**
     * Gets the value of the techProgRR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techProgRR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechProgRR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getTechProgRR() {
        if (techProgRR == null) {
            techProgRR = new ArrayList<DoubleArray>();
        }
        return this.techProgRR;
    }

    /**
     * Gets the value of the areaAgri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaAgri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaAgri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaAgri() {
        if (areaAgri == null) {
            areaAgri = new ArrayList<DoubleArray>();
        }
        return this.areaAgri;
    }

    /**
     * Gets the value of the areaAgriR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaAgriR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaAgriR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaAgriR() {
        if (areaAgriR == null) {
            areaAgriR = new ArrayList<DoubleArray>();
        }
        return this.areaAgriR;
    }

    /**
     * Gets the value of the areaCropWheat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropWheat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropWheat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropWheat() {
        if (areaCropWheat == null) {
            areaCropWheat = new ArrayList<DoubleArray>();
        }
        return this.areaCropWheat;
    }

    /**
     * Gets the value of the areaCropCorn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropCorn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropCorn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropCorn() {
        if (areaCropCorn == null) {
            areaCropCorn = new ArrayList<DoubleArray>();
        }
        return this.areaCropCorn;
    }

    /**
     * Gets the value of the areaCropOilseed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropOilseed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropOilseed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropOilseed() {
        if (areaCropOilseed == null) {
            areaCropOilseed = new ArrayList<DoubleArray>();
        }
        return this.areaCropOilseed;
    }

    /**
     * Gets the value of the areaCropOrchard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropOrchard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropOrchard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropOrchard() {
        if (areaCropOrchard == null) {
            areaCropOrchard = new ArrayList<DoubleArray>();
        }
        return this.areaCropOrchard;
    }

    /**
     * Gets the value of the areaCropCotton property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropCotton property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropCotton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropCotton() {
        if (areaCropCotton == null) {
            areaCropCotton = new ArrayList<DoubleArray>();
        }
        return this.areaCropCotton;
    }

    /**
     * Gets the value of the areaCropGreenstuff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropGreenstuff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropGreenstuff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropGreenstuff() {
        if (areaCropGreenstuff == null) {
            areaCropGreenstuff = new ArrayList<DoubleArray>();
        }
        return this.areaCropGreenstuff;
    }

    /**
     * Gets the value of the areaCropWheatR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropWheatR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropWheatR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropWheatR() {
        if (areaCropWheatR == null) {
            areaCropWheatR = new ArrayList<DoubleArray>();
        }
        return this.areaCropWheatR;
    }

    /**
     * Gets the value of the areaCropCornR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropCornR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropCornR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropCornR() {
        if (areaCropCornR == null) {
            areaCropCornR = new ArrayList<DoubleArray>();
        }
        return this.areaCropCornR;
    }

    /**
     * Gets the value of the areaCropOilseedR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropOilseedR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropOilseedR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropOilseedR() {
        if (areaCropOilseedR == null) {
            areaCropOilseedR = new ArrayList<DoubleArray>();
        }
        return this.areaCropOilseedR;
    }

    /**
     * Gets the value of the areaCropOrchardR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropOrchardR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropOrchardR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropOrchardR() {
        if (areaCropOrchardR == null) {
            areaCropOrchardR = new ArrayList<DoubleArray>();
        }
        return this.areaCropOrchardR;
    }

    /**
     * Gets the value of the areaCropCottonR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropCottonR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropCottonR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropCottonR() {
        if (areaCropCottonR == null) {
            areaCropCottonR = new ArrayList<DoubleArray>();
        }
        return this.areaCropCottonR;
    }

    /**
     * Gets the value of the areaCropGreenstuffR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaCropGreenstuffR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaCropGreenstuffR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaCropGreenstuffR() {
        if (areaCropGreenstuffR == null) {
            areaCropGreenstuffR = new ArrayList<DoubleArray>();
        }
        return this.areaCropGreenstuffR;
    }

    /**
     * Gets the value of the areaForest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaForest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaForest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaForest() {
        if (areaForest == null) {
            areaForest = new ArrayList<DoubleArray>();
        }
        return this.areaForest;
    }

    /**
     * Gets the value of the areaGrass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaGrass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaGrass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaGrass() {
        if (areaGrass == null) {
            areaGrass = new ArrayList<DoubleArray>();
        }
        return this.areaGrass;
    }

    /**
     * Gets the value of the areaWater property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaWater property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaWater().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaWater() {
        if (areaWater == null) {
            areaWater = new ArrayList<DoubleArray>();
        }
        return this.areaWater;
    }

    /**
     * Gets the value of the gdp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getGdp() {
        if (gdp == null) {
            gdp = new ArrayList<DoubleArray>();
        }
        return this.gdp;
    }

    /**
     * Gets the value of the gdpPer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdpPer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdpPer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getGdpPer() {
        if (gdpPer == null) {
            gdpPer = new ArrayList<DoubleArray>();
        }
        return this.gdpPer;
    }

    /**
     * Gets the value of the gdpR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdpR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdpR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getGdpR() {
        if (gdpR == null) {
            gdpR = new ArrayList<DoubleArray>();
        }
        return this.gdpR;
    }

    /**
     * Gets the value of the gdpPerR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdpPerR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdpPerR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getGdpPerR() {
        if (gdpPerR == null) {
            gdpPerR = new ArrayList<DoubleArray>();
        }
        return this.gdpPerR;
    }

    /**
     * Gets the value of the channelMain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelMain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelMain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelMain() {
        if (channelMain == null) {
            channelMain = new ArrayList<DoubleArray>();
        }
        return this.channelMain;
    }

    /**
     * Gets the value of the channelBran property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelBran property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelBran().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelBran() {
        if (channelBran == null) {
            channelBran = new ArrayList<DoubleArray>();
        }
        return this.channelBran;
    }

    /**
     * Gets the value of the channelDou property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDou property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelDou().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelDou() {
        if (channelDou == null) {
            channelDou = new ArrayList<DoubleArray>();
        }
        return this.channelDou;
    }

    /**
     * Gets the value of the channelNong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelNong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelNong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelNong() {
        if (channelNong == null) {
            channelNong = new ArrayList<DoubleArray>();
        }
        return this.channelNong;
    }

    /**
     * Gets the value of the channelMao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelMao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelMao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelMao() {
        if (channelMao == null) {
            channelMao = new ArrayList<DoubleArray>();
        }
        return this.channelMao;
    }

    /**
     * Gets the value of the channelMainWUE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelMainWUE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelMainWUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelMainWUE() {
        if (channelMainWUE == null) {
            channelMainWUE = new ArrayList<DoubleArray>();
        }
        return this.channelMainWUE;
    }

    /**
     * Gets the value of the channelBranWUE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelBranWUE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelBranWUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelBranWUE() {
        if (channelBranWUE == null) {
            channelBranWUE = new ArrayList<DoubleArray>();
        }
        return this.channelBranWUE;
    }

    /**
     * Gets the value of the channelDouWUE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDouWUE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelDouWUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelDouWUE() {
        if (channelDouWUE == null) {
            channelDouWUE = new ArrayList<DoubleArray>();
        }
        return this.channelDouWUE;
    }

    /**
     * Gets the value of the channelNongWUE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelNongWUE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelNongWUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelNongWUE() {
        if (channelNongWUE == null) {
            channelNongWUE = new ArrayList<DoubleArray>();
        }
        return this.channelNongWUE;
    }

    /**
     * Gets the value of the channelMaoWUE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelMaoWUE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelMaoWUE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getChannelMaoWUE() {
        if (channelMaoWUE == null) {
            channelMaoWUE = new ArrayList<DoubleArray>();
        }
        return this.channelMaoWUE;
    }

    /**
     * Gets the value of the areaDripIrri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaDripIrri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaDripIrri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAreaDripIrri() {
        if (areaDripIrri == null) {
            areaDripIrri = new ArrayList<DoubleArray>();
        }
        return this.areaDripIrri;
    }

    /**
     * Gets the value of the allowanceInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAllowanceInd() {
        if (allowanceInd == null) {
            allowanceInd = new ArrayList<DoubleArray>();
        }
        return this.allowanceInd;
    }

    /**
     * Gets the value of the allowanceAgr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceAgr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceAgr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAllowanceAgr() {
        if (allowanceAgr == null) {
            allowanceAgr = new ArrayList<DoubleArray>();
        }
        return this.allowanceAgr;
    }

    /**
     * Gets the value of the allowanceSer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceSer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceSer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getAllowanceSer() {
        if (allowanceSer == null) {
            allowanceSer = new ArrayList<DoubleArray>();
        }
        return this.allowanceSer;
    }

    /**
     * Gets the value of the waterAlloMid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterAlloMid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterAlloMid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getWaterAlloMid() {
        if (waterAlloMid == null) {
            waterAlloMid = new ArrayList<DoubleArray>();
        }
        return this.waterAlloMid;
    }

    /**
     * Gets the value of the waterAlloDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterAlloDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterAlloDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getWaterAlloDown() {
        if (waterAlloDown == null) {
            waterAlloDown = new ArrayList<DoubleArray>();
        }
        return this.waterAlloDown;
    }

    /**
     * Gets the value of the waterRight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterRight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getWaterRight() {
        if (waterRight == null) {
            waterRight = new ArrayList<DoubleArray>();
        }
        return this.waterRight;
    }

    /**
     * Gets the value of the waterSavingTechR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterSavingTechR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterSavingTechR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoubleArray }
     * 
     * 
     */
    public List<DoubleArray> getWaterSavingTechR() {
        if (waterSavingTechR == null) {
            waterSavingTechR = new ArrayList<DoubleArray>();
        }
        return this.waterSavingTechR;
    }

}
