package br.org.serratec.model;

public class Pessoa implements Tributacao {
	private String nome;
	private Double rendimentos;
	
	
	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Pessoa - nome= " + nome + ", rendimentos= " + rendimentos ;
	}

	public String getNome() {
		return nome;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	@Override
	public Double calcularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPF;
	}

	@Override
	public Double calcularICMS() {
		return 0.;
	}

}
