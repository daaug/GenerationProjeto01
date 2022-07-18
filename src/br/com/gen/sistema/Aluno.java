package br.com.gen.sistema;

import java.util.Scanner;

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

	public static Aluno cadastro() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nome do Aluno: ");
		String nomeA = entrada.next();

		System.out.println("Qual o seu sexo: ");
		String sexoA = entrada.next();

		System.out.println("Qual a sua idade: ");
		int idadeA = entrada.nextInt();

		System.out.println("Informe o seu número de Registro(RA): ");
		int rA = entrada.nextInt();

		System.out.println("Informe sua turma: ");
		String turmaA = entrada.next();

		Aluno al = new Aluno(nomeA, sexoA, idadeA, turmaA, rA);

		return al;
	}

}
