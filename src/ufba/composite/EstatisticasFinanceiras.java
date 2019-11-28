package ufba.composite;

public class EstatisticasFinanceiras {
	//Apenas uma função para todos
	public static void imprimeCustoProjeto(Integrante integrante) {
		System.out.println("Custo de " + integrante.getNome() + ": " + integrante.getSalario());
	}

}