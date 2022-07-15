package br.com.gen.sistema;

public class Responsavel extends Pessoa{

	private int rr, raAluno;

	public Responsavel(String nome, String sexo, int idade, int rr, int raAluno) {
		super(nome, sexo, idade);
		this.rr = rr;
		this.raAluno = raAluno;
	}

	public int getRr() {
		return rr;
	}

	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}
	
	
}