package br.ufrgs.inf.ex1;

public class Produto {
	double valor;
    int comissao;     
    // Calcula o valor da comissao
    double calculaComissao() {
    	return valor*(comissao/100.0);
    }
}
