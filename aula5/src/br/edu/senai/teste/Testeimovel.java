package br.edu.senai.teste;

import br.edu.senai.model.Imovel;
import br.edu.senai.model.Pessoa;

public class Testeimovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana", "ana@gmail.com");
		Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com");
		
		Imovel imovel1 = new Imovel("Casa", "Centro", 950000., pessoa2);
		
		System.out.println(imovel1.getLocal() +" - " + imovel1.getPessoa().getNome());
		
	}

}
