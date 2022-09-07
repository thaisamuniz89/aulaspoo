package br.org.serratec.model;

public class Caminhao extends Veiculo {
	private Integer cargaMaxima;

	public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}
	//override - pega o metodo na clsse mae (veiculo) e sobreescreve ele
	@Override
	public void calcularIPVA() {
		valorIPVA = valor * 0.08;
	}
	@Override
	public String toString() {
		return super.toString() + cargaMaxima;
	}
}
