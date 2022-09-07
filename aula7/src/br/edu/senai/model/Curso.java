package br.edu.senai.model;

import br.edu.senai.enums.PeriodoCurso;

public class Curso {
	private String nomeCurso;
	private PeriodoCurso periodo;
	public Curso(String nomeCurso, PeriodoCurso periodo) {
		super();
		this.nomeCurso = nomeCurso;
		this.periodo = periodo;
	}
	
	@Override
	public String toString() {
		return "Curso - nomeCurso= " + nomeCurso + ", periodo= " + periodo;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
	public PeriodoCurso getPeriodo() {
		return periodo;
	}
}
