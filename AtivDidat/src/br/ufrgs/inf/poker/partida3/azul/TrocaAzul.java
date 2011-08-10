package br.ufrgs.inf.poker.partida3.azul;
import br.ufrgs.inf.poker.*;
public abstract class TrocaAzul extends Jogo{
	static private class SeisEspadas extends Numero implements Espadas {
	}
	static private class ValeteOuros extends Numero implements Ouros {
	}
	static private class OitoOuros extends Numero implements Ouros {
	}
	static private class TrêsOuros extends As implements Ouros {
	}
	static private class DamaEspadas extends Numero implements Espadas {
	}
	static final SeisEspadas SEIS_ESPADAS = new SeisEspadas();
	static final ValeteOuros VALETE_OUROS = new ValeteOuros();
	static final OitoOuros OITO_OUROS = new OitoOuros();
	static final TrêsOuros TRÊS_OUROS = new TrêsOuros();
	static final DamaEspadas DAMA_ESPADAS = new DamaEspadas();
	
	
	public abstract Carta troca(Ouros ouros);
	public abstract Paus troca(Espadas ouros);
	
	
}
