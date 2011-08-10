package br.ufrgs.inf.ex4;

public class Exemplo5 {
	/**
	 * Cria um carro e imprime comissão
	 */
	public static void main(String[] args) {		
		Servico meuServico = new Servico(250,10,3); 
		Produto meuProduto = meuServico;
		System.out.println("Comissão "+meuProduto.calculaComissao());
		System.out.println(" é igual a comissão "+meuServico.calculaComissao());
	}
}
