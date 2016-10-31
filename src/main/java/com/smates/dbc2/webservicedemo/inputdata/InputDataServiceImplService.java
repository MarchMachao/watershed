package com.smates.dbc2.webservicedemo.inputdata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-26T12:51:11.224+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "InputDataServiceImplService", 
                  wsdlLocation = "http://210.77.67.251:19001/Webservice-Demo/InputDataServiceWS?wsdl",
                  targetNamespace = "http://impl.service.hhs.com/") 
public class InputDataServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.hhs.com/", "InputDataServiceImplService");
    public final static QName InputDataServiceImplPort = new QName("http://impl.service.hhs.com/", "InputDataServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://210.77.67.251:19001/Webservice-Demo/InputDataServiceWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InputDataServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://210.77.67.251:19001/Webservice-Demo/InputDataServiceWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InputDataServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InputDataServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InputDataServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InputDataServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InputDataServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InputDataServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InputDataService
     */
    @WebEndpoint(name = "InputDataServiceImplPort")
    public InputDataService getInputDataServiceImplPort() {
        return super.getPort(InputDataServiceImplPort, InputDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InputDataService
     */
    @WebEndpoint(name = "InputDataServiceImplPort")
    public InputDataService getInputDataServiceImplPort(WebServiceFeature... features) {
        return super.getPort(InputDataServiceImplPort, InputDataService.class, features);
    }

}