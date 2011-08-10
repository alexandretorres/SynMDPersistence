package br.ufrgs.inf.poker.exemplo;

import br.ufrgs.inf.poker.*;

public abstract class TrocaVerde extends Jogo{
	
	static private class DoisCopas extends Numero implements Copas {
	}
	static private class AsCopas extends As implements Copas {
	}
	static private class OitoEspadas extends Numero implements Espadas {
	}
	static private class QuatroEspadas extends Numero implements Espadas {
	}
	static private class DoisEspadas extends Numero implements Espadas {
	}
	static final DoisCopas DOIS_COPAS = new DoisCopas();
	static final AsCopas AS_COPAS = new AsCopas();
	static final OitoEspadas OITO_ESPADAS = new OitoEspadas();
	static final QuatroEspadas QUATRO_ESPADAS = new QuatroEspadas();
	static final DoisEspadas DOIS_ESPADAS = new DoisEspadas();
	//
	public abstract As troca(Ouros entrada); 
}
