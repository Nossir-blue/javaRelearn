package com.example.pessoa;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;
    private boolean casado;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public boolean isCasado() {
        return casado;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + 
                ", altura=" + altura + 
                ", peso=" + peso + 
                ", casado=" + casado + "]";
    }

    

}
