package com.example;

public class Bolsista extends Aluno{
    private Float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this+getNome() + " é bolsista! Pagamento facilitado");
    }

    public Float getBolsa() {
        return bolsa;
    }

    public void setBolsa(Float bolsa) {
        this.bolsa = bolsa;
    }
}
