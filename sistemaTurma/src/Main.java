import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dois arrays, um para a nota e outro para o nome
        // Switch case para escolhas de opções
        // If/else para validação de notas

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        byte opcoes = 0;

        while (true) {
            System.out.print("\nEscolha uma opção: \n \n1 - Adicionar aluno \n2 - Listar alunos \n3 - Ver média da turma \n4 - Sair \nDigite: ");
            opcoes = scanner.nextByte();

            scanner.nextLine(); // Consumir a quebra de linha pendente

            switch (opcoes) {
                case 1:
                    String nome;
                    System.out.println("\nDigite o nome do aluno:");
                    nome = scanner.nextLine();
                    alunos.add(nome);

                    System.out.println("Digite a nota do aluno:");
                    Double nota = scanner.nextDouble();
                    notas.add(nota);

                    String resultado = nota >= 7 ? "Aluno aprovado!"
                            : nota >= 4 ? "Aluno em recuperação!"
                            : "Aluno Reprovado!";

                    System.out.println(resultado);
                    break;
                case 2:
                    // Se não tiver alunos cadastrados
                    if (alunos.isEmpty()){
                        System.out.println("\nNão há nenhum aluno cadastrado ainda!");
                    } else {
                        System.out.println("\nLista de Alunos:");
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println("\nAluno: " + alunos.get(i) + " \nNota: " + notas.get(i));
                        }
                    }
                    break;
                case 3:
                    // Se não tiver notas cadastradas
                    if (notas.isEmpty()){
                        System.out.println("\nNão há nenhum aluno cadastrado ainda!");
                    } else {
                        float somaNotas = 0;
                        for (Double n : notas) {
                            somaNotas += n;
                        }
                        float media = somaNotas / notas.size();
                        System.out.println("\nMédia da turma: " + media);
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }

        }

    }
}