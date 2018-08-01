package br.com.soc.ws.exame.ws;
 
import java.util.List;

import javax.jws.WebService;

import br.com.soc.persistencia.dao.ConsultaDao;
import br.com.soc.persistencia.dao.ExameDao;
import br.com.soc.persistencia.entidade.Consulta;
import br.com.soc.persistencia.entidade.Consultas;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.persistencia.entidade.Exames;

 
//Service Implementation
@WebService(endpointInterface = "br.com.soc.ws.exame.ws.SocExameServer")
public class SocExameImpl implements SocExameServer{

	private ExameDao exameDao;
	
	private ConsultaDao consultaDao;

	@Override
	public Exame getExame(Integer numeroExame) {

		Exame resultadoExame = null;

		try {
			exameDao = new ExameDao();
			resultadoExame = exameDao.findExameById(numeroExame);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		return resultadoExame;
	}

	@Override
	public Exames getAllExame() {
		
		Exames exames = null;

		try {
			exameDao = new ExameDao();
			List<Exame> listaExames = exameDao.findAll();
			exames = new Exames();
			exames.setExames(listaExames);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		return exames;
	}

	@Override
	public Consulta getConsulta(Integer numeroConsulta) {
		
		Consulta diagnostico = null;

		try {
			consultaDao = new ConsultaDao();
			diagnostico = consultaDao.findConsultaById(numeroConsulta);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		return diagnostico;
	}

	@Override
	public Consultas getAllConsulta() {
		
		Consultas consultas = null;

		try {
			consultaDao = new ConsultaDao();
			List<Consulta> listaConsulta = consultaDao.findAll();
			consultas = new Consultas();
			consultas.setConsultas(listaConsulta);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		return consultas;
	}
}