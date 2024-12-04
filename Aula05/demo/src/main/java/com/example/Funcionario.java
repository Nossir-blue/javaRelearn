package com.example;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        this.setTrabalhando(false);
    }
    
}
