package br.edu.senai.teste;

import java.time.LocalDate;

import br.edu.senai.enums.Bebida;
import br.edu.senai.enums.Sanduiche;
import br.edu.senai.model.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(LocalDate.of(2022, 9, 5),Bebida.AGUA, Sanduiche.HOTDOG
				LocalDate.);
		pedido.imprimirCardapio();
		
		System.out.println("Dados do pedido: ");
		System.out.println(pedido);
		
}
