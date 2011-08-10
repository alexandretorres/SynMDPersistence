package br.ufrgs.inf.poker.partida1.verde;

import br.ufrgs.inf.poker.*;

public abstract class TrocaVerde extends Jogo{

	static private class SetePaus extends Numero implements Paus {
	}
	static private class TrêsEspadas extends As implements Espadas {
	}
	static private class SeteEspadas extends Numero implements Espadas {
	}
	static private class ValetePaus extends Numero implements Paus {
	}
	static private class QuatroCopas extends Numero implements Copas {
	}
	static final SetePaus SETE_PAUS = new SetePaus();
	static final TrêsEspadas TRÊS_ESPADAS = new TrêsEspadas();
	static final SeteEspadas SETE_ESPADAS = new SeteEspadas();
	static final ValetePaus VALETE_PAUS = new ValetePaus();
	static final QuatroCopas QUATRO_COPAS = new QuatroCopas();

	public abstract As troca(Figura ouros);
	public abstract Copas troca(Espadas ouros);
	public abstract Espadas troca(Numero ouros);
}
