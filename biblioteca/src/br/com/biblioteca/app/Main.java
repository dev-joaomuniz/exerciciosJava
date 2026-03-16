package br.com.biblioteca.app;

import br.com.biblioteca.domain.Biblioteca;
import br.com.biblioteca.domain.Livro;
import br.com.biblioteca.domain.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criar 5 livros usando os dois tipos de construtores
        // Criar dois usuários
        // Emprestar livro para os usuários
        // Tentar emprestar livro indisponível
        // Ver a lista de todos livros
        // Ver somente a lista de livros disponíveis
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("\n=-=-=-=-=-= Seja Bem-Vindo =-=-=-=-=-=");

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8520937747");
        biblioteca.addAcervoLivros(livro1);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        biblioteca.addAcervoLivros(livro2);
        Livro livro3 = new Livro("O Senhora Dos Anéis", "J.R.R. Tolkien", "978-0544003415");
        biblioteca.addAcervoLivros(livro3);
        Livro livro4 = new Livro("Harry Potter e as Relíquias da Morte", "J.K. Rowling", "978-0545010221");
        biblioteca.addAcervoLivros(livro4);
        Livro livro5 = new Livro("O Sol é Para Todos", "Harper Lee");
        biblioteca.addAcervoLivros(livro5);

        Usuario usuario1 = new Usuario("José");
        Usuario usuario2 = new Usuario("Maria");

        biblioteca.registrarEmprestimo(usuario1, livro1);
        biblioteca.registrarEmprestimo(usuario1, livro2);
        biblioteca.registrarEmprestimo(usuario2, livro2);
        biblioteca.registrarEmprestimo(usuario2, livro3);
        biblioteca.registrarEmprestimo(usuario2, livro4);

        System.out.println("\n---- Todos os livros do acervo ----");
        for (Livro livro : biblioteca.getAcervoLivros()) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("\n---- Todos os livros disponíveis do acervo ----");
        for (Livro livro : biblioteca.getAcervoLivrosDisponiveis()) {
            System.out.println(livro.getTitulo());
        }

        biblioteca.registrarDevolucao(usuario2, livro1);
        biblioteca.registrarDevolucao(usuario1, livro1);
        biblioteca.registrarDevolucao(usuario2, livro4);


        System.out.println("\n---- Todos os livros disponíveis do acervo ----");
        for (Livro livro : biblioteca.getAcervoLivrosDisponiveis()) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("\nLivros emprestados para " + usuario1.getNome());
        for (Livro livro : usuario1.getLivrosEmprestados()) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("\nLivros emprestados para " + usuario2.getNome());
        for (Livro livro : usuario2.getLivrosEmprestados()) {
            System.out.println(livro.getTitulo());
        }

    }
}
