package br.com.gen.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Scanner entrada = new Scanner(System.in);
		
		Professor professor = new Professor();
		
		int opcao = 0;

		System.out.println("1 - Professor | 2 - Aluno | 3 - Responsável");
		do { // Inicio do looping
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Professor");
				break;
			case 2:
				System.out.println("Você logou pelo aluno: ");
				break;
			case 3:
				System.out.println("Responsável");
				break;
			default:
				System.out.println("Opçao inválida!");
			}

		} while (opcao != 0); // Fim do loop

		for (Aluno aluno : alunos) {
			System.out.print(aluno.getNome() + " ");
			System.out.print(aluno.getRa());
			System.out.println("");
		}
		entrada.close();
		// System.out.println(alunos.get(0).getNome());

	}
}
