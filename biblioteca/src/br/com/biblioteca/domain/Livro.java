package br.com.biblioteca.domain;

public class Livro {
    // Deve conter titulo, autor, isbn e boolean disponivel
    // A classe deve ter um construtor completo e outro que receba somente autor e titulo
    // Metodo emprestar altera "disponível" para false
    // Metodo devolver altera "disponível" para true

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "000-0000000000"; // Isbn padrão
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
