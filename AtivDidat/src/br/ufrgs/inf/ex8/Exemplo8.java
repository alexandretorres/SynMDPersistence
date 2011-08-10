package br.ufrgs.inf.ex8;

public class Exemplo8 {
	public static void main(String[] args) {		
		Conversor cv1 = Conversor.getConversor();
		char[] ex = cv1.converter("ola");
		System.out.println("primeiro char:"+ex[0]);	
		
	}
}
