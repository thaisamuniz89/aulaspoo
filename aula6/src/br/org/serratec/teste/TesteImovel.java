package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Imovel;
import br.org.serratec.model.Proprietario;

public class TesteImovel {
	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Roni");
		Imovel casa1 = new Casa("Centro", 409500., true);
		casa1.setProprietario(proprietario1);
		
		System.out.println("Dados do Imóvel - "+ casa1+" || Proprietario: " + casa1.getProprietario().getNome());
		
		
		Imovel apartamento1 = new Apartamento("Centro", 200000., 4);
		apartamento1.setProprietario(proprietario1);
		System.out.println("Dados do Imóvel - "+ apartamento1 +" || Proprietario: " + apartamento1.getProprietario().getNome());
		
	}
}
