package com.example.caneta;

public class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Está tampada? " + this.isTampada());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
    }

    public void escrever(){
        
    }
    public void rabiscar(){
        if(this.isTampada()){
            System.out.println("ERRO: Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Float getPonta() {
        return ponta;
    }
    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public boolean isTampada() {
        return tampada;
    }
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    @Override
    public String toString() {
        return "Caneta {modelo=" + modelo + 
               ", cor=" + cor + 
               ", ponta=" + ponta + 
               ", carga=" + carga + 
               ", tampada=" + tampada + "}";
    }

    
    
}
