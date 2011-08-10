package br.ufrgs.inf.ex8;

import br.ufrgs.inf.ex8.Composicao.Poligono.Ponto;

public class Composicao {
	class Poligono  {
		private Ponto[] pontos; // Privado
		private int posicao=0;
		Poligono(int nroPontos) {
			pontos = new Ponto[nroPontos];
		}
		void novoPonto(int x,int y) {
			pontos[posicao++] = new Ponto(x,y);
		}
		// Este método não poderia existir!
		Ponto getPonto(int posicao) {
			return pontos[posicao]; 
		}		
		class Ponto { // Inner Class
			int x,y;
			Ponto(int x,int y) {
				this.x=x;
				this.y=y;
			}
		}	
	}
	
	public void example() {		
		Poligono p3 = new Poligono(3);
		p3.novoPonto(0,10);
		p3.novoPonto(5,0);
		p3.novoPonto(10,10);
		Ponto p = p3.getPonto(2);
		p3 = null; // p3 pode ser apagado...		
		System.out.println(" Ponto não é composição, continua existindo: "+p);		
	}
	public static void main(String[] args) {
		new Composicao().example();
	}

}
