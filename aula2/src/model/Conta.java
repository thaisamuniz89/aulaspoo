package model;
//Classe com tres atributos e dois metodos
public class Conta {
	public int numeroConta;
	public String titular;
	public double saldo;
	
	
	//não tem retorno por ser void
	public void deposito(double valor) {
		saldo += valor;
		System.out.println();
		
	}
	//Método com retorno
	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;			
		}else {
			saldo -= valor;
			return true;
		}
	}
}
