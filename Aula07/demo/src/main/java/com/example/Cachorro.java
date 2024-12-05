package com.example;

public class Cachorro extends Lobo{
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au");
    }
    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(Integer hora, Integer min){
        if (hora<12) {
            System.out.println("Abanar");
        } else if(hora>=18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(Boolean dono){
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(Integer idade, Float peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso<10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
