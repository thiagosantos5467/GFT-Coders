package com.processoseletivo.gft.desafioquatro;

public class Vip extends Ingresso{

    protected double valorVip = super.valor+=(super.valor*0.3);

    public void imprimeValor(){
        System.out.println("O valor do ingresso VIP é: "+this.valor);
    }
}
