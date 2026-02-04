import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Simulador de Caixa Eletrônico
        // Sistema que permita saques e depósitos
        // Só é encerrado quando o usuário escolher sair
        // Não pode haver saques maiores que o saldo atual
        // Não pode haver depósitos negativos

        // Opções: Ver saldo, Depositar, Sacar, Câmbio(Converter moeda) e Sair

        double saldo = 0, deposito, saque;

        byte opcoes = 0, opcoesCambio = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEscolha uma opção: \n1- Ver saldo\n2- Depositar\n3- Sacar\n4- Câmbio\n5- Sair\nDigite: ");
            opcoes = scanner.nextByte();

            switch (opcoes) {
                case 1:
                    String formatadoSaldo = String.format("%.2f", saldo);
                    System.out.println("\nO saldo atual da conta é: " + formatadoSaldo);
                    break;

                case 2:
                    System.out.print("\nDigite quanto você deseja depositar: ");
                    deposito = scanner.nextDouble();

                    if (deposito > 0 ){
                        saldo += deposito;
                        System.out.println("\nValor depositado com sucesso!");
                    } else {
                        System.out.println("\nFaça um depósito válido!");
                    }
                    break;

                case 3:
                    System.out.print("\nDigite quanto você deseja sacar: ");
                    saque = scanner.nextDouble();

                    if (saque <= saldo && saque > 0) {
                        saldo -= saque;
                        System.out.println("\nSaque efetuado com sucesso!");
                    } else {
                        System.out.println("\nFaça um saque válido!");
                    }
                    break;

                case 4:
                    System.out.print("\nEscolha para qual moeda você deseja converter: \n1- Dólar\n2- Euro\nDigite: ");
                    opcoesCambio = scanner.nextByte();

                    switch (opcoesCambio) {
                        case 1:
                            double valorDolar = saldo/5.26;
                            String formatadoDolar = String.format("%.2f", valorDolar);
                            System.out.println("\nSeu saldo convertido em dólar é: " + formatadoDolar);
                            break;

                        case 2:
                            double valorEuro = saldo/6.20;
                            String formatadoEuro = String.format("%.2f", valorEuro);
                            System.out.println("\nSeu saldo convertido em euro é: " + formatadoEuro);
                            break;
                    }

                    break;

                case 5:
                    System.out.println("\nSaindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente!");
                    break;

            }
        }
    }
}