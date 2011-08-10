package br.ufrgs.inf.poker.exemplo;

import br.ufrgs.inf.poker.*;

public abstract class TrocaAzul extends Jogo{
	static private class AsPaus extends As implements Paus {
	}
	static private class AsOuros extends As implements Ouros {
	}
	static private class AsEspadas extends As implements Espadas {
	}
	static private class DoisOuros extends Numero implements Ouros {
	}
	static private class TresOuros extends Numero implements Ouros {
	}
	static final AsPaus AS_PAUS = new AsPaus();
	static final AsOuros AS_OUROS = new AsOuros();
	static final AsEspadas AS_ESPADAS = new AsEspadas();
	static final DoisOuros DOIS_OUROS = new DoisOuros();
	static final TresOuros TRES_OUROS = new TresOuros();
	
	public abstract Numero troca(As as);
	public abstract As troca(Copas copas);
	
}
