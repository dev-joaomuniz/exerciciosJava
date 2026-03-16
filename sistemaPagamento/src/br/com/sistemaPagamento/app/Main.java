package br.com.sistemaPagamento.app;

import br.com.sistemaPagamento.domain.Pagamento;
import br.com.sistemaPagamento.domain.PagamentoBoleto;
import br.com.sistemaPagamento.domain.PagamentoCartao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deve ter lista com tipos de pagamento do tipo genérico,
        // metodo deve ser chamado ser saber o tipo específico.

        Pagamento pagamento1 = new PagamentoBoleto();
        Pagamento pagamento2 = new PagamentoCartao();

        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);

        System.out.println(pagamentos.get(0).calcularValor(100));

        System.out.println("------------------------");

        System.out.println(pagamentos.get(1).calcularValor(100));

    }
}
