package br.com.gen.sistema;

public class Aluno extends Pessoa {

	private String turma;
	private int ra, faltas;
	private double notas;

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public void dadosAluno(String nome, String sexo, int idade, String turma, int ra, int faltas, double notas) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setTurma(turma);
		this.setRa(ra);
		this.setFaltas(faltas);
		this.setNotas(notas);
	}

}
