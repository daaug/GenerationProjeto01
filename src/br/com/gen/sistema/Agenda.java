package br.com.gen.sistema;

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

    public String getAgendaCompleta(){
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno() +
                " as " + this.getHora() + "h" + this.getMin() + ", turma " +
                this.getTurma() + ": " + this.getDescricao();
    }

}
