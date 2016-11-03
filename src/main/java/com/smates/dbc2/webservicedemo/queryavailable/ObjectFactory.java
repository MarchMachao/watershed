
package com.smates.dbc2.webservicedemo.queryavailable;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smates.dbc2.webservicedemo.queryavailable package. 
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

    private final static QName _QueryAvailableResponse_QNAME = new QName("http://service.hhs.com/", "queryAvailableResponse");
    private final static QName _QueryAvailable_QNAME = new QName("http://service.hhs.com/", "queryAvailable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smates.dbc2.webservicedemo.queryavailable
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryAvailableResponse }
     * 
     */
    public QueryAvailableResponse createQueryAvailableResponse() {
        return new QueryAvailableResponse();
    }

    /**
     * Create an instance of {@link QueryAvailable }
     * 
     */
    public QueryAvailable createQueryAvailable() {
        return new QueryAvailable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAvailableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "queryAvailableResponse")
    public JAXBElement<QueryAvailableResponse> createQueryAvailableResponse(QueryAvailableResponse value) {
        return new JAXBElement<QueryAvailableResponse>(_QueryAvailableResponse_QNAME, QueryAvailableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "queryAvailable")
    public JAXBElement<QueryAvailable> createQueryAvailable(QueryAvailable value) {
        return new JAXBElement<QueryAvailable>(_QueryAvailable_QNAME, QueryAvailable.class, null, value);
    }

}
