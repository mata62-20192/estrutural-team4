package ufba.composite;

public class EstatisticasFinanceiras {
	//Apenas uma fun��o para todos
	public static void imprimeCustoProjeto(Integrante integrante) {
		System.out.println("Custo de " + integrante.getNome() + ": " + integrante.getSalario());
	}

}