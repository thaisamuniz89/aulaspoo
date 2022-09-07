package teste;

import model.Alunos;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("------------");
		// Instancia de um objeto
		Alunos a1 = new Alunos(); 
		a1.matricula = 123;
		a1.nome = "Carlos";
		a1.email = "carlos@gmail.com";
		
		System.out.println(a1.matricula + "-" + a1.nome + "-"+a1.email);
		Alunos a2 = new Alunos(); 
		Alunos a3 = new Alunos(); 
		
		System.out.println("Aluno1:"+ a1);
		System.out.println("Aluno2:"+ a2);
		if(a1 == a2) {
			System.out.println("Objetos iguais !");
		}else {
			System.out.println("Objetos diferentes !");
		}
	}
}
