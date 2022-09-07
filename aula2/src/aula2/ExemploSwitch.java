package aula2;

public class ExemploSwitch {
	
	public static void main(String[]args) {
		int mes = 3;
		switch(mes) {
		case 1: 
			System.out.println("Jan");
			break;
		case 2: 
			System.out.println("Fev");
			break;
		case 3: 
			System.out.println("Março");
			break;
		case 4: 
			System.out.println("Abril");
			break;
		case 5: 
			System.out.println("Maio");
			break;
		case 6: 
			System.out.println("Junho");
			break;
		default: System.out.println("Valor errado"); 
			break;
		}
	}

}
