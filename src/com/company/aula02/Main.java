package com.company.aula02;

public class Main {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();

        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "bic";
        c2.cor = "vermelha";
        c2.status();
    }
}
