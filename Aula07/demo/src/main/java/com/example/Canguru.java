package com.example;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Usando A bolsa ou whatever");
    }
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
