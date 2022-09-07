package br.org.serratec.model;



public class TotalizaTributo {
	private Double total = 0.;

	public Double getTotal() {
		return total;
	}
	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICMS() + t.calcularImpostoDeRenda();
			
	}
}
