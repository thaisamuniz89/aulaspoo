package br.org.serratec.teste;

import br.org.serratec.model.Operacao;
import br.org.serratec.model.Livro;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 =new Livro("Evandro", "Java, desde o básico", 250.);
		Livro livro2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.00);
		
		Operacao operacao1 = new Operacao("aluguel", 0., livro1);
		Operacao operacao2 = new Operacao("empréstimo",0., livro2);
		
		
		livro1.reajuste(livro1.getValor());
		operacao1.venderLivro();
		operacao2.emprestarLivro();
		
		System.out.println(operacao1.toString());
		System.out.println(operacao2.toString());
		

	}

}
