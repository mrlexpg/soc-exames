package br.com.soc.desktop.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.soc.ws.exame.ws.SocExameServer;

public class SocExameConexaoWS {
		 
	public SocExameServer abrirConexaoWS() {
	
		URL url;
		SocExameServer examews = null;
		
		try {
			url = new URL("http://localhost:8889/ws/socexame?wsdl");
			QName qname = new QName("http://ws.exame.ws.soc.com.br/","SocExameImplService");
		    Service service = Service.create(url, qname);
		    examews = service.getPort(SocExameServer.class);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			    
	    return examews;
	}	
}