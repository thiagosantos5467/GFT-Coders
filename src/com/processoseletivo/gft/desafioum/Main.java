package com.processoseletivo.gft.desafioum;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro("Camaro");

        System.out.println("Digite o preco do carro: ");
        double precoAux = scan.nextInt();

        System.out.println("\nTABELA COM OUTRAS CONDIÇÕES DE PAGAMENTO");
        System.out.println("-----------------------------------------");
        System.out.println("Parcelas             Valor para pagamento");
        carro.calculaPrecoFinal(precoAux,0);
        System.out.println("A vista                " + carro.getPreco());
        carro.calculaPrecoFinal(precoAux,6);
        System.out.println("6                      " + carro.getPreco());
        carro.calculaPrecoFinal(precoAux, 12);
        System.out.println("12                      " + carro.getPreco());
        carro.calculaPrecoFinal(precoAux, 18);
        System.out.println("18                      " + carro.getPreco());
        carro.calculaPrecoFinal(precoAux, 24);
        System.out.println("24                      " + carro.getPreco());
        carro.calculaPrecoFinal(precoAux, 30);
        System.out.println("30                      " + carro.getPreco());
    }
}
