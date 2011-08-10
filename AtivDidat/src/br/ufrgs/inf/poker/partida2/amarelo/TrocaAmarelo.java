package br.ufrgs.inf.poker.partida2.amarelo;
import br.ufrgs.inf.poker.*;
public abstract class TrocaAmarelo extends Jogo{
	static private class DamaEspadas extends Numero implements Espadas {
	}
	static private class QuatroEspadas extends Numero implements Espadas {
	}
	static private class AsPaus extends Numero implements Paus {
	}
	static private class TrêsOuros extends As implements Ouros {
	}
	static private class OitoPaus extends Numero implements Paus {
	}
	static final DamaEspadas DAMA_ESPADAS = new DamaEspadas();
	static final QuatroEspadas QUATRO_ESPADAS = new QuatroEspadas();
	static final AsPaus AS_PAUS = new AsPaus();
	static final TrêsOuros TRÊS_OUROS = new TrêsOuros();
	static final OitoPaus OITO_PAUS = new OitoPaus();
	
	public abstract Carta troca(As as);
	public abstract Figura troca(Ouros ouros);
	public abstract Ouros troca(Numero numero);
	
	
}
