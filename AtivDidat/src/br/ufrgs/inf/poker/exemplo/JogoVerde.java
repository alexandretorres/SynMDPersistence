package br.ufrgs.inf.poker.exemplo;

import br.ufrgs.inf.poker.*;


public class JogoVerde extends TrocaVerde {
	public As troca(Ouros ouros){	 
		ouros.troca(AS_COPAS);
		return AS_COPAS;
	}	
	public Mao jogo() {		
		Carta[] cartas = new Carta[5];
		JogoAzul azul = new JogoAzul();
		cartas[0] = azul.troca((As) AS_COPAS);
		cartas[1] = DOIS_COPAS;
		cartas[2] = OITO_ESPADAS;
		cartas[3] = QUATRO_ESPADAS;
		cartas[4] = DOIS_ESPADAS;
		Mao mao = new Mao(cartas);
		return mao;	
	}	
}
