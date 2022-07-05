package com.processoseletivo.gft.desafiodois;

public class Main {
    public static void main(String[] args) {

        Aluno alunoUm = new Aluno(1001, 10, 8, 5, 0.8);
        Aluno alunoDois = new Aluno(1002, 7, 8, 8, 0.7);
        Aluno alunoTres = new Aluno(1003, 7, 8, 5, 0.9);
        Aluno alunoQuatro = new Aluno(1004, 3, 6, 5, 1);
        Aluno alunoCinco = new Aluno(1005, 1, 3, 10, 0.5);


        alunoUm.calculaNotaFinal();
        alunoDois.calculaNotaFinal();
        alunoTres.calculaNotaFinal();
        alunoQuatro.calculaNotaFinal();
        alunoCinco.calculaNotaFinal();

        int reprovados = 0;

        if (alunoUm.isAprovado() == false) {
            reprovados++;
        } else if (alunoDois.isAprovado() == false) {
            reprovados++;
        } else if (alunoTres.isAprovado() == false) {
            reprovados++;
        } else if (alunoQuatro.isAprovado() == false) {
            reprovados++;
        } else if (alunoCinco.isAprovado() == false) {
            reprovados++;
        }
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.println("Porcentagens de alunos reprovados: " + reprovados*20 + "%");


    }

}
