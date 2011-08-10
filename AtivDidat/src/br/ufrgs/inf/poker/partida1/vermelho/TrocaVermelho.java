package br.ufrgs.inf.poker.partida1.vermelho;
import br.ufrgs.inf.poker.*;
public abstract class TrocaVermelho extends Jogo{
	static private class OitoCopas extends Numero implements Copas {
	}
	static private class NoveOuros extends Numero implements Ouros {
	}
	static private class CincoCopas extends Numero implements Copas {
	}
	static private class DezCopas extends Numero implements Copas {
	}
	static private class CincoEspadas extends Numero implements Espadas {
	}
	static final OitoCopas OITO_COPAS = new OitoCopas();
	static final NoveOuros NOVE_OUROS = new NoveOuros();
	static final CincoCopas CINCO_COPAS = new CincoCopas();
	static final DezCopas DEZ_COPAS = new DezCopas();
	static final CincoEspadas CINCO_ESPADAS = new CincoEspadas();
	
	public abstract Numero troca(Carta as);
	public abstract Figura troca(Copas ouros);
	public abstract Espadas troca(Ouros numero);	
}
