package br.edu.senai.exercicio;

import java.time.LocalDate;

public class Mamifero extends Animal {
	protected String raca;
	
	
	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}


	public String getRaca() {
		return raca;
	}

	public abstract void amamentar();
	
	@Override
	public abstract String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
