package ufba.decorator.app;

import ufba.decorator.lib.*;

public class Main {
	public static void main(String[] args) {
		//salvo em memoria
		UsuarioDAO usuarioMem = new UsuarioDAOAutenticacaoDecorator(new UsuarioDAOFiltroDecorator(new UsuarioMemoriaDAO()), "192.168.0.100");
		usuarioMem.inserir(Usuario.fromString("joao,joao@joao,Joao da silva"));
		usuarioMem.inserir(Usuario.fromString("maria,maria@maria,Maria da Silva")); //maria teria virgulas a mais, mas meio que bugam,
		
		System.out.println("|Usuario salvo na memoria|\n");
		System.out.println("Username: " + usuarioMem.obter("joao").getUsername());
		System.out.println("E-mail: " + usuarioMem.obter("joao").getEmail());
		System.out.println("Nome completo: " + usuarioMem.obter("joao").getNomeCompleto());
		System.out.println(" ");
		System.out.println("Username: " + usuarioMem.obter("maria").getUsername());
		System.out.println("E-mail: " + usuarioMem.obter("maria").getEmail());
		System.out.println("Nome completo: " + usuarioMem.obter("maria").getNomeCompleto());
		
		usuarioMem.apagarTudo(); 
		
		//Salvo em arquivo
		UsuarioDAO usuarioArq = new UsuarioDAOAutenticacaoDecorator(new UsuarioDAOFiltroDecorator(new UsuarioArquivoDAO()), "192.168.0.100");
		usuarioArq.inserir(Usuario.fromString("joao,joao@joao,Joao da silva"));
		//usuarioArq.inserir(Usuario.fromString("maria,maria@maria,Maria da Silva")); de alguma forma rescreve o arquivo, assim não é possivel obter o usuario via username
		
		System.out.println(" ");
		System.out.println("|Usuarios salvo no arquivo|\n");
		System.out.println("Username: " + usuarioArq.obter("joao").getUsername());
		System.out.println("E-mail:" + usuarioArq.obter("joao").getEmail());
		System.out.println("Nome completo: " + usuarioArq.obter("joao").getNomeCompleto());
		
		usuarioArq.apagarTudo();
	}
}
