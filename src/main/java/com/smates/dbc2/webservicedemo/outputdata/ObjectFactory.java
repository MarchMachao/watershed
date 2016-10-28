
package com.smates.dbc2.webservicedemo.outputdata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smates.dbc2.webservicedemo.outputdata package. 
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

    private final static QName _OutputData_QNAME = new QName("http://service.hhs.com/", "outputData");
    private final static QName _OutputDataResponse_QNAME = new QName("http://service.hhs.com/", "outputDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smates.dbc2.webservicedemo.outputdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputDataResponse }
     * 
     */
    public OutputDataResponse createOutputDataResponse() {
        return new OutputDataResponse();
    }

    /**
     * Create an instance of {@link OutputData }
     * 
     */
    public OutputData createOutputData() {
        return new OutputData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "outputData")
    public JAXBElement<OutputData> createOutputData(OutputData value) {
        return new JAXBElement<OutputData>(_OutputData_QNAME, OutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "outputDataResponse")
    public JAXBElement<OutputDataResponse> createOutputDataResponse(OutputDataResponse value) {
        return new JAXBElement<OutputDataResponse>(_OutputDataResponse_QNAME, OutputDataResponse.class, null, value);
    }

}
