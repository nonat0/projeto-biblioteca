package com.mycompany.app;
import java.util.*;

public class Emprestimo {
    public Emprestimo() {
    // Optionally initialize fields
}
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;

    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Date getDataRetirada() {
        dataDevolucao = new Date(System.currentTimeMillis() + 604800000L); // 7 dias
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
