package br.edu.senai.vetor;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		Empregado[] empregados  = new Empregado[3];
		
		empregados[0] = new Empregado("Lucas", "123456");
		empregados[1] = new Empregado("Roni", "465789");
		empregados[2] = new Empregado("Igor", "789123");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}

	}

}
