package teste;

import model.Conta;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroConta = 1234;
		conta1.titular = "Ana Maria";
		conta1.saldo = 1000;
		
		//Deposito de 500
		conta1.deposito(500);
		
		// saque de 200
		if (conta1.saque(200)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Sem saldo suficiente!");
		}
		// imprimir saldo
		
	}

}
