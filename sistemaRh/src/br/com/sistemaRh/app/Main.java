package br.com.sistemaRh.app;

import br.com.sistemaRh.domain.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar funcionários
        // Exibir total de funcionários
        // Exibir dados de todos os funcionários
        // Alterar departamento e salário de algum funcionário
        // Menu de opções: Exibir total de funcionários,
        // exibir dados do funcionário, excluir funcionário e sair

        Funcionario funcionario1 = new Funcionario("João", 4349.1, "Engenheiro de Software");
        Funcionario funcionario2 = new Funcionario("Maria", 2492.58, "Analista de Dados");
        Funcionario funcionario3 = new Funcionario("José", 1278.3, "Recepcionista");
        Scanner scanner = new Scanner(System.in);
        String escolha = "";
        int escolhaInt;

        while (true) {
            try {
                System.out.print("\n1 - Exibir total de funcionários\n2 - Exibir dados de funcionário\n3 - Excluir funcionário\n4 - Sair\nDigite: ");
                escolha = scanner.nextLine();
                switch (escolha) {
                    case "1":
                        Thread.sleep(2000); // Timer para melhor experiência
                        System.out.println("\nTotal de funcionários na empresa: " + Funcionario.exibirTotalFuncionarios());
                        break;
                    case "2":
                        Thread.sleep(1000);
                        System.out.print("\nDigite o id do funcionário que deseja analisar (1 | 2 | 3): ");
                        escolhaInt = scanner.nextInt();
                        Thread.sleep(2000);
                        Funcionario.exibirDadosFuncionario(escolhaInt);
                        scanner.nextLine(); // Consumir quebra de linha
                        break;
                    case "3":
                        Thread.sleep(1000);
                        System.out.print("\nDigite o id do funcionário que deseja excluir (1 | 2 | 3): ");
                        escolhaInt = scanner.nextInt();
                        Thread.sleep(2000);
                        Funcionario.excluirFuncionario(escolhaInt);
                        scanner.nextLine(); // Consumir quebra de linha
                        break;
                    case "4":
                        System.out.println("\nFinalizando...");
                        Thread.sleep(2000);
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        Thread.sleep(1500);
                        System.out.println("\nDigite algo válido!");
                        break;
                }
            } catch (InterruptedException e) {
                System.err.println("A thread foi interrompida!");
            }

        }

    }
}
