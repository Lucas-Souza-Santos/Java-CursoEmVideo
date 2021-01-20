package com.company.aula02;

public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada ? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("Erro! Não posso rabiscar.");
        }else{
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

}
