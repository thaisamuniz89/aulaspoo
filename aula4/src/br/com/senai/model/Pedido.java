package br.com.senai.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Pedido {
	private int numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	private double total;

	public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
		super();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataPedido=" + dataPedido + ", valor=" + valor + "]";
	}

	public void finalizarPedido() {
		//if (dataPedido.getDayOfWeek() == DayOfWeek.SUNDAY)
		if (dataPedido.getDayOfWeek().getValue() == 7) {
			total = quantidade * valor * 0.9;
		} else {
			total = quantidade * valor;
		}
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}

}	