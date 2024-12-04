package com.example;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, String cor, float ponta) {
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.setCor(cor);
        this.tampar();
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    @Override
    public String toString() {
        return "Caneta [modelo=" + this.getModelo() + 
        ", ponta=" + this.getPonta() + 
        ", cor=" + this.getCor() + 
        ", tampada=" + this.tampada + "]";
    }
    


}
