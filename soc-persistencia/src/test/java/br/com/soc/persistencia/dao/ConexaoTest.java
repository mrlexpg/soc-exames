package br.com.soc.persistencia.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.soc.persistencia.entidade.Exame;

public class ConexaoTest {

	ExameDao exameDao;
	
	@Before
	public void setUP() {
		exameDao = new ExameDao();
	}
	
	@Test
	public void testTentandoConexaoOk() throws Exception {
		System.out.println("Procurando arquivo properties e tentando conexao");
		Conexao instance = new Conexao();
		instance.open();
		assertNotNull(instance.con);
	}
	
	@Test
	public void testGetExameOk() throws Exception{
		System.out.println("Procurando exame....");
		Exame resultado = exameDao.findExameById(10);
		if(resultado != null) {
			System.out.println(resultado.toString());
		}
		assertNotNull(resultado);
	}
	
	@Test
	public void testGetExameNOk() throws Exception{
		System.out.println("Procurando exame que nao existe....");
		Exame resultado = exameDao.findExameById(99);
		assertNull(resultado);
	}
	
	@Test
	public void testGetAllExameOk() throws Exception{
		System.out.println("Procurando todos os exames....");
		List<Exame> listaResultado = exameDao.findAll();
		if(listaResultado != null) {
			listaResultado.stream().forEach(item -> System.out.println(item.toString()));
		}
		assertNull(listaResultado);
	}
}
