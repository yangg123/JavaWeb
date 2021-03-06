
package com.render.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceImpl", targetNamespace = "http://webservice.render.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceImpl {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://webservice.render.com/", className = "com.render.webservice.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://webservice.render.com/", className = "com.render.webservice.SaveResponse")
    @Action(input = "http://webservice.render.com/WebServiceImpl/saveRequest", output = "http://webservice.render.com/WebServiceImpl/saveResponse")
    public String save(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://webservice.render.com/", className = "com.render.webservice.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://webservice.render.com/", className = "com.render.webservice.SayHelloResponse")
    @Action(input = "http://webservice.render.com/WebServiceImpl/sayHelloRequest", output = "http://webservice.render.com/WebServiceImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
