package br.com.soc.desktop.componente;

import java.util.List;
import java.util.Scanner;

import javax.xml.ws.soap.SOAPFaultException;

import br.com.soc.desktop.ultil.SocExameUltil;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.persistencia.entidade.Exames;
import br.com.soc.ws.exame.ws.SocExameServer;

public class ListaExame {

	private static ListaExame instancia = new ListaExame();

	private ListaExame() {	}

	public static ListaExame getInstance( ) {
		return instancia;
	}

	protected static void exibirTodosExames(SocExameServer exameWS) {

		SocExameUltil.clrscr();
		System.out.println("\n### Listar exames cadastrado ###\n");

		try {    	
			Exames listaExames = exameWS.getAllExame();
			List<Exame> exames = listaExames.getExames();
			System.out.println("Encontrado " + exames.size() + " exames cadastrados\n");
			exames.stream().forEach(item -> System.out.println(item.toString()));
		} catch(SOAPFaultException e) {
			System.out.println("\nNenhum exame encontrado .");
		}
		
		System.out.println("\nPressione qualquer tecla para voltar ao menu....");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
}