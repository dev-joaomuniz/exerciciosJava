package br.com.sistemaRh.domain;

import java.util.ArrayList;

public class Funcionario {
    // Requisitos:
    // Atributos: nome, salário, id (único), departamento
    // contador de funcionários em um metodo static
    // Bloco de inicialização para o começo do contador de Id
    // Metodo de instância para exibir dados do funcionário
    // Metodo estático para exibir relatório da empresa (exibe quantos funcionários tem)

    private String nome;
    private String departamento;
    private double salario;
    private int id;
    static int contadorId;
    static int totalFuncionarios;
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    static {
        contadorId = 1;
        totalFuncionarios = 0;
    }

    public Funcionario(String nome, double salario, String departamento) {
        if (salario > 0) {
            this.salario = salario;
            this.nome = nome;
            this.departamento = departamento;
            this.id = contadorId;
            contadorId ++;
            totalFuncionarios ++;
            listaFuncionarios.add(this);
            System.out.println("Funcionário Cadastrado com sucesso!");
            return;
        }
        System.out.println("Funcionário não cadastrado. Salário inválido!");
    }

    public Funcionario() {

    }

    public static void exibirDadosFuncionario(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id) {
                System.out.println("\n--- Informações do Funcionário ---");
                System.out.println("Nome: " + funcionario.nome);
                System.out.println("Salário " + funcionario.salario);
                System.out.println("Id: " + funcionario.id);
                return;
            }
        }
        System.out.println("\nEste id ainda não foi cadastrado!");
    }

    public static void excluirFuncionario(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id) {
                listaFuncionarios.remove(funcionario);
                totalFuncionarios --;
                System.out.println("\nFuncionário excluído com sucesso!");
                return;
            }
        }
        System.out.println("\nFuncionário não encontrado no sistema!");
    }

    public static int exibirTotalFuncionarios() {
        return totalFuncionarios;
    }

    public int getId() {
        return id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
        System.out.println("\nDepartamento alterado com sucesso!");
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
            System.out.println("\nSalário atualizado com sucesso!");
            return;
        }
        System.out.println("\nSalário inválido!");
    }

}
