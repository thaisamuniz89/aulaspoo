package br.org.serratec.model;

public interface Tributacao extends TaxasIR, ImpostoDeRenda {
	public Double calcularICMS();
	
}
