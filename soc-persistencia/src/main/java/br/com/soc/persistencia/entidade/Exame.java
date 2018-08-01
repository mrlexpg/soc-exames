package br.com.soc.persistencia.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exame")
@XmlAccessorType (XmlAccessType.FIELD)
public class Exame {

	private Integer idConsulta;
	private String tipoExame;
	private Date dataExame;
	private String resultado;
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		return "Exame [idConsulta:  "+ idConsulta + " ,tipo-exame: " + tipoExame +" ,data-exame: " + sdf.format(dataExame)+ " ,resultado: " + resultado+ "]";
	}
	
	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}
	public String getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	public Date getDataExame() {
		return dataExame;
	}
	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}	
}