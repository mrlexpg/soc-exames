package br.com.soc.persistencia.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "consulta")
@XmlAccessorType (XmlAccessType.FIELD)
public class Consulta {
	
	private Integer idConsulta;
	private Integer idPaciente;
	private Integer idMedico;
	private Date dataConsulta;
	private String diagnostico;
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		return "Consulta [idConsulta:  "+ idConsulta + " ,idPaciente: " + idPaciente +" ,idMedico: " + idMedico +"data-consulta: " + sdf.format(dataConsulta)+ " ,diagnostico: " + diagnostico+ "]";
	}
	
	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
}