package br.edu.senai.teste;

import br.edu.senai.model.Cidade;
import br.edu.senai.model.Contato;
import br.edu.senai.model.Endereco;
import br.edu.senai.model.Estado;
import br.edu.senai.model.Telefone;

public class TesteContato {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Teresópolis", estado1);
		Endereco endereco1 = new Endereco("Rua dos Bobos, 211", "Varzea", cidade1);
		Telefone telefone1 = new Telefone("2742-0000");
		Telefone telefone2 = new Telefone("2742-1111");
		Contato contato1 = new Contato("Igor", new Telefone[2], endereco1);
		
		contato1.adicionarTelefones(telefone2);
		contato1.adicionarTelefones(telefone1);

		
		
		System.out.println("Nome: "+ contato1.getNome() + "\n" +contato1.getEndereco());
		contato1.mostrarTelefone();
	}

}
