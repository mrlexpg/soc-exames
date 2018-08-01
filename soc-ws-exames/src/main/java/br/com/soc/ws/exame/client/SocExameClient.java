package br.com.soc.ws.exame.client;
 
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.persistencia.entidade.Exames;
import br.com.soc.ws.exame.ws.SocExameServer;
 
public class SocExameClient{
 
	public static void main(String[] args) throws Exception {
 
		URL url = new URL("http://localhost:8889/ws/socexame?wsdl");
		
        QName qname = new QName("http://ws.exame.ws.soc.com.br/","SocExameImplService");
 
        Service service = Service.create(url, qname);
 
        SocExameServer examews = service.getPort(SocExameServer.class);
 
        System.out.println(examews.getExame(9) + "\n\nLista de todos os exames: \n");
        
        Exames listaExames = examews.getAllExame();
        
        List<Exame> exames = listaExames.getExames();
                       
        exames.stream().forEach(item -> System.out.println(item.toString()));
    }
}