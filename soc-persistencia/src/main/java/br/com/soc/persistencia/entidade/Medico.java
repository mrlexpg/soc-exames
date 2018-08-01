package br.com.soc.persistencia.entidade;

public class Medico {
	
	private Integer idMedico;
	private String nomeMedico;
	
	public Integer getCodigoMedico() {
		return idMedico;
	}
	public void setCodigoMedico(Integer codigoMedico) {
		this.idMedico = codigoMedico;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
}