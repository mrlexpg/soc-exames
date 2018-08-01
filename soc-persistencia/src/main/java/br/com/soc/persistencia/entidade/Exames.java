package br.com.soc.persistencia.entidade;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exames")
@XmlAccessorType (XmlAccessType.FIELD)
public class Exames {
	
	@XmlElement(name = "exame")
    private List<Exame> exames = null;
	
	public List<Exame> getExames() {
        return exames;
    }
 
    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
}