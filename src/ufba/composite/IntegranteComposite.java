package ufba.composite;

import java.util.ArrayList;

public class IntegranteComposite extends Integrante {
	
	private ArrayList<Integrante> integrantes = new ArrayList<Integrante>();
	
	public void add(Integrante integrante) {
		integrantes.add(integrante);
	}

	public void remove(Integrante integrante) {
		integrantes.remove(integrante);
	}	
	public double getSalario() {
		double soma = 0;
		for(Integrante integrantes: integrantes)
			soma += integrantes.getSalario();
		return soma;
	}
}
