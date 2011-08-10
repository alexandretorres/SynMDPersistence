package br.ufrgs.inf.ex7;

public abstract class VeiculoVoador extends Veiculo {
	public static final int LIMITE_ATMOSFERICO = 15000;
	int altitudeMaxima;
	private boolean voando=false;
	private int altitude=0;
	
	public VeiculoVoador(int altitudeMaxima) throws Exception {
		if (altitudeMaxima>LIMITE_ATMOSFERICO)
			throw new Exception("altitude "+altitudeMaxima+" excede o limite atmosférico");
	}
	protected void setVoando(boolean voando) {
		this.voando = voando;
	}
	public boolean isVoando() {
		return voando;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getAltitude() {
		return altitude;
	}	
	public void voe() {
		setVoando(true);
	}
	public void pouse() {
		setVoando(false);
	}	
}
