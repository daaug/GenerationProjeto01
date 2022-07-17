package br.com.gen.sistema;

import java.util.Scanner;

public class Agenda {

    private int dia, mes, ano;
    private int hora;
    private int min;
    private String turma;
    private String descricao;

    public Agenda( int dia, int mes, int ano, int hora, int min, String turma, String descricao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.min = min;
        this.turma = turma;
        this.descricao = descricao;
    }

    public String getTurma() {
        return turma;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Agenda cadastro(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dia: ");
        int dia = entrada.nextInt();

        System.out.println("Mes: ");
        int mes = entrada.nextInt();

        System.out.println("Ano: ");
        int ano = entrada.nextInt();

        System.out.println("Hora: ");
        int hora = entrada.nextInt();

        System.out.println("Minutos: ");
        int min = entrada.nextInt();

        System.out.println("Turma: ");
        String turma = entrada.next();

        System.out.println("Descricao: ");
        String descricao = entrada.next();

        entrada.close();

        Agenda agenda = new Agenda(dia, mes, ano, hora, min, turma, descricao);
        return agenda;
    }

    public String getAgendaCompleta(){
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno() +
                " as " + this.getHora() + "h" + this.getMin() + ", turma " +
                this.getTurma() + ": " + this.getDescricao();
    }

}
