package br.ufrgs.inf.ex7;

public class Caminhao extends Automovel {
	private int eixos=2;
	private int rodas=4;	
	public long tempoPercursso(long distancia) {
		// TODO Auto-generated method stub
		return 0;
	}	
	public int getEixos() {	
		return eixos;
	}	
	public int getRodas() {	
		return rodas;
	}	
	// Do caminhão
	public void setEixos(int eixos) {
		this.eixos = eixos;
		rodas = eixos*2;
	}
	public double calculaPedagio(double valorBase) {
		return valorBase*eixos;
	}
}
