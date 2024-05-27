package br.com.alura.modelos;

import br.com.alura.interfaces.ReproduzirAudio;

public class Musicas extends Audio implements ReproduzirAudio {
    private String album;
    private String artista;
    private int anoDeLancamento;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String reproduzir() {
        return "Reproduzindo a música: " + getTitulo() + " do artista " + getArtista() + " lançada em " + getAnoDeLancamento();
    }
}
