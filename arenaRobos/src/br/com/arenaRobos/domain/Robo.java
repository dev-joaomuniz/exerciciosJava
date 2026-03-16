package br.com.arenaRobos.domain;

public abstract class Robo {
    // Deve ter nome e modelo
    // Metodo abstrato para exibir status
    private String nome;
    private String modelo;

    public Robo(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public abstract void exibirStatus();

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }
}
