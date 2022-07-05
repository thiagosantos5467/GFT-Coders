package com.processoseletivo.gft.desafiotres;

public class Candidato {
    private String nome;
    private int codigo;
    private int quantVotos;

    public Candidato() {
    }

    public Candidato(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantVotos() {
        return quantVotos;
    }

    public void setQuantVotos(int quantVotos) {
        this.quantVotos = quantVotos;
    }

    public void imprimeQuantVotos(){
        System.out.println("Quantidades de votos em "+this.getNome() + ", candidato de codigo "+ this.getCodigo()+" é: " + this.getQuantVotos()+" votos.");
    }

}
