package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo02 {

	public static void main(String[] args) {
		int valor = 100;
		valor = 300;
		//CTRL shift o - importar pacotes
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println(valor);
		System.out.println("Hoje é dia " + data);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
