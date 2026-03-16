package br.com.sistemaPagamento.domain;

public class PagamentoCartao extends Pagamento {
    // estende Pagamento e implementa metodo abstrato
    // PagamentoCartao deve ter aumento de 5%

    @Override
    public final double calcularValor(double valorBase) {
        System.out.println("Calculando valor total no Cartão...");
        return valorBase + (valorBase * 0.05);
    }

}
