package br.ufrgs.inf.poker;


public abstract class CartaAbstrata implements Carta{
	private boolean trocada=false;
	private Carta cartaNova;
	//implementação de métodos abstratos
	public final void troca(Carta carta) {
		if (carta instanceof CartaAbstrata) {
			CartaAbstrata aCarta = (CartaAbstrata) carta;			
			if (trocada && (cartaNova!=null || aCarta.getCartaNova()!=this)) {
				throw new RuntimeException("Uma carta trocada não pode ser usada em nova troca");	
			} else {
				this.cartaNova = aCarta;
				trocada=true;
				aCarta.toggleTrocada();
			}		
		}		
	}
	//overrides
	public final String toString() {
		String tail="";
		if (this.isTrocada()) {
			if (getCartaNova()==null) {
				tail="[T]";
			} else {
				tail="[T "+getCartaNova().getClass().getName()+"]";
			}
		}
		return this.getClass().getName()+tail;		
	}
	final boolean isTrocada() {
		return trocada;
	}
	final void toggleTrocada() {
		trocada=true;
	}
	final Carta getCartaNova() {
		return cartaNova;
	}
	
}
