package br.ufrgs.inf.poker.partida3.verde;
import br.ufrgs.inf.poker.*;
public abstract class TrocaVerde extends Jogo{
	static private class OitoCopas extends Numero implements Copas {
	}
	static private class SetePaus extends Numero implements Paus {
	}
	static private class ReiEspadas extends Figura implements Espadas {
	}
	static private class QuatroCopas extends Numero implements Copas {
	}
	static private class SeisCopas extends Numero implements Copas {
	}
	static final OitoCopas OITO_COPAS = new OitoCopas();
	static final SetePaus SETE_PAUS = new SetePaus();
	static final ReiEspadas REI_ESPADAS = new ReiEspadas();
	static final QuatroCopas QUATRO_COPAS = new QuatroCopas();
	static final SeisCopas SEIS_COPAS = new SeisCopas();
	//
	public abstract As troca(Figura ouros);
	public abstract Copas troca(Espadas ouros);
	public abstract Espadas troca(Numero ouros);
	
}
