package br.com.soc.ws.exame.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.soc.persistencia.entidade.Consulta;
import br.com.soc.persistencia.entidade.Consultas;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.persistencia.entidade.Exames;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface SocExameServer{
 
	@WebMethod (operationName="getExame") Exame getExame(Integer numeroExame);

	@WebMethod (operationName="getAllExame") Exames getAllExame();
	
	@WebMethod (operationName="getConsulta") Consulta getConsulta(Integer numeroConsulta);
	
	@WebMethod (operationName="getAllConsulta") Consultas getAllConsulta();
}