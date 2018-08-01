package br.com.soc.persistencia.entidade;

import java.util.Date;

public class Paciente {

	private Integer idPaciente;
	private String nomePaciente;
	private String siglaSexo;
	private Date dataNascimento;
	private Integer idConvenio;
	private String endereco;
	private Integer numeroRg;
	private String estadoCivil;
	private Integer codigoDdd;
	private Integer telefone;

	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getSiglaSexo() {
		return siglaSexo;
	}
	public void setSiglaSexo(String siglaSexo) {
		this.siglaSexo = siglaSexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getIdConvenio() {
		return idConvenio;
	}
	public void setIdConvenio(Integer idConvenio) {
		this.idConvenio = idConvenio;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumeroRg() {
		return numeroRg;
	}
	public void setNumeroRg(Integer numeroRg) {
		this.numeroRg = numeroRg;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Integer getCodigoDdd() {
		return codigoDdd;
	}
	public void setCodigoDdd(Integer codigoDdd) {
		this.codigoDdd = codigoDdd;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
}