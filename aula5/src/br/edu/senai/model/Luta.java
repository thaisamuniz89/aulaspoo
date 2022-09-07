package br.edu.senai.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private Boolean confirmacao = false;

	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmacao = confirmacao;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}
	public Boolean confirmacaoLuta() {
		//para a luta ser confirmada é necessario checar se o
		//desafiante é diferente do desafiado
		// e se a as categorias sao iguais
		if (!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		} return false;
	}
}
