package br.ufrgs.inf.ex7;

public class Aviao extends VeiculoVoador implements Motorizado,ComRodas {
	public int rodas;
	
	public Aviao(int altitudeMaxima) throws Exception {
		super(altitudeMaxima);
		rodas=3;
	}
	public Aviao(int altitudeMaxima,int rodas) throws Exception {
		super(altitudeMaxima);
		this.rodas=rodas;
	}
	public long tempoPercursso(long distancia) {
		return 0;
	}
	public void acelere(double aceleracao) {
		
	}	
	public void desacelere(double aceleracao) {

	}
	public int getRodas() {
		return rodas;
	}

}
