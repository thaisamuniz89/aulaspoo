package br.edu.senai.vetor;

import java.util.Iterator;

public class Exemplo2Matriz {

	public static void main(String[] args) {
		String pessoas[][] = { { "Marcos", "m@gmail.com" }, { "Maria", "ma@gmail.com" }, { "Carlos", "c@gmail.com" },
				{ "Adriano", "c@gmail.com" } };

		for (int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("**********************");
			for (int coluna = 0; coluna < pessoas[linha].length; coluna++) {
				System.out.println(pessoas[linha][coluna]);
			}
		}

	}
}
