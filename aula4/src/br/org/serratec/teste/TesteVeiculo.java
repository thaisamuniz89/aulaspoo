package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("134", "abd-123", "vermelho", 150000., 10000);
		c.calcularIPVA();
		System.out.println("Valor Ipva " + c.getValorIPVA());
		System.out.println(c.toString());
	
	
	
	}

}
