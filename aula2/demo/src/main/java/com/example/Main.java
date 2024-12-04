package com.example;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("MIC", "Amarela", 0.4f);
        Caneta c2 = new Caneta("kkk", "laranja", 1.5f);
        System.out.println(c1.toString() + "\n" + c2.toString());
    }
}