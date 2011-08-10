package br.ufrgs.inf.ex7;

public class Exemplo7 {
	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[4];
		veiculos[0] = new Automovel();
		veiculos[1] = new Bicicleta();
		veiculos[2] = new Automovel();
		veiculos[3] = new Caminhao();
		Motorizado[] motorizados = new Motorizado[3];
		motorizados[0] = (Motorizado) veiculos[0];
		//motorizados[1] = (Motorizado) veiculos[1]; //ERRO de runtime: bicileta não é motorizada
		motorizados[1] = (Motorizado) veiculos[2];
		motorizados[2] = (Motorizado) veiculos[3];                                
		
		for (Veiculo veiculo: veiculos) {
			veiculo.mova();
		}
		for (Motorizado vmotor: motorizados) {
			vmotor.acelere(10);
		}
		System.err.println("ok");
	}
}
