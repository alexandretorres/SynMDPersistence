package br.ufrgs.inf.ex7;

public class Bicicleta extends Veiculo implements ComRodas {
	public String modelo;
	public long tempoPercursso(long distancia) {
		return 0;
	}
	public int getRodas() {
		return 2;
	}
}
