package com.processoseletivo.gft.desafiotres;

public class Main {
    public static void main(String[] args) {

        int votosEmBranco = 40;
        double votosNulos = 20;

        Candidato bolsonaro = new Candidato("Bolsonaro", 1);
        Candidato lula = new Candidato("Lula", 2);
        Candidato marina = new Candidato("Marina", 3);
        Candidato ciro = new Candidato("Ciro", 4);

        ciro.setQuantVotos(10);
        marina.setQuantVotos(20);
        lula.setQuantVotos(50);
        bolsonaro.setQuantVotos(75);

        ciro.imprimeQuantVotos();
        marina.imprimeQuantVotos();
        lula.imprimeQuantVotos();
        bolsonaro.imprimeQuantVotos();

        double somaVotos = ciro.getQuantVotos() + marina.getQuantVotos() + lula.getQuantVotos() + bolsonaro.getQuantVotos();
        double porcentagemVotosNulos = votosNulos / somaVotos;
        double porcentagemVotosBrancos = votosEmBranco/somaVotos;

        System.out.println("\nTotal de votos nulos: "+votosNulos);
        System.out.println("Total de votos em Branco: "+votosEmBranco);

        System.out.println("\nPorcentagem de votos nulos: "+porcentagemVotosNulos * 100+"%");
        System.out.println("Porcentagem de votos nulos: "+porcentagemVotosBrancos * 100+"%");

    }
}
