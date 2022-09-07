package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor setor1 = new Setor(123, "RH");
		Setor setor2 =  new Setor(789, "DP");
		
		Pessoa pessoa1 = new Pessoa("Paulo", "123465","paulo@gmail.com", EstadoCivil.CASADO, setor1);
		
		System.out.println(pessoa1);
		
		for (EstadoCivil situacao : EstadoCivil.values()) {
			System.out.println(situacao);
		}
	}

}
