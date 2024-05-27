package br.com.alura.modelos;

public class Audio{
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }
}
