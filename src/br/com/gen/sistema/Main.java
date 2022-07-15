package br.com.gen.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Nao mexer daqui pra baixo!!!
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>();
		Scanner entrada = new Scanner(System.in);
		
		Aluno a1 = new Aluno("Kenai", "Masc", 7, "1A", 1111, 6, 8);
		Aluno a2 = new Aluno("Heloisa", "Fem", 6, "1B", 2222, 3, 7);
		Aluno a3 = new Aluno("Robso", "Masc", 7, "1A", 3333, 8, 9);
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);

		Professor p1 = new Professor("Daniel", "Masc", 27, 77, "1A", "Mat");
		Professor p2 = new Professor("Angelica", "Fem", 28, 88, "1B", "Por");
		professores.add(p1);
		professores.add(p2);

		Responsavel r1 = new Responsavel("Maria", "Fem", 28, 111,  1111);
		Responsavel r2 = new Responsavel("Antonio", "Masc", 33, 333,  2222);
		Responsavel r3 = new Responsavel("Renata", "Fem", 44, 444,  3333);
		responsaveis.add(r1);
		responsaveis.add(r2);
		responsaveis.add(r3);

		int opcao = 0;
		// Nao mexer daqui pra cima!!!

		do { // Inicio do looping principal
			System.out.println("1 - Login | 2 - Cadastro");
			opcao = entrada.nextInt();

			switch (opcao) { // Inicio do switch login/cadastro
			case 1: // Acesso de login
				System.out.println("Logar: ");
				System.out.println("1 - Professor | 2 - Aluno | 3 - Responsável");
				opcao = entrada.nextInt();

				switch (opcao) { // Inicio do switch do tipo de acessos
				case 1: // Inicio login Professor
					int rp = entrada.nextInt();

					for (Professor prof: professores) {
						if (prof.getRp() == rp){ // Checa se rp existe e loga

						}
					} // Fim for each
					break; // Fim login Professor

				case 2: // Inicio login Aluno
					System.out.println("Qual o seu RA?");
					int ra = entrada.nextInt();

					for (Aluno aluno : alunos) { // Inicio do for each
						if (aluno.getRa() == ra) { // Checa o RA do aluno se existe
							System.out.println("Você logou!");

							int i; // Recebe opções do usuario
							do {
								System.out.println("1 - Agenda | 2 - Notas | 3 - Faltas | 0 - Sair");
								i = entrada.nextInt();
								switch (i) {
								case 1:
									break;
								case 2:
									System.out.println("--------------------------------------------");
									System.out.println("               | Curso Java |               ");
									System.out.println("--------------------------------------------");
									System.out.println("Sua nota é " + aluno.getNotas());
									break;
								case 3:
									System.out.println("Você tem " + aluno.getFaltas() + " faltas");
									break;
								default:
								}

							} while (i != 0);
							break;
						}
					}
					break; // Fim login Aluno

				case 3: // Inicio login Responsavel
					int rr = entrada.nextInt();

					for (Responsavel resp: responsaveis) {
						if (resp.getRr() == rr){ // Checa se rr existe e loga

						}
					} // Fim for each
					break; // Fim login Responsavel
				default:
					System.out.println("Opção inválida!");
					continue;
				}

				break;

			case 2: // Acesso de cadastro
				System.out.println("Cadastrar: ");
				System.out.println("1 - Professor | 2 - Aluno | 3 - Responsável");
				break;
			default: // Saida dos acessos login/cadastro
				opcao = 0;
			}

		} while (opcao != 0); // Fim do looping principal

		entrada.close();

	}
}
