package br.org.serratec.teste;

import br.org.serratec.model.Medico;

public class TesteMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico(123, "Carlos", 9000., 300.);
		Medico medico2 = new Medico(321, "Carolina", 9000., 300.);
		
		medico1.pagamentoDinheiro();
		medico2.pagamentoPlanoDeSaude();
		
		
		System.out.println("Total Geral de Médicos:"+ Medico.getContador());
		

	}

}
