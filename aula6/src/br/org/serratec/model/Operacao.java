package br.org.serratec.model;

public class Operacao implements Livraria {
	private String tipo;
	private Double valorOperacao = 0.0;
	private Livro livro;

	public Operacao(String tipo, Double valorOperacao, Livro livro) {
		super();
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro
				+ ", getValorOperacao()=" + getValorOperacao() + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 1.02 + taxaEmprestimo;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;

	}

}
