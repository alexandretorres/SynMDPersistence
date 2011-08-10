package br.ufrgs.inf.poker.partida1;

import br.ufrgs.inf.poker.*;
import br.ufrgs.inf.poker.partida1.verde.JogoVerde;
import br.ufrgs.inf.poker.partida1.amarelo.JogoAmarelo;
import br.ufrgs.inf.poker.partida1.azul.JogoAzul;
import br.ufrgs.inf.poker.partida1.vermelho.JogoVermelho;

public class Partida1 {	
	public void executa() {
		Mao maoAmarelo = new JogoAmarelo().jogo();
		Mao maoAzul = new JogoAzul().jogo();
		Mao maoVerde = new JogoVerde().jogo();
		Mao maoVermelho = new JogoVermelho().jogo();
		//resultados
		System.out.println("Jogo Amarelo");
		maoAmarelo.print();
		System.out.println("Jogo Azul");
		maoAzul.print();
		System.out.println("Jogo Verde");
		maoVerde.print();
		System.out.println("Jogo Vermelho");
		maoVermelho.print();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Partida1().executa();
	}

}
