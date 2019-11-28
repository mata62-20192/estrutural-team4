package ufba.composite;
//Classe a qual todos herdam um nome e o metodo abstrato getSalario
public abstract class Integrante {	
	String nome;
	public String getNome() {
	return this.nome;
	}
	public abstract double getSalario();
}
