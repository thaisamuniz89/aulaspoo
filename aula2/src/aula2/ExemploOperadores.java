package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		int idade = 19;
		float altura = 1.65f;
		if (idade>18 || altura >= 1.80) {
			System.out.println("Competirá");
		} else {
			System.out.println("não competirá");
		}
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá": "Não competirá";
		System.out.println(resposta);
	}
	
}
