package com.example;

public class Gafanhoto extends Pessoa{
    private Integer totAssistido;
    private String login;
    
    
    public Gafanhoto(String nome, Integer idade, Character sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
        
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    
}
