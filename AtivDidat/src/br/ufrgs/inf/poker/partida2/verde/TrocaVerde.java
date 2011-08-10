package br.ufrgs.inf.poker.partida2.verde;
import br.ufrgs.inf.poker.*;
public abstract class TrocaVerde extends Jogo{
	static private class DamaCopas extends Numero implements Copas {
	}
	static private class SeisOuros extends Numero implements Ouros {
	}
	static private class DezOuros extends Numero implements Ouros {
	}
	static private class ReiCopas extends Figura implements Copas {
	}
	static private class SeisEspadas extends Numero implements Espadas {
	}
	static final DamaCopas DAMA_COPAS = new DamaCopas();
	static final SeisOuros SEIS_OUROS = new SeisOuros();
	static final DezOuros DEZ_OUROS = new DezOuros();
	static final ReiCopas REI_COPAS = new ReiCopas();
	static final SeisEspadas SEIS_ESPADAS = new SeisEspadas();
	//
	public abstract As troca(Figura ouros);
	public abstract Copas troca(Espadas ouros);
	public abstract Espadas troca(Numero ouros);
	
}
