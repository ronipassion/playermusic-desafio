package br.com.alura.principal;

import br.com.alura.modelos.Musicas;
import br.com.alura.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        var musica = new Musicas();
        var podcast = new Podcast();

        musica.setArtista("Iron Cesar");
        musica.setTitulo("Olho de Tandera");
        musica.setAlbum("Esfomeado");
        musica.setAnoDeLancamento(2024);

        podcast.setTitulo("Os olhos do cachorro");
        podcast.setHost("Cesar Iron");
        podcast.setTemporada(2);
        podcast.setDuracao(23);

        System.out.println(musica.reproduzir());
        System.out.println(podcast.calcularCurtida(500));

    }
}
