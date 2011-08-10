package br.ufrgs.inf.poker.exemplo;

import br.ufrgs.inf.poker.*;
import br.ufrgs.inf.poker.exemplo.JogoVerde;

public class JogoAzul extends TrocaAzul  {	
	public As troca(Copas copas) {		
		return null; // Não realizamos esta troca
	}
	public Numero troca(As as){
		as.troca(DOIS_OUROS);	//Trocamos um "as" por nosso 2 de ouros	
		return DOIS_OUROS;		
	}
	public Mao jogo() {		
		Carta[] cartas = new Carta[5];
		JogoVerde verde = new JogoVerde();
		cartas[0] = verde.troca(DOIS_OUROS);
		cartas[1] = AS_ESPADAS;
		cartas[2] = AS_OUROS;
		cartas[3] = AS_PAUS;
		cartas[4] = TRES_OUROS;
		return new Mao(cartas);
	}
}
