package br.ufrgs.inf.poker.gerador;


import java.util.Random;

//import br.ufrgs.inf.poker.*;
/** 
 * Cada grupo recebe 5 cartas e 3 instâncias de troca. Cada grupo pode então trocar suas cartas com a de 
 * outros grupos da seguinte forma: instânciando objetos de troca do outro grupo e acionando um dos métodos
 *  de trocas válido. A responsabilidade por implementar a troca é dos grupos.
 * @author USER
 *
 */
public class Embaralha {
	enum Numeros {As,Dois,Três,Quatro,Cinco,Seis,Sete,Oito,Nove,Dez,Valete,Dama,Rei};
	enum Naipes {Ouros,Copas,Paus,Espadas};
	class CartaBaralho {
		Numeros numero;
		Naipes naipe;
		public CartaBaralho(Numeros n,Naipes nn) {
			numero=n;
			naipe=nn;
		}
		void print() {
			System.out.print("static private class "+numero+naipe);
			System.out.print(" extends ");			
			switch(numero.ordinal()-1) { 
				case 1:
					System.out.print("As ");
					break;
				case 11:
				case 12:
				case 13:
					System.out.print("Figura ");
					break;
				default:
					System.out.print("Numero ");
					break;
			}
			System.out.println("implements "+naipe+" {");
			System.out.println("}");	
		}
		void print2() {
			System.out.print("static final "+numero+naipe +" "+ (numero+"_"+naipe).toUpperCase());
			System.out.println(" = new "+numero+naipe+"();");			
		}
	}
	public void work() {
		CartaBaralho[] cartas = new CartaBaralho[13*4];
		int idx=0;
		for (int i=1;i<14;i++) {
			for (int n=0;n<4;n++) {
				cartas[idx++]=new CartaBaralho(Numeros.values()[i-1],Naipes.values()[n]);				
			}
		}
		embaralha(cartas);
		print(new CartaBaralho[] {cartas[0],cartas[1],cartas[2],cartas[3],cartas[4]});
		print(new CartaBaralho[] {cartas[5],cartas[6],cartas[7],cartas[8],cartas[9]});
		print(new CartaBaralho[] {cartas[10],cartas[11],cartas[12],cartas[13],cartas[14]});
		print(new CartaBaralho[] {cartas[15],cartas[16],cartas[17],cartas[18],cartas[19]});
	
	}
	public void print(CartaBaralho[] cartas) {
		for (CartaBaralho cb:cartas) {
			cb.print();
		}
		for (CartaBaralho cb:cartas) {
			cb.print2();
		}
	}
	public void embaralha(CartaBaralho[] cartas) {
		for (int i=0;i<50;i++) {
			Random r = new Random();
			int p1 = r.nextInt(cartas.length);
			int p2 = r.nextInt(cartas.length);
			CartaBaralho tmp = cartas[p1];
			cartas[p1]=cartas[p2];
			cartas[p2]=tmp;
		}
		
	}
	public static void main(String args[]) {
		new Embaralha().work();
	}
}
