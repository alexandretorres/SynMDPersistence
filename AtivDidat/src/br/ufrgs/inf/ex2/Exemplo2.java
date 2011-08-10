package br.ufrgs.inf.ex2;

public class Exemplo2 {
	/**
	 * Cria um carro e imprime comissão
	 */
	public static void main(String[] args) {		
		Produto carro = new Produto(45199.00,10);
		Servico tvCabo = new Servico(90,5,12);		
		//imprime comissão
		System.out.println("Comissões \ncarro: "+carro.calculaComissao());
		System.out.println("Tv à cabo: "+tvCabo.calculaComissao());
		
	}
}
