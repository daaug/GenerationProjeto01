package br.com.gen.sistema;

import java.util.Scanner;

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

	public static Responsavel cadastro(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do Responsavel: ");
		String nomeR = entrada.next();

		System.out.println("Qual o seu sexo: ");
		String sexoR = entrada.next();

		System.out.println("Qual a sua idade: ");
		int idadeR = entrada.nextInt();

		System.out.println("Informe o seu numero de Registro(RR): ");
		int rR = entrada.nextInt();

		System.out.println("Informe o número de registro do seu filho: ");
		int rAluno = entrada.nextInt();

		entrada.close();
		Responsavel re = new Responsavel(nomeR, sexoR, idadeR, rR, rAluno);
		return re;
	}


}