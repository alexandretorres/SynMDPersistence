package br.ufrgs.inf.poker.partida1.amarelo;

import br.ufrgs.inf.poker.*;

public abstract class TrocaAmarelo extends Jogo{
	static private class DamaCopas extends Numero implements Copas {
	}
	static private class SeisCopas extends Numero implements Copas {
	}
	static private class QuatroOuros extends Numero implements Ouros {
	}
	static private class NoveCopas extends Numero implements Copas {
	}
	static private class ValeteOuros extends Numero implements Ouros {
	}
	static final DamaCopas DAMA_COPAS = new DamaCopas();
	static final SeisCopas SEIS_COPAS = new SeisCopas();
	static final QuatroOuros QUATRO_OUROS = new QuatroOuros();
	static final NoveCopas NOVE_COPAS = new NoveCopas();
	static final ValeteOuros VALETE_OUROS = new ValeteOuros();	
	
	public abstract Carta troca(As as);
	public abstract Figura troca(Ouros ouros);
	public abstract Ouros troca(Numero numero);
	
}
