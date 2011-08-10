package br.ufrgs.inf.ex4;

public class Exemplo4 {
	/**
	 * Cria um carro e imprime comissão
	 */
	public static void main(String[] args) {		
		Produto meuProduto;
		// $250, 10%
		meuProduto = new Produto(250,10);
		System.out.println("Comissão 1: "+meuProduto.calculaComissao());
		// $250, 10%, 3 parcelas
		meuProduto = new Servico(250,10,3);		
		System.out.println("Comissão 2: "+meuProduto.calculaComissao());		
	}
}
