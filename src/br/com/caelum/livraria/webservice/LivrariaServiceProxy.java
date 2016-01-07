package br.com.caelum.livraria.webservice;

public class LivrariaServiceProxy implements br.com.caelum.livraria.webservice.LivrariaService {
  private String _endpoint = null;
  private br.com.caelum.livraria.webservice.LivrariaService livrariaService = null;
  
  public LivrariaServiceProxy() {
    _initLivrariaServiceProxy();
  }
  
  public LivrariaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivrariaServiceProxy();
  }
  
  private void _initLivrariaServiceProxy() {
    try {
      livrariaService = (new br.com.caelum.livraria.webservice.LivrariaServiceServiceLocator()).getLivrariaServicePort();
      if (livrariaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livrariaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livrariaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livrariaService != null)
      ((javax.xml.rpc.Stub)livrariaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.livraria.webservice.LivrariaService getLivrariaService() {
    if (livrariaService == null)
      _initLivrariaServiceProxy();
    return livrariaService;
  }
  
  public br.com.caelum.livraria.webservice.Livro[] getLivrosbyTitle(java.lang.String titulo) throws java.rmi.RemoteException{
    if (livrariaService == null)
      _initLivrariaServiceProxy();
    return livrariaService.getLivrosbyTitle(titulo);
  }
  
  
}