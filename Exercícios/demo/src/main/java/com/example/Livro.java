package com.example;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, 
                 String autor, 
                 Integer totPaginas, 
                 Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    public String detalhes() {
        return "Livro {\ntitulo=" + titulo + 
               ", \nautor=" + autor + 
               ", \ntotPaginas=" + totPaginas + 
               ", \npagAtual=" + pagAtual
                + ", \naberto=" + aberto + 
                ", \nleitor=" + leitor.getNome() + "\n}";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(pagina > this.totPaginas){
            this.pagAtual = 0;
        } else {this.setPagAtual(pagina);}
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
}
