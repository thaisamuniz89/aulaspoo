package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private static int totalProdutos;
// Main não pode fzr new Produto() - construtor vazio
// Construtor
	public Produto(Integer codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		totalProdutos++;
	}
//apenas setters por causa do uso do construtor cheio acima	
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	public static int getTotalProdutos() {
		return totalProdutos;
	}
	
	
//Metodo	
	
}
