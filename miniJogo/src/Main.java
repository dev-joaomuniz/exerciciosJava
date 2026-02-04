import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Minijogo RPG
        // Jogador vs Máquina
        // Opção de atacar e curar(Se estiver com 30% ou menos de vida)
        // Dano e cura gerados aleatoriamente pela classe random
        // Array para guardar o histórico dos últimos 5 danos.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        byte opcoes = 0;
        int[] danosCausados = new int[5];
        int[] danosRecebidos = new int[5];
        int contadorDanosCausados = 0, contadorDanosRecebidos = 0;

        int vidaJogador = 100, vidaInimigo = 100;
        int ataqueJogador = 0, ataqueInimigo = 0;
        int curaJogador;
        float vidaMinimaCura = vidaJogador * 0.3f;

        do {
            System.out.println("\nVida do jogador: " + vidaJogador + " | Vida do inimigo: " + vidaInimigo);
            System.out.print("1 - Atacar\n2- Curar\nEscolha: ");
            opcoes = scanner.nextByte();

            switch (opcoes) {
                case 1:
                    // Ataque do jogador, aleatório entre 5 e 20
                    ataqueJogador = random.nextInt(5, 21);
                    vidaInimigo -= ataqueJogador;

                    // Ataque do Jogador
                    System.out.println("\nVocê causou " + ataqueJogador + " de dano!");

                    // Lógica de comparações para os ataques entrarem na última posição do array
                    if (contadorDanosCausados == 0) {
                        danosCausados[0] = ataqueJogador;
                        contadorDanosCausados ++;
                    } else if (contadorDanosCausados < danosCausados.length) {
                        danosCausados[contadorDanosCausados] = ataqueJogador;
                        contadorDanosCausados ++;
                    } else {
                        for (int i = 0; i < danosCausados.length - 1; i++) {
                            danosCausados[i] = danosCausados[i+1];
                        }
                        danosCausados[danosCausados.length - 1] = ataqueJogador;
                    }
                    break;

                case 2:
                    // Lógica de Cura do jogador
                    if (vidaJogador >= vidaMinimaCura) {
                        System.out.println("\nVocê só pode se curar se estiver com menos de 30% da sua vida");
                        continue;
                    } else {
                        curaJogador = random.nextInt(5, 26);
                        vidaJogador += curaJogador;
                        System.out.println("\nVocê curou " + curaJogador + " pontos de vida!");
                    }
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
                    continue;
            }

            // Ataque do Inimigo aleatório entre 5 e 20
            ataqueInimigo = random.nextInt(5, 21);
            vidaJogador -= ataqueInimigo;

            // Lógica de comparações para os ataques entrarem na última posição do array
            if (contadorDanosRecebidos == 0) {
                danosRecebidos[0] = ataqueInimigo;
                contadorDanosRecebidos ++;
            } else if (contadorDanosRecebidos < danosRecebidos.length) {
                danosRecebidos[contadorDanosRecebidos] = ataqueInimigo;
                contadorDanosRecebidos ++;
            } else {
                for (int i = 0; i < danosRecebidos.length - 1; i++) {
                    danosRecebidos[i] = danosRecebidos[i+1];
                }
                danosRecebidos[danosRecebidos.length - 1] = ataqueInimigo;
            }

            // Ataque do Inimigo
            System.out.println("O inimigo causou " + ataqueInimigo + " de dano!");
            System.out.println("Últimos 5 danos causados: " + Arrays.toString(danosCausados));
            System.out.println("Últimos 5 danos recebidos: " + Arrays.toString(danosRecebidos));


            if (vidaInimigo <= 0) {
                System.out.println("\nA vida do inimigo chegou a 0!\nParabéns, você ganhou!!!");
            } else if (vidaJogador <= 0) {
                System.out.println("\nA sua vida chegou a zero!\nVocê perdeu. Tente novamente!");
            }

        } while (vidaJogador > 0 && vidaInimigo > 0);
    }
}
