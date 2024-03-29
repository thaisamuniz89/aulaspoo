package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return "Casa : garagem= " + (garagem? "Tem garagem": "Não tem garagem" )+" || local: " + local+" || valor: " + valor+ " || local: " + local ;
	}

	public Boolean getGaragem() {
		return garagem;
	}

}
