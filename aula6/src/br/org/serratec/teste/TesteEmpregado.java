package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Assistente a = new Assistente("1234", "Roni", 2500., 100.);
		Gerente g = new Gerente("3456", "Maria", 4500., "Financeiro");
		Diretor d = new Diretor("5678", "Ana", 9500., "CIO");
		
		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(d);
		
		
		
	}

}
