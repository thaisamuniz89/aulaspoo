package br.edu.senai;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTimes {

	public static void main(String[] args) {
		List listaDeTimes = new ArrayList<>();
		listaDeTimes.add("Flamengo");
		listaDeTimes.add("Vasco");
		listaDeTimes.add("Fluminense");
		listaDeTimes.add("Botafogo");
		listaDeTimes.add(3000.);
		listaDeTimes.add(true);
		
		
		System.out.println(listaDeTimes);

		listaDeTimes.set(4,"Bangu");
		System.out.println(listaDeTimes);
		System.out.println(listaDeTimes.get(0));
		System.out.println("Tamanho da Lista: "+ listaDeTimes.size());
	}

}
