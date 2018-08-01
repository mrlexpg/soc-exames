package br.com.soc.ws.exame.endpoint;
 
import javax.xml.ws.Endpoint;
import br.com.soc.ws.exame.ws.SocExameImpl;
 
//Endpoint publisher
public class SocExamePublisher{
 
	public static void main(String[] args) {
	   System.out.println("Inicializando a publicacao do servico socexame...");
	   Endpoint.publish("http://localhost:8889/ws/socexame", new SocExameImpl());
    }
 
}