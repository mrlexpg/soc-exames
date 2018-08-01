package br.com.soc.desktop.componente;

import java.util.Scanner;

import javax.xml.ws.soap.SOAPFaultException;

import br.com.soc.desktop.ultil.SocExameUltil;
import br.com.soc.persistencia.entidade.Exame;
import br.com.soc.ws.exame.ws.SocExameServer;

public class Pesquisa {
	
	private static Pesquisa instancia = new Pesquisa();
	
	private Pesquisa() {
		
	}

	public static Pesquisa getInstance( ) {
	   return instancia;
	}
	
	protected static void exibirPesquisa(SocExameServer exameWS) {
		
		int parametro;		
		Exame exameConsultado = null;

		do {   
			SocExameUltil.clrscr();						
			System.out.println("\n### Pesquisar exame - 0 p/ retornar ao menu ###");
			System.out.print("\n\nDigite o número da consulta: ");

			Scanner scanner = new Scanner(System.in);
			parametro = scanner.nextInt();

			try {   
				if(parametro != 0) {
					exameConsultado = exameWS.getExame(parametro);
					System.out.println("\n" + exameConsultado.toString() +"\n");
				}
			} catch(SOAPFaultException e) {
				System.out.println("\nNenhum exame encontrado para a consulta " + parametro);
			}
			
		} while (parametro != 0);
	}
}