package com.example;

public class Pessoa {
    protected String nome;
    protected Integer idade;
    protected Character sexo;
    protected Float exp;

    
    public Pessoa(String nome, Integer idade, Character sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exp = 0f;
    }

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

    public Float getExp() {
        return exp;
    }

    public void setExp(Float exp) {
        this.exp = exp;
    }

    protected void ganharExp(){
        
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", exp=" + exp + "]";
    }

    
}
