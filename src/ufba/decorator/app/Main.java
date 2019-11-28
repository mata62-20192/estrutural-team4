package ufba.decorator.app;

import ufba.decorator.lib.*;

public class Main {
	public static void main(String[] args) {
		//teste inicial
		UsuarioDAO usuarioMem = new UsuarioDAOAutenticacaoDecorator(new UsuarioDAOFiltroDecorator(new UsuarioMemoriaDAO()), "192.168.0.100");
		usuarioMem.inserir(Usuario.fromString("team4,team4@matc62,Equipe Projeto Incremental team4"));
		//virgula a mais
		usuarioMem.inserir(Usuario.fromString("team4,,team4@matc62,,Equipe Projeto Incremental team4"));
		
		System.out.println(usuarioMem.obter("team4").getUsername());
		System.out.println(usuarioMem.obter("team4").getEmail());
		System.out.println(usuarioMem.obter("team4").getNomeCompleto());
		usuarioMem.apagarTudo();
		
		UsuarioDAO usuarioArq = new UsuarioDAOAutenticacaoDecorator(new UsuarioDAOFiltroDecorator(new UsuarioArquivoDAO()), "192.168.0.100");
		usuarioArq.inserir(Usuario.fromString("team4,team4@matc62,Equipe Projeto Incremental team4"));
		usuarioArq.inserir(Usuario.fromString("team4,,team4@matc62,,Equipe Projeto Incremental team4"));
		
	}
}
