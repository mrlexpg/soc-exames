package br.com.soc.exame.web.actions;

import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.web.servico.SocExameConexaoWS;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.persistencia.entidade.Exames;
import br.com.soc.ws.exame.ws.SocExameServer;

@Namespaces(value={@Namespace("/User"),@Namespace("/")})
@Result(location="/login.jsp")
@Actions(value={@Action(""),@Action("home")})
public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = -2570814714973976310L;

	private List<Exame> exames;

	@Action(value = "listar", results = {
			@Result(name = "ok", location = "/listaExame.jsp"),
			@Result(name = "nok", location = "/errorPadrao.jsp")})
	public String lista() {

		SocExameConexaoWS servico;
		SocExameServer exameWS;

		try {    	
			servico = new SocExameConexaoWS();
			exameWS = servico.abrirConexaoWS();
			Exames listaExames = exameWS.getAllExame();
			exames = listaExames.getExames();			
		} catch(SOAPFaultException e) {
			return "nok";
		}

		return "ok";
	}

	@Action(value = "pesquisar", results = {
			@Result(name = "ok", location = "/pesquisaExame.jsp")})
	public String pesquisar() {
		return "ok";
	}


	public List<Exame> getExames() {
		return exames;
	}
}