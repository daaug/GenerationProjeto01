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

		Aluno a1 = new Aluno("Kenai", "Masc", 7, "1A", 123);
		Aluno a2 = new Aluno("Robso", "Masc", 7, "1A", 456);
		Aluno a3 = new Aluno("Heloisa", "Fem", 6, "1B", 789);
		Aluno a4 = new Aluno("Ronaldinho", "Masc", 7, "1B", 101);
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		Professor p1 = new Professor("Daniel", "Masc", 27, 12, "1A", "matematica");
		Professor p2 = new Professor("Angelica", "Fem", 28, 34, "1B", "portugues");
		professores.add(p1);
		professores.add(p2);

		Responsavel r1 = new Responsavel("Maria", "Fem", 28, 123, 123);
		Responsavel r2 = new Responsavel("Antonio", "Masc", 33, 456, 456);
		Responsavel r3 = new Responsavel("Renata", "Fem", 44, 789, 789);
		Responsavel r4 = new Responsavel("Ronaldo", "Masc", 57, 101, 101);
		responsaveis.add(r1);
		responsaveis.add(r2);
		responsaveis.add(r3);
		responsaveis.add(r4);

		int opcao = 1;
		// Nao mexer daqui pra cima!!!

		int l;
		do { // Inicio do looping principal
			System.out.println("==============================================");
			System.out.println("            | Java Escola v0.01 |");
			System.out.println("==============================================");
			System.out.println("          1 - Login | 2 - Cadastro");
			l = entrada.nextInt();

			switch (l) { // Inicio do switch login/cadastro
			case 1: // Acesso de login
				System.out.println("==============================================");
				System.out.println("            Faça login como: ");
				System.out.println("1 - Professor | 2 - Aluno | 3 - Responsavel");
				l = entrada.nextInt();

				switch (l) { // Inicio do switch do tipo de acessos
				case 1: // Inicio login Professor
					System.out.println("==============================================");
					System.out.println("            Qual o seu RP?");
					int rp = entrada.nextInt();

					for (Professor prof : professores) {
						if (prof.getRp() == rp) { // Checa se rp existe e loga
							System.out.println("Seja bem vindo(a) professor(a): " + prof.getNome());

							int p;
							do {
								System.out.println("==============================================");
								System.out.println("1 - Agenda | 2 - Notas | 3 - Faltas | 0 - Sair");
								p = entrada.nextInt();

								switch (p) {
								case 1:
									break;
								case 2:
									for (Aluno aluno : alunos) {
										if (aluno.getTurma() == prof.getTurma()) {
											System.out.println(aluno.getNome() + " da turma " + aluno.getTurma()
													+ " tem nota " + aluno.getNotas() + " em sua materia");
										}
									}
									break;
								case 3:
									for (Aluno aluno : alunos) {
										if (aluno.getTurma() == prof.getTurma()) {
											System.out.println(aluno.getNome() + " da turma " + aluno.getTurma()
													+ " tem " + aluno.getFaltas() + " faltas");
										}
									}
									break;
								default:
									p = 0;
								}
							} while (p != 0);
						}
					} // Fim for each
					break; // Fim login Professor

				case 2: // Inicio login Aluno
					System.out.println("Qual o seu RA?");
					int ra = entrada.nextInt();

					for (Aluno aluno : alunos) { // Inicio do for each
						if (aluno.getRa() == ra) { // Checa o RA do aluno se existe
							System.out.println("Seja bem vindo(a) aluno(a): " + aluno.getNome());

							int a; // Recebe opções do usuario
							do {
								System.out.println("==============================================");
								System.out.println("1 - Agenda | 2 - Notas | 3 - Faltas | 0 - Sair");
								a = entrada.nextInt();
								switch (a) {
								case 1:
									break;
								case 2:
									System.out.println("Sua nota e " + aluno.getNotas());
									break;
								case 3:
									System.out.println("Você tem " + aluno.getFaltas() + " faltas");
									break;
								default:
									a = 0;
								}

							} while (a != 0);
							break;
						}
					}
					break; // Fim login Aluno

				case 3: // Inicio login Responsavel
					System.out.println("Qual o seu RR? ");
					int rr = entrada.nextInt();

					for (Responsavel resp : responsaveis) {
						if (resp.getRr() == rr) { // Checa se rr existe e loga
							System.out.println("Seja bem vindo(a) responsavel: " + resp.getNome());

							int r;
							do {
								System.out.println("==============================================");
								System.out.println("1 - Agenda | 2 - Notas | 3 - Faltas | 0 - Sair");

								r = entrada.nextInt();
								switch (r) {
								case 1: {

									break;
								}
								case 2:
									for (Aluno aluno : alunos) {
										for (Professor prof : professores) {
											if (aluno.getRa() == resp.getRaAluno()) {
												System.out.println("Na materia " + prof.getMateria() + ", "
														+ aluno.getNome() + " tirou a nota " + aluno.getNotas());
												break;
											}
										}
									}
									break;

								case 3:
									for (Aluno aluno : alunos) {
										if (aluno.getRa() == resp.getRaAluno()) {
											System.out
													.println(aluno.getNome() + " tem " + aluno.getFaltas() + " faltas");
											break;
										}
									}
									break;

								default: {
									r = 0;
								}

								}

							} while (r != 0);

							break; // Fim login Aluno
						}
					} // Fim for each
					break; // Fim login Responsavel
				default:
					l = 0;
					System.out.println("Opção inválida!");
				}
				break;

			case 2: // Acesso de cadastro
				System.out.println("                Cadastrar: ");
				System.out.println("==============================================");
				System.out.println("1 - Professor | 2 - Aluno | 3 - Responsavel | 0 - Sair");
				int c;
				c = entrada.nextInt();
				switch (c) {
				case 1:

					break;
				case 2:

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
					alunos.add(al);

					break;
				case 3:
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

					Responsavel re = new Responsavel(nomeR, sexoR, idadeR, rR, rAluno);
					responsaveis.add(re);

					break;
				}
				break;
			default: // Saida dos acessos login/cadastro
				c = 0;
			}

		} while (opcao != 0); // Fim do looping principal

		System.out.println("Programa finalizado!");
		entrada.close();

	}
}