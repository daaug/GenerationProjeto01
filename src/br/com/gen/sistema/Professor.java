package br.com.gen.sistema;

import java.util.Scanner;

public class Professor {

    private String nome;
    private int rr;
    private String turma;
    private String materia;

    public Professor(String nome, int rr, String turma, String materia) {
        this.nome = nome;
        this.rr = rr;
        this.turma = turma;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRr() {
        return rr;
    }

    public void setRr(int rr) {
        this.rr = rr;
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

    public void painel() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.rr);
        System.out.println("Turma: " + this.turma);
        System.out.println("Matérias lecionadas: " + this.materia);
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {

        Professor[] prof = new Professor[4];
        prof[0] = new Professor("Pedro", 111, "1-A", "Matemática");
        prof[1] = new Professor("Carlos", 222, "2-A", "Física");
        prof[2] = new Professor("Ana", 333, "3-A", "Inglês");
        prof[3] = new Professor("Danilo", 444, "4-A", "Química");

        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("          | Registro de Professores |          ");
        System.out.println("---------------------------------------------");
        System.out.println("Olá, professor(a)!");
        System.out.print("Digite o seu RP:");
        System.out.println();
        int RP = input.nextInt();
        System.out.println();


        if (RP == 111) {
            System.out.println("---------------------------------------------");
            prof[0].painel();
        } else if (RP == 222) {
            System.out.println("---------------------------------------------");
            prof[1].painel();
        } else if (RP == 333) {
            System.out.println("---------------------------------------------");
            prof[2].painel();
        } else if (RP == 444) {
            System.out.println("---------------------------------------------");
            prof[3].painel();
        }else if(RP == 999){
            for (int i = 0; i < prof.length; i++) {
                prof[i].painel();
            }
        } else {
            System.out.println("Registro não encontrado, tente novamente");
        }

    }
}
