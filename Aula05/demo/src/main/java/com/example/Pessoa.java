package com.example;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Character sexo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Character getSexo() {
        return sexo;
    }
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    @Override
    public String toString() {
        return "Pessoa {nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "}";
    }    
}
