package br.ufrgs.inf.ex3;

public class Exemplo3 {
	/**
	 * Cria um carro e imprime comissão
	 */
	public static void main(String[] args) {
		Produto carro;
		//Cria Produto
		carro = new Produto(45199.00,10);
		//imprime comissão
		System.out.println("comissão: "+carro.calculaComissao());
		
	}
}
