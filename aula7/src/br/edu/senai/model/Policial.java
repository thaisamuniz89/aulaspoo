package br.edu.senai.model;


//não pode ter filhos mas pode ter instancias
public class Policial {
	private String nome;
	private String matricula;
	public Policial( String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNomeString() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	
}
