package br.org.serratec.model;

public class Mulher extends Pessoa {
	private int filhos;

	public Mulher(String nome, int idade, double peso, int filhos) {
		super(nome, idade, peso);
		this.filhos = filhos;
	}

	public int getFilhos() {
		return filhos;
	}

	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}
	
}
