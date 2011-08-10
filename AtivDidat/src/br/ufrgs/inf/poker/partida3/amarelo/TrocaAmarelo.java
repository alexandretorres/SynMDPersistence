package br.ufrgs.inf.poker.partida3.amarelo;
import br.ufrgs.inf.poker.*;
public abstract class TrocaAmarelo extends Jogo{
	static private class DezOuros extends Numero implements Ouros {
	}
	static private class DezCopas extends Numero implements Copas {
	}
	static private class CincoPaus extends Numero implements Paus {
	}
	static private class AsOuros extends Numero implements Ouros {
	}
	static private class AsEspadas extends Numero implements Espadas {
	}
	static final DezOuros DEZ_OUROS = new DezOuros();
	static final DezCopas DEZ_COPAS = new DezCopas();
	static final CincoPaus CINCO_PAUS = new CincoPaus();
	static final AsOuros AS_OUROS = new AsOuros();
	static final AsEspadas AS_ESPADAS = new AsEspadas();
		
	public abstract Carta troca(As as);
	public abstract Figura troca(Ouros ouros);
	public abstract Ouros troca(Numero numero);		
}
