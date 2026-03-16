package br.com.arenaRobos.app;

import br.com.arenaRobos.domain.AcaoAtaque;
import br.com.arenaRobos.domain.Robo;
import br.com.arenaRobos.domain.RoboGuerreiro;
import br.com.arenaRobos.domain.RoboSentinela;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deve ter lista de Robôs (genérico)
        // Deve exibir o status de todos, se for Guerreiro ele ataca

        ArrayList<Robo> robos = new ArrayList<>();

        Robo robo1 = new RoboGuerreiro("Atom", "G2");
        robos.add(robo1);
        Robo robo2 = new RoboSentinela("Garoto Barulhento", "Desconhecido");
        robos.add(robo2);
        Robo robo3 = new RoboGuerreiro("Zeus", "Takamido Motors");
        robos.add(robo3);
        Robo robo4 = new RoboSentinela("Metro", "Desconhecido");
        robos.add(robo4);

        for (Robo robo : robos) {
            robo.exibirStatus();
            if (robo instanceof AcaoAtaque) {
                ((AcaoAtaque) robo).atacar();
            }
        }

    }
}
