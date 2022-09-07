package br.edu.senai.model;

public class Funcionario {
	private String nome;
	private Double salario;
	private Integer contador;
	public Double inss;
	public Double valorTransporte;
	//construtor
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		contador++;
		
	// getters
	}
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	public Integer getContador() {
		return contador;
	}
	//Metodos
	
	public Double calcularInss(){
		inss = 0.11 * salario;
		return inss;
		
	}
	public Double calcularValeTransporte(){
		valorTransporte = 0.06 * salario;
		return valorTransporte;
	}
	

}
