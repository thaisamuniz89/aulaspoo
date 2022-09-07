package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Informe o seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Informe o seu peso: ");				
			double peso = sc.nextDouble();
			
			Pessoa  pessoa = new Pessoa(nome, idade, peso);
			System.out.println("Nome: "+ pessoa.getNome() 
					+"; Idade: " + pessoa.getIdade()
					+"; Peso: "+pessoa.getPeso());
			
			
		
		sc.close();

}}
