package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalizaTributo;

public class TesteTributo {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Igor", 15000.);
		Empresa e = new Empresa("ABC", 259000.);
		TotalizaTributo t = new TotalizaTributo();
		
		System.out.println(e + "\nTributos a pagar -  ICMS: "
							+ e.calcularICMS() + ", IR: "+e.calcularImpostoDeRenda());
		System.out.println(p + "\nTributos a pagar -  IR: "+ p.calcularImpostoDeRenda());		
		
		t.totalGeralTributos(e);
		t.totalGeralTributos(p);
		
		System.out.println("Total dos tributos: " + t.getTotal());
		
	}

}
