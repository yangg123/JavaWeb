
package cn.com.webxml;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />使用本站 WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a> 感谢大家的支持！<br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MobileCodeWS", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "file:/C:/Users/Administrator/Desktop/WSDL/MobileCodeWS.wsdl")
public class MobileCodeWS
    extends Service
{

    private final static URL MOBILECODEWS_WSDL_LOCATION;
    private final static WebServiceException MOBILECODEWS_EXCEPTION;
    private final static QName MOBILECODEWS_QNAME = new QName("http://WebXml.com.cn/", "MobileCodeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Administrator/Desktop/WSDL/MobileCodeWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOBILECODEWS_WSDL_LOCATION = url;
        MOBILECODEWS_EXCEPTION = e;
    }

    public MobileCodeWS() {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation) {
        super(wsdlLocation, MOBILECODEWS_QNAME);
    }

    public MobileCodeWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOBILECODEWS_QNAME, features);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOBILECODEWS_EXCEPTION!= null) {
            throw MOBILECODEWS_EXCEPTION;
        }
        return MOBILECODEWS_WSDL_LOCATION;
    }

}
