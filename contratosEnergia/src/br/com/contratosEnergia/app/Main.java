package br.com.contratosEnergia.app;

import br.com.contratosEnergia.domain.Contrato;
import br.com.contratosEnergia.domain.ValidarContrato;

public class Main {
    public static void main(String[] args) {
        // Deve ter um metodo que recebe contrato e validadorContrato
        // Esse metodo deve executar o metodo validar
        // Metodo deve ser chamado usando lambda para validar se é maior que zero
        // ou está dentro de um limite social
        // Validação Social: Aprova se o valor for menor que 150.0
        // Validação de Erro: Aprova se o valor for maior que 0
        // Validação de Luxo: Aprova se o valor for maior que 1000.0

        Contrato contrato = new Contrato("1234-5678", "José", 149);

        ValidarContrato validacaoSocial = (valor) -> valor <  150 && valor > 0;
        ValidarContrato validacaoDeErro = (valor) -> valor > 0;
        ValidarContrato validacaoDeLuxo = (valor) -> valor > 1000;

        boolean validacao = false;

        System.out.println("Validação de erro:");
        analisarContrato(contrato, validacaoDeErro);

        System.out.println("Validação Social:");
        analisarContrato(contrato, validacaoSocial);

        System.out.println("Validação de luxo:");
        analisarContrato(contrato, validacaoDeLuxo);

    }

    public static void analisarContrato(Contrato contrato, ValidarContrato validarContrato) {
        if (validarContrato.validar(contrato.valorConsumo())) {
            System.out.println("Contrato Aprovado!\n");
        } else {
            System.out.println("Contrato Negado!\n");
        }
    }

}
