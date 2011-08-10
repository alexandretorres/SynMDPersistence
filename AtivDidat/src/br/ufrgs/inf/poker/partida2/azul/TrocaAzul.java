package br.ufrgs.inf.poker.partida2.azul;
import br.ufrgs.inf.poker.*;
public abstract class TrocaAzul extends Jogo{
	static private class DoisCopas extends Numero implements Copas {
	}
	static private class DamaPaus extends Numero implements Paus {
	}
	static private class TrêsEspadas extends As implements Espadas {
	}
	static private class DoisEspadas extends Numero implements Espadas {
	}
	static private class QuatroPaus extends Numero implements Paus {
	}
	static final DoisCopas DOIS_COPAS = new DoisCopas();
	static final DamaPaus DAMA_PAUS = new DamaPaus();
	static final TrêsEspadas TRÊS_ESPADAS = new TrêsEspadas();
	static final DoisEspadas DOIS_ESPADAS = new DoisEspadas();
	static final QuatroPaus QUATRO_PAUS = new QuatroPaus();
	
	public abstract Carta troca(Ouros ouros);
	public abstract Paus troca(Espadas ouros);
}
