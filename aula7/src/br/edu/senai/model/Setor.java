package br.edu.senai.model;

public class Setor {
	private Integer codigo;
	private String descricao;
	public Setor(Integer codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "codigo do setor= " + codigo + "|| descricao=" + descricao ;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
