package br.com.gen.sistema;

public class Responsavel extends Pessoa {

	private int rr, raAluno;

	public int getRr() {
		return rr;
	}

	public void setRr(int rr) {
		this.rr = rr;
	}
	
	public int getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}

	public void dadosResponsavel(String nome, String sexo, int raAluno, int idade, int rr) {
		
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setRr(rr);
		this.setRaAluno(raAluno);
		
	}
		
		
}