package br.com.biblioteca.domain;

import java.util.ArrayList;

public class Biblioteca {
    // Deve conter uma lista com o acervo de livros
    // Metodo registrar Empréstimo que recebe usuário e livro
    // Verifica se livro está disponível, se sim chama livro.emprestar()
    // Adiciona livro a lista do usuário e exibe mensagem de sucesso
    // Metodo registrar Devolução que recebe usuário e livro
    // Remove o livro da lista do usuário e chama livro.devolver()

    private ArrayList<Livro> acervoLivros = new ArrayList<>();
    private ArrayList<Livro> acervoLivrosDisponiveis = new ArrayList<>();

    public void registrarEmprestimo(Usuario usuario, Livro livro) {
        for (Livro l : acervoLivros) {
            if (l.getIsbn().equals(livro.getIsbn())) {
                if (livro.isDisponivel()) {
                    // Caso for isbn padrão passa, mesmo que não esteja sendo comparado os livros iguais
                    // Isso não afeta o resultado, o livro é puxado pelo objeto não pelo código
                    livro.emprestar();
                    usuario.addLivroEmprestado(livro);
                    System.out.println("\nLivro \"" + livro.getTitulo() + "\" emprestado com sucesso para " + usuario.getNome());
                    return;
                }
                System.out.println("\nPerdão " + usuario.getNome() + ", o livro \"" + livro.getTitulo() + "\" não está disponível no momento!");
                return;
            }
        }
        System.out.println("\nO livro passado não existe no sistema!");
    }

    public void registrarDevolucao(Usuario usuario, Livro livro) {
        if (acervoLivros.contains(livro)) {
            if (livro.isDisponivel()) {
                System.out.println("\nOlá " + usuario.getNome() + " este livro \"" + livro.getTitulo() + "\" não foi emprestado!");
                return;
            }
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.removeLivroEmprestado(livro);
                livro.devolver();
                System.out.println("\nLivro \"" + livro.getTitulo() + "\" devolvido com sucesso por " + usuario.getNome());
                return;
            } else {
                System.out.println("\nNão foi você que pegou este livro emprestado!");
                return;
            }
        }
        System.out.println("\nO livro passado não existe no sistema!");
    }

    public void addAcervoLivros(Livro livro) {
        if (acervoLivros.contains(livro)) {
            System.out.println("O livro " + livro.getTitulo() + " já está cadastrado no nosso sistema");
            return;
        }
        acervoLivros.add(livro);
        System.out.println("\nLivro \"" + livro.getTitulo() + "\" adicionado a biblioteca!");
    }

    public ArrayList<Livro> getAcervoLivrosDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : acervoLivros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public ArrayList<Livro> getAcervoLivros() {
        return acervoLivros;
    }
}
