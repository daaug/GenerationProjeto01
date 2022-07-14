package br.com.gen.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Nao mexer daqui pra baixo!!!
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Professor> professores = new ArrayList<Professor>();

		Professor p1 = new Professor();
		p1.dadosProfessor("Daniel", "Masc", 27, 34567, "1A", "Matem�tica");
		professores.add(p1);
		
		Professor p2 = new Professor();
		p2.dadosProfessor("Ang�lica", "Fem", 28, 56096, "2B", "Portugu�s");
		professores.add(p2);

		Aluno a1 = new Aluno();
		a1.dadosAluno("Ronaldo", "Masc", 13, "1A", 12345, 5, 7.5);
		alunos.add(a1);
		
		Aluno a2 = new Aluno();
		a1.dadosAluno("Kenai", "Masc", 7, "2B", 23456, 6, 8);
		alunos.add(a2);
		
		Aluno a3 = new Aluno();
		a1.dadosAluno("Helo�sa", "Fem", 6, "2B", 97539, 7, 9.5);
		alunos.add(a3);
		
		
		Responsavel r1 = new Responsavel();

		int acesso, tipoAcesso;
		// Nao mexer daqui pra cima!!!

		do { // Inicio do looping principal
			System.out.println("1 - Login | 2 - Cadastro");
			acesso = entrada.nextInt();

			switch (acesso) { // Inicio do switch login/cadastro
			case 1: // Acesso de login
				System.out.println("Logar: ");
				System.out.println("1 - Professor | 2 - Aluno | 3 - Responsável");
				tipoAcesso = entrada.nextInt();

				switch (tipoAcesso) { // Inicio do switch do tipo de acessos
				case 1: // Inicio login Professor
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
				acesso = 0;
			}

		} while (acesso != 0); // Fim do looping principal

		entrada.close();

	}
}
