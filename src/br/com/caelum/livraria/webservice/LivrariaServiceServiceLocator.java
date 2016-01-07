/**
 * LivrariaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.webservice;

public class LivrariaServiceServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.livraria.webservice.LivrariaServiceService {

    public LivrariaServiceServiceLocator() {
    }


    public LivrariaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivrariaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivrariaServicePort
    private java.lang.String LivrariaServicePort_address = "http://localhost:8080/ejb-livraria/LivrariaService";

    public java.lang.String getLivrariaServicePortAddress() {
        return LivrariaServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivrariaServicePortWSDDServiceName = "LivrariaServicePort";

    public java.lang.String getLivrariaServicePortWSDDServiceName() {
        return LivrariaServicePortWSDDServiceName;
    }

    public void setLivrariaServicePortWSDDServiceName(java.lang.String name) {
        LivrariaServicePortWSDDServiceName = name;
    }

    public br.com.caelum.livraria.webservice.LivrariaService getLivrariaServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivrariaServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivrariaServicePort(endpoint);
    }

    public br.com.caelum.livraria.webservice.LivrariaService getLivrariaServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.livraria.webservice.LivrariaServiceServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivrariaServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivrariaServicePortEndpointAddress(java.lang.String address) {
        LivrariaServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.livraria.webservice.LivrariaService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.livraria.webservice.LivrariaServiceServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaServiceServiceSoapBindingStub(new java.net.URL(LivrariaServicePort_address), this);
                _stub.setPortName(getLivrariaServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LivrariaServicePort".equals(inputPortName)) {
            return getLivrariaServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivrariaServicePort".equals(portName)) {
            setLivrariaServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
