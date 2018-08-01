package br.com.soc.desktop.componente;

import java.util.Scanner;

import javax.xml.ws.WebServiceException;

import br.com.soc.desktop.service.SocExameConexaoWS;
import br.com.soc.desktop.ultil.SocExameUltil;
import br.com.soc.ws.exame.ws.SocExameServer;

public class Menu {

	private SocExameConexaoWS servico;

	private SocExameServer exameWS;

	public Menu() {
		this.servico = new SocExameConexaoWS();
	}

	public void exibirMenu() { 

		int opcao;
		
		try {

			System.out.println("### SOCEXAME - Sistema de consulta de Exames ###");			
			System.out.println("\nBuscando serviço online....");
			
			do {
				
				SocExameUltil.clrscr();								
				this.exameWS = servico.abrirConexaoWS();				
				
				System.out.println("=========================");
				System.out.println("|     1 - Pesquisar     |");
				System.out.println("|     2 - Incluir       |");
				System.out.println("|     3 - Alterar       |");
				System.out.println("|     4 - Excluir       |");
				System.out.println("|     5 - Listar Exames |");
				System.out.println("|     0 - Sair          |");
				System.out.println("=========================");

				System.out.print("Digite uma opção: ");						
				
				Scanner scanner = new Scanner(System.in);
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					Pesquisa opcaoPesquisar = Pesquisa.getInstance();
					opcaoPesquisar.exibirPesquisa(exameWS);
					break;
				case 2:
					SocExameUltil.clrscr();	
					System.out.println("\n### Incluir exame - Opção disponivel na proxima versão!\n");
					System.out.println("Pressione enter para voltar ao menu....");
					scanner = null;
					scanner = new Scanner(System.in);
					scanner.nextLine();
					break;
				case 3:
					SocExameUltil.clrscr();	
					System.out.println("\n### Alterar exame - Opção disponivel na proxima versão!\n");
					System.out.println("Pressione enter para voltar ao menu....");
					scanner = null;
					scanner = new Scanner(System.in);
					scanner.nextLine();
					break;
				case 4:
					SocExameUltil.clrscr();	
					System.out.println("\n### Excluir exame - Opção disponivel na proxima versão!\n");
					System.out.println("Pressione enter para voltar ao menu....");
					scanner = null;
					scanner = new Scanner(System.in);
					scanner.nextLine();	
					break;
				case 5:
					ListaExame opcaoListarExame = ListaExame.getInstance();
					opcaoListarExame.exibirTodosExames(exameWS);
					break;
				default:
					System.out.println("finalizando programa.... Obrigado!");
					break;
				}
			} while (opcao != 0);

		} catch (WebServiceException we) {
			System.out.println("Erro! \nFalha na conexao do serviço online.");
			System.exit(0);
		}
	}
}