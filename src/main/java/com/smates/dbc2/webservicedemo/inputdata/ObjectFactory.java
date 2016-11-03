
package com.smates.dbc2.webservicedemo.inputdata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smates.dbc2.webservicedemo.inputdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InputData_QNAME = new QName("http://service.hhs.com/", "inputData");
    private final static QName _InputDataResponse_QNAME = new QName("http://service.hhs.com/", "inputDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smates.dbc2.webservicedemo.inputdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoubleArray }
     * 
     */
    public DoubleArray createDoubleArray() {
        return new DoubleArray();
    }

    /**
     * Create an instance of {@link InputDataResponse }
     * 
     */
    public InputDataResponse createInputDataResponse() {
        return new InputDataResponse();
    }

    /**
     * Create an instance of {@link InputData }
     * 
     */
    public InputData createInputData() {
        return new InputData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "inputData")
    public JAXBElement<InputData> createInputData(InputData value) {
        return new JAXBElement<InputData>(_InputData_QNAME, InputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "inputDataResponse")
    public JAXBElement<InputDataResponse> createInputDataResponse(InputDataResponse value) {
        return new JAXBElement<InputDataResponse>(_InputDataResponse_QNAME, InputDataResponse.class, null, value);
    }

}
