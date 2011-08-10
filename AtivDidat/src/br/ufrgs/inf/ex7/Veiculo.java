package br.ufrgs.inf.ex7;

public abstract class Veiculo {
	public int passageiros;	
	private boolean movimento=false;
	private double velocidade;
	// Lógica
	public void mova() {
		setMovimento(true);
	}
	public void pare() {
		setMovimento(false);
	}
	public abstract long tempoPercursso(long distancia);
	
	// Acesso	
	protected void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}
	public boolean isMovimento() {
		return movimento;
	}
	protected void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public double getVelocidade() {
		return velocidade;
	}	
}
