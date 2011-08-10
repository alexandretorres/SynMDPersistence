package br.ufrgs.inf.poker.partida3.vermelho;
import br.ufrgs.inf.poker.*;
public abstract class TrocaVermelho extends Jogo{
	static private class OitoEspadas extends Numero implements Espadas {
	}
	static private class DoisEspadas extends Numero implements Espadas {
	}
	static private class QuatroEspadas extends Numero implements Espadas {
	}
	static private class DezEspadas extends Numero implements Espadas {
	}
	static private class CincoEspadas extends Numero implements Espadas {
	}
	static final OitoEspadas OITO_ESPADAS = new OitoEspadas();
	static final DoisEspadas DOIS_ESPADAS = new DoisEspadas();
	static final QuatroEspadas QUATRO_ESPADAS = new QuatroEspadas();
	static final DezEspadas DEZ_ESPADAS = new DezEspadas();
	static final CincoEspadas CINCO_ESPADAS = new CincoEspadas();
	//
	
	public abstract Numero troca(Carta as);
	public abstract Figura troca(Copas ouros);
	public abstract Espadas troca(Ouros numero);
	
	
}
