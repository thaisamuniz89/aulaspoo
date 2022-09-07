package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto", 5000., "Financeiro");
		System.out.println("Dados:" + gerente.getNome() + "\n" + gerente.getCpf() + "\n" + gerente.getSalario());
		
		Assistente assistente1 = new Assistente("321", "Paulo", 15000., "AssistenteTI");
		System.out.println("Dados: "+ assistente1.getNome() + "\n" + assistente1.getCpf() + "\n"+assistente1.getSalario());
		System.out.println("Novo salario do gerente: "+gerente.aumentarSalario()+"\nNovo salario do assistente: "+assistente1.aumentarSalario());
	}

}
