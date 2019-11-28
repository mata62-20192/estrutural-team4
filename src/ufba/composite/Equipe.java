package ufba.composite;

public class Equipe extends IntegranteComposite {
	String nome;
	public Equipe(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}	
}