package com.example;

public class Video implements AcoesVideo{
    private String titulo;
    private Integer avaliacao;
    private Integer views;
    private Integer curtidas;
    private Boolean reproduzindo;
    
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(Integer avaliacao) {
        int nova;
        nova =(int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    public Integer getViews() {
        return views;
    }
    public void setViews(Integer views) {
        this.views = views;
    }
    public Integer getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }
    public Boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }
    
}
