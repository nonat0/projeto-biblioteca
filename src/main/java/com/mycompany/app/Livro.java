package com.mycompany.app;

public class Livro {

    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;

                          // MUDAR AUTOR PRA STRING PRA PODER SER SETADO NA MAIN DA MESMA FORMA QUE TITULO E GENERO ESTÃO ( CONFERIR DEPOIS!)
    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade() {
        this.disponivel = false;
    }
}
