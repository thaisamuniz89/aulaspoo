package br.org.serratec.model;


public abstract class Empregado {
	private String cpf;
	private String nome;
	protected Double salario;
	
	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Empregado - cpf= " + cpf + ", nome= " + nome + ", salario= " + String.format("%.2f", salario)  + ", ";
	}

	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	
	public abstract void aumentarSalario();
	
	
}
