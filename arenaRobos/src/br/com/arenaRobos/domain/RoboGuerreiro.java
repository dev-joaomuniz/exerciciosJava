package br.com.arenaRobos.domain;

public class RoboGuerreiro extends Robo implements AcaoAtaque, AcaoDefesa {
    // Deve estender Robo
    // Deve implementar ataque e defesa
    // Metodos só exibem mensagem

    public RoboGuerreiro(String nome, String modelo) {
        super(nome, modelo);
    }

    @Override
    public void exibirStatus() {
        System.out.println("\nRobô Guerreiro!\nNome: " + this.getNome() + "\nModelo: " + this.getModelo());
    }

    @Override
    public void atacar() {
        System.out.println("Atacando!");
    }

    @Override
    public void defender() {
        System.out.println("Defendendo");
    }

}
