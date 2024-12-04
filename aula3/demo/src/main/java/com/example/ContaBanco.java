package com.example;

public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;

    public ContaBanco(){
        this.saldo = 0f;
        this.status = false;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC") {
            this.setSaldo(50f);
        } else if(t=="CP"){
            this.setSaldo(150f);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.err.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if(this.getSaldo() < 0){
            System.err.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.err.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){ 
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else { System.err.println("Saldo insuficiente para saque");}
        } else { System.err.println("Impossível sacar de uma conta fechada");}
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){ v = 12;} 
        else if(this.getTipo().equals("CP")){ v = 20;}
        if(this.getStatus()){this.setSaldo(
            this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else { System.err.println("Impossível pagar uma conta fechada!");}
    }

    public Integer getNumConta() {
        return numConta;
    }
    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public Float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaBanco {" +
               "\nnumConta=" + this.getNumConta() + 
               ",\n tipo=" + this.getTipo() + 
               ",\n dono=" + this.getDono() + 
               ",\n saldo=" + this.getSaldo() + 
               ",\n status=" + this.getStatus() + "}";
    }
    
}
