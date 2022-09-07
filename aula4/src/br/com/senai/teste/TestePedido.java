package br.com.senai.teste;

import java.time.LocalDate;

import br.com.senai.model.Pedido;

public class TestePedido {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2020, 4, 1), 1, 2500);
		Pedido pedido2 = new Pedido(12345, LocalDate.of(2020, 8, 2), 2, 500);
		Pedido pedido3 = new Pedido(12367, LocalDate.of(2020, 7, 2), 3, 1500);

		pedido1.finalizarPedido();
		pedido2.finalizarPedido();
		pedido3.finalizarPedido();

		System.out.println("O valor do Pedido1 é: R$ " + pedido1.getTotal());
		System.out.println("O valor do Pedido2 é: R$ " + pedido2.getTotal());
		System.out.println("O valor do Pedido3 é: R$ " + pedido3.getTotal());
}
}
