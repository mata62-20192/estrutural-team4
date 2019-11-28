package ufba.composite;
//Uma classe que herda de IntegranteComposto
//ArrayList que pode receber Pessoas ou Equipes
public class Equipe extends IntegranteComposite {
	public Equipe(String nome) {
		this.nome = nome;
	}	
}