package com.example;

import com.example.ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        System.out.println("----------------------");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        System.out.println("----------------------");

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(1000);
        p1.sacar(150);
        p1.fecharConta();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}