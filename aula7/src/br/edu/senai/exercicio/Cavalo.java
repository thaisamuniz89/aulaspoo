package br.edu.senai.exercicio;

import java.time.LocalDate;

public class Cavalo extends Mamifero {
	private String marcaFerradura;
	
	
	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}


	public String getMarcaFerradura() {
		return marcaFerradura;
	}


	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

}
