package br.ufrgs.inf.ex7;

public class Automovel extends Veiculo implements ComEixos,Motorizado{
	public boolean freioDeMaoPuxado=false;
	public long tempoPercursso(long distancia) {	
		return 0;
	}
	public int getEixos() {	
		return 2;
	}	
	public int getRodas() {
		return 4;
	}		
	public void mova() {
		if (!freioDeMaoPuxado)
			super.mova();
	}
	public void acelere(double aceleracao) {
		if (!freioDeMaoPuxado)
			setVelocidade(getVelocidade()+aceleracao);		
	}
	public void desacelere(double aceleracao) {
		setVelocidade(getVelocidade()-aceleracao);		
	}
}
