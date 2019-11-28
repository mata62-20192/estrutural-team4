package ufba.composite;

public class Main {
  public static void main(String[] args) {
  	Programador gates = new Programador("Bill Gates", 1.0);
  	Programador allen = new Programador("Paul Allen", 1.2);
  	Programador torvalds = new Programador("Linus Torvalds", 1.5);
  	Programador knuth = new Programador("Donald Knuth", 2.0);
  	
  	Designer ive = new Designer("Jonathan Ive", 1.0);
  	Designer jobs = new Designer("Steve Jobs", 1.5);
  	Designer daVinci = new Designer("Leonardo da Vinci", 2.0);
  	
  	Equipe microsoft = new Equipe("Microsoft");
  	microsoft.add(gates);
  	microsoft.add(allen);
  	
  	Equipe apple = new Equipe("Apple");
  	apple.add(ive);
  	apple.add(jobs);
  	
  	Equipe consorcio = new Equipe("Consorcio");
  	consorcio.add(microsoft);
  	consorcio.add(apple);
  	consorcio.add(torvalds);
  	
    EstatisticasFinanceiras.imprimeCustoProjeto(microsoft);
    EstatisticasFinanceiras.imprimeCustoProjeto(apple);
    EstatisticasFinanceiras.imprimeCustoProjeto(consorcio);
  }
}
