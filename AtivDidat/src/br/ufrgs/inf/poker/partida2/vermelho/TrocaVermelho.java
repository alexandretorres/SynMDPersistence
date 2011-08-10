package br.ufrgs.inf.poker.partida2.vermelho;
import br.ufrgs.inf.poker.*;
public abstract class TrocaVermelho extends Jogo{
	static private class AsCopas extends Numero implements Copas {
	}
	static private class ReiEspadas extends Figura implements Espadas {
	}
	static private class NoveOuros extends Numero implements Ouros {
	}
	static private class SeteCopas extends Numero implements Copas {
	}
	static private class ValetePaus extends Numero implements Paus {
	}
	static final AsCopas AS_COPAS = new AsCopas();
	static final ReiEspadas REI_ESPADAS = new ReiEspadas();
	static final NoveOuros NOVE_OUROS = new NoveOuros();
	static final SeteCopas SETE_COPAS = new SeteCopas();
	static final ValetePaus VALETE_PAUS = new ValetePaus();
	//	
	public abstract Numero troca(Carta as);
	public abstract Figura troca(Copas ouros);
	public abstract Espadas troca(Ouros numero);	
}
