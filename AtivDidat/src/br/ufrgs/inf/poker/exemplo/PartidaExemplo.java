package br.ufrgs.inf.poker.exemplo;

import br.ufrgs.inf.poker.*;

public class PartidaExemplo {
	public void executa() {		
		Mao maoAzul = new JogoAzul().jogo();
		Mao maoVerde = new JogoVerde().jogo();
		//resultados
		System.out.println("Jogo Azul");
		maoAzul.print();
		System.out.println("Jogo Verde");
		maoVerde.print();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PartidaExemplo().executa();
	}
}
