package br.ufrgs.inf.ex6;

import br.ufrgs.inf.ex4.Produto;
import br.ufrgs.inf.ex4.Servico;
/**
 * Exemplo que importa outro exemplo (4)
 * @author USER
 *
 */
public class Exemplo6 {
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
