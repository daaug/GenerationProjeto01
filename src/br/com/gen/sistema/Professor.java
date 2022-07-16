package br.com.gen.sistema;

public class Professor extends Pessoa {

	private int raAluno, rp;
	private String turma;
	private String materia;

	public Professor(String nome, String sexo, int idade, int rp, String turma, String materia) {
		super(nome, sexo, idade);
		this.rp = rp;
		this.turma = turma;
		this.materia = materia;
	}

	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
