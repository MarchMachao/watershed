package com.smates.dbc2.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-06T17:26:16.647+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "RisDSSModelServiceImplService", 
                  wsdlLocation = "http://210.77.67.251:8000/Webservice-Demo/RisDSSModelServiceWS?wsdl",
                  targetNamespace = "http://impl.service.hhs.com/") 
public class RisDSSModelServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.hhs.com/", "RisDSSModelServiceImplService");
    public final static QName RisDSSModelServiceImplPort = new QName("http://impl.service.hhs.com/", "RisDSSModelServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://210.77.67.251:8000/Webservice-Demo/RisDSSModelServiceWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RisDSSModelServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://210.77.67.251:8000/Webservice-Demo/RisDSSModelServiceWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RisDSSModelServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RisDSSModelServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RisDSSModelServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public RisDSSModelServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RisDSSModelServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RisDSSModelServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns RisDSSModelService
     */
    @WebEndpoint(name = "RisDSSModelServiceImplPort")
    public RisDSSModelService getRisDSSModelServiceImplPort() {
        return super.getPort(RisDSSModelServiceImplPort, RisDSSModelService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RisDSSModelService
     */
    @WebEndpoint(name = "RisDSSModelServiceImplPort")
    public RisDSSModelService getRisDSSModelServiceImplPort(WebServiceFeature... features) {
        return super.getPort(RisDSSModelServiceImplPort, RisDSSModelService.class, features);
    }

}
