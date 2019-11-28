package ufba.composite;
//Herda de Integrante
//possui o atributo experiencia
public abstract class Pessoa extends Integrante{
	protected double experiencia;
	
	public double getExperiencia() {
		return this.experiencia;
	}
}