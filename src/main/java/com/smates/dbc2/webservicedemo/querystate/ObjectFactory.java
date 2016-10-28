
package com.smates.dbc2.webservicedemo.querystate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smates.dbc2.webservicedemo.querystate package. 
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

    private final static QName _QueryStateResponse_QNAME = new QName("http://service.hhs.com/", "queryStateResponse");
    private final static QName _QueryState_QNAME = new QName("http://service.hhs.com/", "queryState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smates.dbc2.webservicedemo.querystate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryStateResponse }
     * 
     */
    public QueryStateResponse createQueryStateResponse() {
        return new QueryStateResponse();
    }

    /**
     * Create an instance of {@link QueryState }
     * 
     */
    public QueryState createQueryState() {
        return new QueryState();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "queryStateResponse")
    public JAXBElement<QueryStateResponse> createQueryStateResponse(QueryStateResponse value) {
        return new JAXBElement<QueryStateResponse>(_QueryStateResponse_QNAME, QueryStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hhs.com/", name = "queryState")
    public JAXBElement<QueryState> createQueryState(QueryState value) {
        return new JAXBElement<QueryState>(_QueryState_QNAME, QueryState.class, null, value);
    }

}
