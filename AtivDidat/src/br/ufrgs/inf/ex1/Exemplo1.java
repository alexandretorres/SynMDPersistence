package br.ufrgs.inf.ex1;

public class Exemplo1 {
	/**
	 * Cria um carro e imprime comiss�o
	 */
	public static void main(String[] args) {
		Produto carro;
		//Cria Produto
		carro = new Produto();
		//atribui valor e comiss�o
		carro.valor=45199.00;
		carro.comissao=10;
		//imprime comiss�o - alterei		
		System.out.println("comiss�o �: "+carro.calculaComissao());
		System.out.println("teste");
		
	}
}
