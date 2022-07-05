package com.processoseletivo.gft.desafioum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro("Camaro");

        System.out.println("Digite o preco do camaro: ");
        carro.setPreco(scan.nextDouble());

        System.out.println("Agora digite a quantidade de parcelas para pagamento: ");
        byte parcelas = scan.nextByte();

        carro.calculaPrecoFinal(parcelas);

        System.out.println("O preço final do camaro é de R$" + carro.getPreco());

    }
}
