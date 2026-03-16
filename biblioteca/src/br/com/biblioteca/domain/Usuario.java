package br.com.biblioteca.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Deve ter id, nome e lista com livros que pegou
    // Construtor recebe id, nome e inicializa lista
    // Getter e Setter para id, nome e lista de livros
    private static int contadorId = 1;
    private int id;
    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.id = contadorId;
        contadorId ++;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        if (livrosEmprestados == null) {
            return null;
        }
        return this.livrosEmprestados;
    }

    public void addLivroEmprestado(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    public void removeLivroEmprestado(Livro livro) {
        livrosEmprestados.removeIf(l -> l.equals(livro));
        // Metodo removeIf
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

}
