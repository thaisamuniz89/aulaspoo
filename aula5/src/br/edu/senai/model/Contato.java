package br.edu.senai.model;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;
	
public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco= endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void adicionarTelefones(Telefone telefone) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = telefone;
				break;
			}
		}
	}

	public void mostrarTelefone() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: "+ telefones[i].getNumero());
		}
	}
}
