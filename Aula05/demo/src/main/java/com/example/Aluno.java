package com.example;

public class Aluno extends Pessoa{
    private String curso;
    private Integer matr;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getMatr() {
        return matr;
    }

    public void setMatr(Integer matr) {
        this.matr = matr;
    }

    public void cancelarMatr(){
        System.out.println("Cancelando a matrícula...");
    }

}
