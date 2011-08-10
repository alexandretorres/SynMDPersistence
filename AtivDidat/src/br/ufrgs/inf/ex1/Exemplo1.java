package br.ufrgs.inf.ex1;

public class Exemplo1 {
	/**
	 * Cria um carro e imprime comissão
	 */
	public static void main(String[] args) {
		Produto carro;
		//Cria Produto
		carro = new Produto();
		//atribui valor e comissão
		carro.valor=45199.00;
		carro.comissao=10;
		//imprime comissão
		System.out.println("comissão: "+carro.calculaComissao());
		
	}
}
