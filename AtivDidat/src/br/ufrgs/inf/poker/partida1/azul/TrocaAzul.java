package br.ufrgs.inf.poker.partida1.azul;
import br.ufrgs.inf.poker.*;
public abstract class TrocaAzul extends Jogo{
	static private class DamaEspadas extends Numero implements Espadas {
	}
	static private class SeisOuros extends Numero implements Ouros {
	}
	static private class DoisEspadas extends Numero implements Espadas {
	}
	static private class TrêsPaus extends As implements Paus {
	}
	static private class AsOuros extends Numero implements Ouros {
	}
	static final DamaEspadas DAMA_ESPADAS = new DamaEspadas();
	static final SeisOuros SEIS_OUROS = new SeisOuros();
	static final DoisEspadas DOIS_ESPADAS = new DoisEspadas();
	static final TrêsPaus TRÊS_PAUS = new TrêsPaus();
	static final AsOuros AS_OUROS = new AsOuros();	
	
	public abstract Carta troca(Ouros ouros);
	public abstract Paus troca(Espadas ouros);
}
