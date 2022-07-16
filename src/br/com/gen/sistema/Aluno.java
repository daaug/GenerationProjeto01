package br.com.gen.sistema;

public class Aluno extends Pessoa {

	private String turma;
	private int ra, faltas;
	private double notas;

	public Aluno(String nome, String sexo, int idade, String turma, int ra) {
		super(nome, sexo, idade);
		this.turma = turma;
		this.ra = ra;
		this.faltas = 0;
		this.notas = 0;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void setNotas(double notas) {
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
