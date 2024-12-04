package com.example;

public abstract class Animal {
    protected Float peso;
    protected Integer idade;
    protected Integer membros;

    protected Float getPeso() {
        return peso;
    }
    protected void setPeso(Float peso) {
        this.peso = peso;
    }
    protected Integer getIdade() {
        return idade;
    }
    protected void setIdade(Integer idade) {
        this.idade = idade;
    }
    protected Integer getMembros() {
        return membros;
    }
    protected void setMembros(Integer membros) {
        this.membros = membros;
    }
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
