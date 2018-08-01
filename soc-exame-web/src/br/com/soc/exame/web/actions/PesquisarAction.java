package br.com.soc.exame.web.actions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import br.com.soc.exame.web.servico.SocExameConexaoWS;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.ws.exame.ws.SocExameServer;


@Action(value = "pesquisarExame", results = {
		@Result(name = "SUCCESS", location = "/listaExame.jsp"),
		@Result(name = "ERROR", location = "/errorPadrao.jsp")})
@Namespaces(value={@Namespace("/User"),@Namespace("/")})
public class PesquisarAction {

	private String idConsulta;	
	private List<Exame> exames;
	
	public String execute() throws Exception {
		
		SocExameConexaoWS servico;
		SocExameServer exameWS;
		
		try {    	
			servico = new SocExameConexaoWS();
			exameWS = servico.abrirConexaoWS();
			Exame exameConsultado = exameWS.getExame(Integer.parseInt(getIdConsulta()));
			exames = new ArrayList<Exame>();
			exames.add(exameConsultado);
		} catch(SOAPFaultException e) {
			return "ERROR";
		}
		
		return "SUCCESS";
	}

	public List<Exame> getExames() {
		return exames;
	}
	
	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}	
}