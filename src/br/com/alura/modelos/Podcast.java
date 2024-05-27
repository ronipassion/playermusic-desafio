package br.com.alura.modelos;

import br.com.alura.interfaces.CalcularCurtida;

public class Podcast extends Audio implements CalcularCurtida {
    private String host;
    private int temporada;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    @Override
    public String calcularCurtida(int reproducoes) {
        if (reproducoes > 400) {
            return "O podcast " + getTitulo() + " já foi reproduzido " + reproducoes + " vezes e é um dos preferidos da comunidade!";
        } else {
            return "O podcast " + getTitulo() + " foi reproduzido " + reproducoes + " vezes e vale a pena conferir!";
        }
    }
}
