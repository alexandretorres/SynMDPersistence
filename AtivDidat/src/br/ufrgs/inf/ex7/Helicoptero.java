package br.ufrgs.inf.ex7;

public class Helicoptero extends VeiculoVoador implements Motorizado {
	public Helicoptero(int altitudeMaxima) throws Exception {
		super(altitudeMaxima);
	}
	public long tempoPercursso(long distancia) {
		return 0;
	}
	public void acelere(double aceleracao) {

	}
	public void desacelere(double aceleracao) {
		
	}

}
