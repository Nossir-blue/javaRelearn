package com.example;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "Jubi");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");
        
        Visualizacao viz = new Visualizacao(g[0], v[2]);

    }
}