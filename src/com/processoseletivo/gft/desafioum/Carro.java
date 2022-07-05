package com.processoseletivo.gft.desafioum;

public class Carro {
    private String nome;
    private double preco;

    public Carro() {
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calculaPrecoFinal(byte parcelas){
        switch(parcelas){
            case 0:
                this.preco = this.preco-=(preco*0.2);
                break;
            case 6:
                this.preco = this.preco+=(preco*0.03);
                break;
            case 12:
                this.preco = this.preco+=(preco*0.06);
                break;
            case 18:
                this.preco = this.preco+=(preco*0.09);
                break;
            case 24:
                this.preco = this.preco+=(preco*0.12);
                break;
            case 30:
                this.preco = this.preco+=(preco*0.15);
                break;
            default:
                System.out.println("Quantidade de parcelas invalida!");
        }
    }

}
