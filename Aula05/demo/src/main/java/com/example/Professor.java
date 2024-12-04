package com.example;

public class Professor extends Pessoa {
    private String especialidade;
    private Float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public void receberAum(Float aum){
        this.setSalario(this.getSalario() + aum);
    }
    
}
