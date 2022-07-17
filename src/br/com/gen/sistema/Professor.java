package br.com.gen.sistema;

import java.util.Scanner;

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

	public static Professor cadastro(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do Professor: ");
		String nomeP = entrada.next();

		System.out.println("Qual o seu sexo: ");
		String sexoP = entrada.next();

		System.out.println("Qual a sua idade: ");
		int idadeP = entrada.nextInt();

		System.out.println("Informe o seu número de Registro(RP): ");
		int rP = entrada.nextInt();

		System.out.println("Informe sua turma: ");
		String turmaP = entrada.next();

		System.out.println("Informe sua materia: ");
		String materiaP = entrada.next();

		entrada.close();
		Professor pr = new Professor(nomeP, sexoP, idadeP, rP, turmaP, materiaP);

		return pr;
	}

}
