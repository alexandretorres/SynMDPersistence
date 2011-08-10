package br.ufrgs.inf.ex3;

public class Produto {
	double valor;
    int comissao;     
    public Produto(double valor,int comissao) {
    	this.valor = valor;
    	this.comissao = comissao;
    }
    /**
     * A comissão do produto é baseada no valor da venda
     * @return comissão sobre valor
     */
    public double calculaComissao() {
    	return valor*(comissao/100.0);
    }
}
