package br.org.serratec.model;

public class Imovel {
	protected String local;
	protected Double valor;
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	protected Proprietario proprietario;
	
	
	public Imovel(String local, Double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "local=" + local + " ||  valor:" + valor ;
	}

	public String getLocal() {
		return local;
	}
	public Double getValor() {
		return valor;
	}
	//calcular itbi 3,5%
	public Double calcularITBI() {
		return valor * 0.035;
	}
}
