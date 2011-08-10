package br.ufrgs.inf.ex4;

/**
 * Serviço é um produto contratado por um período de 
 * um ou mais meses. 
 * @author Alexandre Torres
 */
public class Servico extends Produto {
	protected int nroMeses;
	public Servico(double valor,int comissao,int nroMeses) {	    
		super(valor,comissao);
		this.nroMeses = nroMeses;		
	}
	/**
	 * A comissão de serviço é baseada no número de meses 
	 * contratado e valor.
	 * @return comissão sobre valor
	 */
    public double calculaComissao() {
    	// faz um 'Override'
    	return nroMeses*super.calculaComissao();
    	//return nroMeses*valor*(comissao/100.0);
    }
}
