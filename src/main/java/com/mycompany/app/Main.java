package com.mycompany.app;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("George Orwell");
        autor.setNacionalidade("Britânico");

        Livro livro = new Livro();
        livro.setTitulo("1984");
        livro.setAutor(autor);
        livro.setGenero("Distopia");
        livro.validarDisponibilidade();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        //pessoa.getLivro(livro); // Atribuindo livro à pessoa, escolher outro argumento se necessário

        Usuario usuario = new Usuario();
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataRetirada(new Date());

        System.out.println("Disponível: " + livro.isDisponivel());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + pessoa.getNome());
        System.out.println("Idade: " + usuario.getIdade() + " anos");
        System.out.println("Data de retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());


        // System.out.println("Obras publicadas por gênero:");
        // System.out.println(livro.getGenero() + ": " + livro.getTitulo());
        // System.out.println("Histórico de empréstimos:");
        // for (Emprestimo e : usuario.getHistoricoEmprestimos()) {
        //     System.out.println(" - Livro: " + e.getLivro().getTitulo() + ", Data de Retirada: " + e.getDataRetirada() + ", Data de Devolução: " + e.getDataDevolucao());
        //System.out.println("Empréstimo ativo: " + emprestimo.getStatus());
        }
    }