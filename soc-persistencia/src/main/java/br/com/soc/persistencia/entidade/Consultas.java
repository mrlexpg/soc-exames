package br.com.soc.persistencia.entidade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "consulta")
@XmlAccessorType (XmlAccessType.FIELD)
public class Consultas {
	
	@XmlElement(name = "consulta")
    private List<Consulta> consultas = null;
	
	public List<Consulta> getExames() {
        return consultas;
    }
 
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}