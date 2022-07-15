package br.com.gen.sistema;

public class Aluno extends Pessoa {

	private String turma;
	private int ra, faltas;
	private double notas;

	public Aluno(String nome, String sexo, int idade, String turma, int ra, int faltas, double notas) {
		super(nome, sexo, idade);
		this.turma = turma;
		this.ra = ra;
		this.faltas = faltas;
		this.notas = notas;
	}

	public String getTurma() {
		return turma;
	}

	public int getRa() {
		return ra;
	}

	public int getFaltas() {
		return faltas;
	}

	public double getNotas() {
		return notas;
	}

}
