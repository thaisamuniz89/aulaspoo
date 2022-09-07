package br.org.serratec.model;

public interface Conta {
	Double taxaBancaria = 2.50;
	
	public Boolean saque(Double valor);
	public Boolean deposito (Double valor);
}
