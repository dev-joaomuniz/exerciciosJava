package br.com.arenaRobos.domain;

public class RoboSentinela extends Robo implements AcaoDefesa {
    // Deve estender Robo
    // Deve implementar defesa

    public RoboSentinela(String nome, String modelo) {
        super(nome, modelo);
    }

    @Override
    public void exibirStatus() {
        System.out.println("\nRobô Sentinela!\nNome: " + this.getNome() + "\nModelo: " + this.getModelo());
    }

    @Override
    public void defender() {
        System.out.println("Defender");
    }

}
