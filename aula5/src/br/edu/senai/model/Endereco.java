package br.edu.senai.model;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	
	
	public Endereco(String rua, String bairro, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return rua +" "+  bairro + " " + cidade + " "  ;
	}

	
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCep() {
		return cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	
	
}
