package br.com.gen.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Scanner s = new Scanner(System.in);
    int opcao = 0;

    do { // Inicio do looping

      System.out.println("1 - Logar | 2 - Cadastrar | 0 - Sair");
      opcao = s.nextInt();

      if (opcao == 1){ // Sessao Login
        System.out.println("Logar como:");
        System.out.println("1 - Professor | 2 - Responsavel | 3 - Aluno | 0 - Sair");
        opcao = s.nextInt();

        if (opcao == 1){ // Logar Professor

        } else if (opcao == 2) { // Logar Responsavel

        } else if (opcao == 3) { // Logar Aluno

        } // Fim Logar Aluno

      }else if(opcao == 2){ // Sessao Cadatro
        System.out.println("Cadastrar:");
        System.out.println("1 - Professor | 2 - Responsavel | 3 - Aluno | 0 - Sair");
        opcao = s.nextInt();

        if (opcao == 1){ // Cadastrar Professor

        } else if (opcao == 2) { // Cadastrar Responsavel

        } else if (opcao == 3) { // Cadastrar Aluno
          Aluno aluno = new Aluno();

          System.out.println("Insira nome ");
          aluno.setNome(s.next());

          System.out.println("Insira RA ");
          aluno.setRa(s.nextInt());

          alunos.add(aluno);
        } // Fim Cadastro Aluno
      } // Fim Sessao Cadastro
    }while (opcao != 0); // Fim do loop

    for (Aluno aluno: alunos) {
      System.out.print(aluno.getNome() + " ");
      System.out.print(aluno.getRa());
      System.out.println("");
    }

    //System.out.println(alunos.get(0).getNome());

  }
}
