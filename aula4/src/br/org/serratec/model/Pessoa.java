package br.org.serratec.model;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;

	public Pessoa(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println("xxxxxxxxx");
	}
	public void falar() {
		System.out.println("falar.....");
	}
}
