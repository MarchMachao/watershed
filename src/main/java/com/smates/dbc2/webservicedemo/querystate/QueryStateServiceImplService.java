package com.smates.dbc2.webservicedemo.querystate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-26T12:52:48.935+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "QueryStateServiceImplService", 
                  wsdlLocation = "http://210.77.67.251:19001/Webservice-Demo/QueryStateServiceWS?wsdl",
                  targetNamespace = "http://impl.service.hhs.com/") 
public class QueryStateServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.hhs.com/", "QueryStateServiceImplService");
    public final static QName QueryStateServiceImplPort = new QName("http://impl.service.hhs.com/", "QueryStateServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://210.77.67.251:19001/Webservice-Demo/QueryStateServiceWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QueryStateServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://210.77.67.251:19001/Webservice-Demo/QueryStateServiceWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QueryStateServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QueryStateServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryStateServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStateServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStateServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStateServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns QueryStateService
     */
    @WebEndpoint(name = "QueryStateServiceImplPort")
    public QueryStateService getQueryStateServiceImplPort() {
        return super.getPort(QueryStateServiceImplPort, QueryStateService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryStateService
     */
    @WebEndpoint(name = "QueryStateServiceImplPort")
    public QueryStateService getQueryStateServiceImplPort(WebServiceFeature... features) {
        return super.getPort(QueryStateServiceImplPort, QueryStateService.class, features);
    }

}
