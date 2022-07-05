package com.processoseletivo.gft.desafioquatro;

public class CamaroteInferior extends Vip{
    protected double valorCamaroteInf = super.valor+=(super.valor*0.8);

    public void imprimeValor(){
        System.out.println("O valor do camarote inferior é: "+this.valor);
    }
}
