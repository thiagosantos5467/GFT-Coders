package com.processoseletivo.gft.desafiodois;

public class Aluno {
    private int matricula;
    private int nota1;
    private int nota2;
    private int nota3;
    private int notaFinal;
    private double frequencia;
    private boolean isAprovado;

    public Aluno() {
    }

    public Aluno(int matricula, int nota1, int nota2, int nota3, double frequencia) {
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public boolean isAprovado() {
        return isAprovado;
    }

    public void calculaNotaFinal(){
        this.notaFinal = (nota1+nota2+nota3)/3;
        if (notaFinal < 7 || this.getFrequencia() < 0.7 ){
            System.out.println("Aluno de matricula "+this.getMatricula() + " nota " + this.notaFinal + " frequencia " + this.frequencia + " reprovado!");
            this.isAprovado = false;
        } else {
            this.isAprovado = true;
            System.out.println("Aluno de matricula "+this.getMatricula() + " nota " + this.notaFinal + " frequencia " + this.frequencia + " aprovado!");
        }

    }

}
